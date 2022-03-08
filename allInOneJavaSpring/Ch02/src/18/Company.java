package ch18;

public class Company {
  private static Company instCompany = new Company();

  private Company() {
  }

  public static Company getInstCompany() {
    // 혹시라도 instCompany가 null일 경우, 생성하는 코드
    if (instCompany == null) {
      instCompany = new Company();
    }

    return instCompany;
  }
}
