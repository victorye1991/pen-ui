package org.six11.slippy.server;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.six11.util.Debug;
import org.six11.util.io.StreamUtil;
import org.six11.util.thread.ProcessWatcher;

/**
 * 
 * 
 * @author Gabe Johnson <johnsogg@cmu.edu>
 */
public class SvnUtil extends HttpServlet {

  private static void bug(String what) {
    Debug.out("SvnUtil", what);
  }

  static SvnUtil instance;
  private String baseDir;
  private String username;
  private String password;
  private String svnCommand;
  private long timeout;
  
  public SvnUtil() {
    super();
    instance = this;
  }

  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
      IOException {
    String what = getCommandString(req);
    if (what.equals("update")) {
      bug("doGet got update...");
      update();
      bug("Called update.");
    } else if (what.equals("status")) {
      String statusString = status();
      resp.setContentLength(statusString.length());
      StreamUtil.writeStringToOutputStream(statusString, resp.getOutputStream());
      resp.getOutputStream().close();
    }
  }

  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
      IOException {
    String what = getCommandString(req);
    bug("Got doPost: " + what);
    if (what.equals("commit")) {
      String msg = URLDecoder.decode(StreamUtil.inputStreamToString(req.getInputStream()), "UTF-8");
      if (msg == null) {
        msg = "";
      }
      bug("doPost got commit with message of " + msg.length() + " bytes");
      if (msg.length() > 0) {
        commit(msg);
        bug("Called commit.");
      }
    }
  }

  public void init() {
    this.baseDir = getInitParameter("baseDir");
    this.timeout = Long.parseLong(getInitParameter("timeout"));
    String svnPath = getInitParameter("svnCommand");
    String svnCred = getInitParameter("svnCredentialsFile");
    Properties props = new Properties();
    boolean ok = false;
    try {
      props.load(new FileInputStream(svnCred));
      this.username = props.getProperty("username");
      this.password = props.getProperty("password");
      this.svnCommand = svnPath + " --username " + username + " --password " + password + " ";
      ok = username != null && password != null;
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    if (!ok) {
      bug("You need an svn credentials file. It is a simple Java properties file and must");
      bug("have values for 'username' and 'password' for the subversion repository. Subversion");
      bug("operations like updating and committing will not work, though everything else should.");
    }
  }

  /**
   * Returns the string following the "svn" part of the url. It won't return null, but it might
   * return "". Example: "host.com/olive/svn/update" returns "update".
   */
  public String getCommandString(HttpServletRequest req) {
    String command = req.getPathInfo();
    if (command == null || command.equals("/")) {
      command = "";
    } else if (command.startsWith("/")) {
      command = command.substring(1);
    }
    if (command.endsWith("/")) {
      command = command.substring(0, command.length() - 1);
    }
    return command;
  }

  public void update() {
    try {
      final String cmd = svnCommand + "update";
      Runnable timeoutSiren = new Runnable() {
        public void run() {
          bug(cmd + ": timeout reached. Sorry.");
        }
      };
      Process proc = Runtime.getRuntime().exec(cmd, null, new File(baseDir));
      new ProcessWatcher(proc, timeout, ProcessWatcher.getDiagnostic(proc), ProcessWatcher
          .getDiagnostic(proc), timeoutSiren);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public void add(File f) {
    String fileName = f.getAbsolutePath();
    try {
      final String cmd = svnCommand + " add --parents " + fileName;
      bug("Issuing subversion command: " + cmd);
      Runnable timeoutSiren = new Runnable() {
        public void run() {
          bug(cmd + ": timeout reached while adding file. Sorry.");
        }
      };
      Process proc = Runtime.getRuntime().exec(cmd, null, new File(baseDir));
      new ProcessWatcher(proc, timeout, ProcessWatcher.getDiagnostic(proc), ProcessWatcher
          .getDiagnostic(proc), timeoutSiren);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public void commit(String message) {
    boolean ok = false;
    String fileName = null;
    try {
      File tmpFile = File.createTempFile("slippy-svn-message", ".txt");
      fileName = tmpFile.getAbsolutePath();
      StreamUtil.writeStringToOutputStream(message, new FileOutputStream(tmpFile));
      bug("Wrote " + message.length() + " characters to " + fileName);
      ok = true;
    } catch (IOException ex1) {
      ex1.printStackTrace();
    }
    if (!ok) {
      return;
    }
    try {
      final String cmd = svnCommand + "--file " + fileName + " commit";
      bug("Issuing svn commit: " + cmd);
      Runnable timeoutSiren = new Runnable() {
        public void run() {
          bug(cmd + ": timeout reached. Sorry.");
        }
      };
      Process proc = Runtime.getRuntime().exec(cmd, null, new File(baseDir));
      new ProcessWatcher(proc, timeout, ProcessWatcher.getDiagnostic(proc), ProcessWatcher
          .getDiagnostic(proc), timeoutSiren);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public String status() {
    String cmd = svnCommand + "status";
    String result = null;
    try {
      final Process proc = Runtime.getRuntime().exec(cmd, null, new File(baseDir));
      int exitStatus = proc.waitFor();
      if (exitStatus == 0) {
        result = StreamUtil.inputStreamToString(proc.getInputStream());
      } else {
        bug("Failed to get svn status.");
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
    return result;
  }

  public String getBaseDir() {
    return baseDir;
  }

  public void setBaseDir(String baseDir) {
    this.baseDir = baseDir;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
