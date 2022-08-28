package ch02.se18;

// import java.util.Calendar;

public class CompanyTest {
  public static void main(String[] args) {
    // static 메서드는 바로 호출이 가능하다.
    Company company1 = Company.getInstCompany();
    Company company2 = Company.getInstCompany();

    System.out.println(company1);
    System.out.println(company2);

    // Company와 같은 방법
    // Calendar calendar = Calendar.getInstance();
  }
}
