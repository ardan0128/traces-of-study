package ch06.se10;

public class PasswordExceptionTest {
  private String password;

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) throws PasswordException {
    if (password == null) {
      throw new PasswordException("비밀번호는 null이 될 수 없습니다.");
    } else if (password.length() < 5) {
      throw new PasswordException("비밀번호는 5자리 이상이어야 합니다.");
    } else if (password.matches("[a-zA-Z]+")) {
      throw new PasswordException("비밀번호는 숫자와 특수문자가 포함되어야 합니다.");
    }

    this.password = password;
  }

  public static void main(String[] args) {
    PasswordExceptionTest test = new PasswordExceptionTest();

    String password = null;

    try {
      test.setPassword(password);
      System.out.println("오류 없음1");
    } catch (PasswordException e) {
      e.printStackTrace();
    }

    password = "abc";

    try {
      test.setPassword(password);
      System.out.println("오류 없음2");
    } catch (PasswordException e) {
      e.printStackTrace();
    }

    password = "abcde";

    try {
      test.setPassword(password);
      System.out.println("오류 없음3");
    } catch (PasswordException e) {
      e.printStackTrace();
    }

    password = "abc123!";

    try {
      test.setPassword(password);
      System.out.println("오류 없음4");
    } catch (PasswordException e) {
      e.printStackTrace();
    }
  }
}
