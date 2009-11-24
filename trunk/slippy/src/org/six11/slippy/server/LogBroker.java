package org.six11.slippy.server;

import java.io.File;
import java.io.FileFilter;
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
 * 
 *
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public class LogBroker extends HttpServlet {

  public static FileFilter logFilter;
  static {
    logFilter = new FileFilter() {
      public boolean accept(File pathname) {
        return pathname.getName().endsWith(".log");
      }
    };
  }

  /**
   * 
   */
  public LogBroker() {
  }
  
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
  IOException {
    String cmdString = getCommandString(req);
    if (cmdString != null && cmdString.endsWith(".log")) {
      File requestedFile = new File(getBase(), cmdString);
      if (requestedFile.exists() && requestedFile.canRead()) {
        resp.setContentType("text/plain");
        resp.setContentLength((int) requestedFile.length());
        StreamUtil.writeFileToOutputStream(requestedFile, resp.getOutputStream());
      } else {
        resp.sendError(404, cmdString + " not found");
      }
    } else {
      // give a list of log files
      SortedSet<String> fileStrings = getFileStrings();
      req.setAttribute("fileNames", fileStrings);
      ServletContext context = getServletContext();
      try {
        context.getRequestDispatcher("/listLogs.jsp").forward(req, resp);
      } catch (ServletException ex) {
        ex.printStackTrace();
      }
    }
  }
  
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
  IOException {
    String logContents = URLDecoder.decode(StreamUtil
        .inputStreamToString(req.getInputStream()), "UTF-8");
    bug("Got log:\n" + logContents);
    File file = new File(getBase(), System.currentTimeMillis() + ".log");
    if (!file.exists()) {
      file.getParentFile().mkdirs();
      file.createNewFile();
    }
    if (file.exists() && file.canWrite()) {
      FileWriter fw = new FileWriter(file);
      fw.write(logContents);
      fw.close();
      bug("Wrote " + logContents.length() + " bytes to " + file.getAbsolutePath());
      resp.setContentType("text/plain");
      resp.setContentLength(file.getName().length());
      StreamUtil.writeStringToOutputStream(file.getName(), resp.getOutputStream());
    }
  }
  
  private SortedSet<String> getFileStrings() {
    File base = getBase();
    File[] logFiles = base.listFiles(logFilter);
    bug("Found " + logFiles.length + " files in " + getBase());
    SortedSet<String> fileNameStrings = new TreeSet<String>(Comparators.STRING_REVERSE);
    for (File f : logFiles) {
      fileNameStrings.add(f.getName());
    }
    bug("Returning set of " + fileNameStrings.size() + " file names");
    return fileNameStrings;
  }
  
  protected File getBase() {
    File f = new File("/var/slippy-logs"); // TODO: make this a servlet parameter
    if (!f.exists()) {
      f.mkdirs();
    }
    return f;
  }

  public String getCommandString(HttpServletRequest req) {
    String command = req.getPathInfo();
    if (command == null || command.equals("/")) {
      command = null;
    } else if (command.startsWith("/")) {
      command = command.substring(1);
    }
    return command;
  }

  private static void bug(String what) {
    Debug.out("LogBroker", what);
  }
}
