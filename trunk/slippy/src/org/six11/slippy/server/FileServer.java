package org.six11.slippy.server;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.six11.util.Debug;
import org.six11.util.io.StreamUtil;

/**
 * A simple servlet that allows clients to save and download sketch data.
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public class FileServer extends HttpServlet {

  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
      IOException {
    resp.sendError(HttpServletResponse.SC_NOT_FOUND);
  }

  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
      IOException {
    try {
      bug("Handling post...");
      String command = getCommandString(req);
      if (command == null) {
        resp.sendError(HttpServletResponse.SC_NO_CONTENT);
      } else if (command.startsWith("save")) {
        String fileName = null;
        int idx = command.indexOf('/');
        if (idx > 0 && idx + 1 < command.length()) {
          fileName = command.substring(idx + 1);
        }
        if (fileName == null) {
          resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "No file name specified.");
        } else {
          File destFile = new File(getBase(), fileName);
          if (!destFile.exists()) {
            destFile.getParentFile().mkdirs();
            destFile.createNewFile();
          }
          InputStream userDataStream = req.getInputStream();
          if (destFile.exists() && destFile.canWrite()) {
            bug("Writing to " + destFile.getAbsolutePath());
            FileOutputStream fout = new FileOutputStream(destFile);
            StreamUtil.writeInputStreamToOutputStream(userDataStream, fout);
            fout.close();
            resp.setContentType("text/plain");
            resp.setContentLength("OK".length());
            StreamUtil.writeStringToOutputStream("OK", resp.getOutputStream());
          }
        }
      } else {
        bug("Huh? You said: " + command);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  protected File getBase() {
    File f = new File("/var/pdfs"); // TODO: make this a servlet parameter
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
    Debug.out("FileServer", what);
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
