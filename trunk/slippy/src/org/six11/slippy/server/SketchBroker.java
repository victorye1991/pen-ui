package org.six11.slippy.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.six11.util.Debug;
import org.six11.util.adt.Comparators;
import org.six11.util.io.StreamUtil;

/**
 * A simple servlet that allows clients to save and download sketch data.
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public class SketchBroker extends HttpServlet {

  public static FileFilter sketchFilter;
  static {
    sketchFilter = new FileFilter() {
      public boolean accept(File pathname) {
        return pathname.getName().endsWith(".sketch");
      }
    };
  }

  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
      IOException {
    String sketchString = getCommandString(req);
    if (sketchString == null) {
      if (req.getParameter("html") != null) {
        listHtmlSketches(req, resp);
      } else {
        listSketches(req, resp);
      }
    } else if (sketchString.endsWith(".sketch")) {
      giveSketchData(sketchString.substring(0, sketchString.indexOf(".sketch")), req, resp);
    } else {
      resp.sendError(HttpServletResponse.SC_NOT_FOUND, sketchString);
    }
  }

  private void listHtmlSketches(HttpServletRequest req, HttpServletResponse resp)
      throws IOException {
    SortedSet<String> fileStrings = getFileStrings();
    req.setAttribute("ids", fileStrings);
    ServletContext context = getServletContext();
    try {
      context.getRequestDispatcher("/listSketches.jsp").forward(req, resp);
    } catch (ServletException ex) {
      ex.printStackTrace();
    }
  }

  private void listSketches(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    SortedSet<String> fileStrings = getFileStrings();
    int start = 0;
    int limit = Integer.MAX_VALUE;
    if (req.getParameter("start") != null) {
      start = Integer.parseInt(req.getParameter("start"));
    }
    if (req.getParameter("limit") != null) {
      limit = Integer.parseInt(req.getParameter("limit"));
    }
    StringBuilder buf = new StringBuilder();
    int numShown = 0;
    for (String s : fileStrings) {
      int idx = Integer.parseInt(s);
      if (idx >= start) {
        buf.append(s + "\n");
        numShown++;
      } else {
        bug("index " + idx + " isn't in the valid range quite yet. Hang on.");
      }
      if (numShown >= limit) {
        break;
      }
    }
    StreamUtil.writeStringToOutputStream(buf.toString(), resp.getOutputStream());
  }

  private SortedSet<String> getFileStrings() {
    File base = getBase();
    File[] sketchFiles = base.listFiles(sketchFilter);
    SortedSet<String> idStrings = new TreeSet<String>(Comparators.STRING_AS_NUMBERS);
    for (File f : sketchFiles) {
      idStrings.add(f.getName().substring(0, f.getName().indexOf(".sketch")));
    }
    return idStrings;
  }

  private void giveSketchData(String num, @SuppressWarnings("unused") HttpServletRequest req,
      HttpServletResponse resp) throws IOException {
    File sketchFile = getExistingFile(num + ".sketch");
    if (sketchFile.exists()) {
      resp.setContentType("text/plain");
      resp.setContentLength((int) sketchFile.length());
      StreamUtil.writeFileToOutputStream(sketchFile, resp.getOutputStream());
    } else {
      resp.sendError(HttpServletResponse.SC_NOT_FOUND, num + ".sketch");
    }
  }

  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
      IOException {
    try {
      String command = getCommandString(req);
      if (command == null) {
        resp.sendError(HttpServletResponse.SC_NO_CONTENT);
      } else if (command.equals("save") || command.equals("save/")) {
        String fileName = null;
        int idx = command.indexOf('/');
        if (idx > 0 && idx + 1 < command.length()) {
          fileName = command.substring(idx + 1);
          if (!fileName.endsWith(".sketch")) {
            fileName = fileName + ".sketch";
          }
        }
        if (fileName == null) {
          fileName = generateSketchFileName();
        }
        File sketchFile = new File(getBase(), fileName);
        if (!sketchFile.exists()) {
          sketchFile.getParentFile().mkdirs();
          sketchFile.createNewFile();
        }
        String sketchString = URLDecoder.decode(StreamUtil
            .inputStreamToString(req.getInputStream()), "UTF-8");
        if (sketchFile.exists() && sketchFile.canWrite()) {
          FileWriter fw = new FileWriter(sketchFile);
          fw.write(sketchString);
          fw.close();
          bug("Wrote " + sketchString.length() + " bytes to " + sketchFile.getAbsolutePath());
          resp.setContentType("text/plain");
          resp.setContentLength(fileName.length());
          StreamUtil.writeStringToOutputStream(fileName, resp.getOutputStream());
        }
      } else {
        bug("Huh? You said: " + command);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  protected String generateSketchFileName() throws IOException {
    File cheatSheet = new File(getBase(), "NEXT_ID");
    int nextID = 0;
    if (!cheatSheet.exists()) {
      cheatSheet.getParentFile().mkdirs();
      cheatSheet.createNewFile();
      writeLine(cheatSheet, "1");
    }
    if (!cheatSheet.canWrite()) {
      throw new RuntimeException("Can't write cheatsheet file: " + cheatSheet);
    }
    if (!cheatSheet.canRead()) {
      throw new RuntimeException("Can't read cheatsheet file: " + cheatSheet);
    }
    nextID = Integer.parseInt(readLine(cheatSheet));
    writeLine(cheatSheet, "" + (nextID + 1));
    String ret = nextID + ".sketch";
    File file = new File(getBase(), ret);
    if (file.exists()) {
      ret = generateSketchFileName();
    }
    return ret;
  }

  private void writeLine(File file, String val) throws IOException {
    FileWriter fw = new FileWriter(file);
    fw.write(val);
    fw.close();
  }

  private String readLine(File file) throws IOException {
    BufferedReader fr = new BufferedReader(new FileReader(file));
    return fr.readLine().trim();
  }

  protected File getBase() {
    File f = new File("/var/sketches"); // TODO: make this a servlet parameter
    if (!f.exists()) {
      f.mkdirs();
    }
    return f;
  }

  protected File getExistingFile(String fileName) {
    File base = getBase();
    return new File(base, fileName);
  }

  private static void bug(String what) {
    Debug.out("SketchBroker", what);
  }

  /**
   * Returns either null (if there was no sketch specified) or a string such as 1234.sketch.
   */
  public String getCommandString(HttpServletRequest req) {
    String command = req.getPathInfo();
    if (command == null || command.equals("/")) {
      command = null;
    } else if (command.startsWith("/")) {
      command = command.substring(1);
    }
    return command;
  }
}
