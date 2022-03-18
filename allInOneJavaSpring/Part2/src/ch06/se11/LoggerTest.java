package ch06.se11;

public class LoggerTest {
  public static void main(String[] args) {
    MyLogger logger = MyLogger.getLogger();
    logger.log("log test");
  }
}
