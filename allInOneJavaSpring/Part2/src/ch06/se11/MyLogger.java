package ch06.se11;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
  Logger logger = Logger.getLogger("myLogger");

  private static MyLogger instance = new MyLogger();

  private static final String errorLog = "log.txt";
  private static final String warningLog = "warning.txt";
  private static final String fineLog = "fine.txt";

  private FileHandler logFile = null;
  private FileHandler warningFile = null;
  private FileHandler fineFile = null;

  private MyLogger() {
    try {
      logFile = new FileHandler(errorLog, true);
      warningFile = new FileHandler(warningLog, true);
      fineFile = new FileHandler(fineLog, true);
    } catch (SecurityException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    logFile.setFormatter(new SimpleFormatter());
    warningFile.setFormatter(new SimpleFormatter());
    fineFile.setFormatter(new SimpleFormatter());

    logger.setLevel(Level.ALL);
    warningFile.setLevel(Level.WARNING);
    fineFile.setLevel(Level.FINE);

    logger.addHandler(logFile);
    logger.addHandler(warningFile);
    logger.addHandler(fineFile);
  }

  public static MyLogger getLogger() {
    return instance;
  }

  public void log(String msg) {
    logger.finest(msg);
    logger.finer(msg);
    logger.fine(msg);
    logger.config(msg);
    logger.info(msg);
    logger.warning(msg);
    logger.severe(msg);
  }

  public void fine(String msg) {
    logger.fine(msg);
  }

  public void warning(String msg) {
    logger.warning(msg);
  }
}