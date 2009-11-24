package org.six11.slippy.server;

import java.io.*;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.six11.slippy.SlippyHtmlSyntaxColorizer;
import org.six11.util.Debug;
import org.six11.util.io.StreamUtil;

/**
 * 
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public class SlippyCodeBroker extends HttpServlet {

  public static final String NOT_FOUND_MSG = //
  "Make sure you are requesting a fully qualified class using dot-notation"
      + " and not using a .slippy extension. So 'org.mypeople.MyThing' is"
      + " correct, but 'org/mypeople/MyThing' and 'org.mypeople.MyThing.slippy'"
      + " are both wrong";

  /**
   * 
   */
  public SlippyCodeBroker() {

  }

  private void bug(String what) {
    Debug.out("SlippyCodeBroker", what);
  }

  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
      IOException {
    String c1 = req.getPathInfo();
    String command = null;
    if (c1.length() > 1) {
      command = c1.substring(1);
    }
    if (command == null || command.indexOf('/') < 0) {
      resp.sendError(HttpServletResponse.SC_BAD_REQUEST,
          "Malformed command string. Try a URL such as "
              + "http://foo.com/olive/code/request/org.mypeople.MyThing");
    } else {
      int idx = command.indexOf('/');
      String action = command.substring(0, idx);
      String fqClass = command.substring(idx + 1);
      String classFileName = fqClass.replace('.', File.separatorChar) + ".slippy";
      if (action.equals("request")) {
        doRequest(classFileName, resp);
      } else if (action.equals("view")) {
        doView(classFileName, resp);
      } else if (action.equals("save")) {
        doSave(classFileName, req.getInputStream());
      } else if (action.equals("list")) {
        if (req.getParameter("html") != null) {
          doHtmlList(req, resp);
        } else {
          doList(resp);
        }
      } else {
        bug("Unknown action type: '" + action + "'");
      }

    }
  }

  private void doRequest(String classFileName, HttpServletResponse resp) throws IOException {
    File classFile = getExistingFile(classFileName);
    if (classFile.exists()) {
      StreamUtil.writeFileToOutputStream(classFile, resp.getOutputStream());
      bug("Handled request for " + classFileName + " (" + classFile.length() + " bytes)");
    } else {
      resp.sendError(HttpServletResponse.SC_NOT_FOUND, NOT_FOUND_MSG);
    }
  }

  private void doView(String classFileName, HttpServletResponse resp) throws IOException {
    File classFile = getExistingFile(classFileName);
    boolean success = false;
    if (classFile.exists()) {
      SlippyHtmlSyntaxColorizer colorizer = new SlippyHtmlSyntaxColorizer();
      String htmlString;
      String colorFile = this.getInitParameter("colors");
      try {
        if (colorFile != null && colorFile.length() > 0) {
          colorizer.setStyleProperties(colorFile);
        }
        htmlString = colorizer.walk(classFile.getAbsolutePath(), true);
        resp.setContentType("text/html");
        resp.setContentLength(htmlString.length());
        StreamUtil.writeStringToOutputStream(htmlString, resp.getOutputStream());
        bug("Handled view request for " + classFileName + " (" + classFile.length() + " bytes)");
        success = true;
      } catch (FileNotFoundException ex) {
        bug("Warning: colorizer properties file does not exist: " + colorFile);
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }
    if (!success) {
      resp.sendError(HttpServletResponse.SC_NOT_FOUND, NOT_FOUND_MSG);
    }
  }

  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
      IOException {
    doGet(req, resp);
  }

  protected void doSave(String classFileName, InputStream in) throws IOException {
    String programString = URLDecoder.decode(StreamUtil.inputStreamToString(in), "UTF-8");
    File base = getBase();
    File target = new File(base, classFileName);
    if (detectFishiness(base, target)) {
      throw new RuntimeException("Fishiness detected: fileName is " + classFileName);
    }
    boolean pleaseSvnAdd = false;
    if (!target.exists()) {
      bug("File '" + target.getAbsolutePath()
          + "' does not exist. Creating it and adding it to SVN.");
      target.getParentFile().mkdirs();
      target.createNewFile();
      pleaseSvnAdd = true;
    }
    if (target.exists() && target.canWrite()) {
      FileWriter fw = new FileWriter(target);
      fw.write(programString);
      fw.close();
      bug("Wrote " + programString.length() + " bytes to " + target.getAbsolutePath());
    }
    if (pleaseSvnAdd) {
      SvnUtil.instance.add(target);
    }
  }

  protected void doHtmlList(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    File base = getBase();
    StringBuilder buf = new StringBuilder(); // not actually used.
    List<String> files = listFiles(base, buf, ".slippy", base.getCanonicalPath()
        + File.separatorChar);
    bug("Found " + files.size() + " files.");
    req.setAttribute("files", files);
    ServletContext context = getServletContext();
    try {
      context.getRequestDispatcher("/listClasses.jsp").forward(req, resp);
    } catch (ServletException ex) {
      ex.printStackTrace();
    }
  }

  protected void doList(HttpServletResponse resp) throws IOException {
    File base = getBase();
    StringBuilder buf = new StringBuilder();
    listFiles(base, buf, ".slippy", base.getCanonicalPath() + File.separatorChar);
    StreamUtil.writeStringToOutputStream(buf.toString(), resp.getOutputStream());
  }

  protected List<String> listFiles(File dir, StringBuilder buf, String extension, String removeMe)
      throws IOException {
    List<String> files = new ArrayList<String>();
    for (File child : dir.listFiles()) {
      if (child.isDirectory()) {
        files.addAll(listFiles(child, buf, extension, removeMe));
      } else if (child.isFile() && child.getName().endsWith(extension)) {
        String path = child.getCanonicalPath();
        path = path.substring(removeMe.length());
        path = path.substring(0, path.length() - extension.length());
        path = path.replace(File.separatorChar, '.');
        files.add(path);
        buf.append(path + "\n");
      }
    }
    return files;
  }

  protected boolean detectFishiness(File base, File target) throws IOException {
    boolean fishy = true;
    if (target.getCanonicalPath().startsWith(base.getCanonicalPath())) {
      File cursor = target;
      while (cursor != null) {
        if (cursor.getCanonicalPath().equals(base.getCanonicalPath())) {
          fishy = false;
          break;
        }
        cursor = cursor.getParentFile();
      }
    }
    return fishy;
  }

  protected File getBase() {
    File f = new File("/var/slippy-code"); // TODO: make this a servlet parameter
    if (!f.exists()) {
      f.mkdirs();
    }
    return f;
  }

  protected File getExistingFile(String fileName) {
    File base = getBase();
    return new File(base, fileName);
  }
}
