package ch02.se16;

public class EmployeeTest {
  public static void main(String[] args) {
    Employee employeeLee = new Employee();
    employeeLee.setEmployeeName("이순신");

    // System.out.println(employeeLee.serialNum);
    // static 변수는 이렇게 사용하는게 맞다
    // System.out.println(Employee.serialNum);

    // static 변수는 외부에 접근할 수 없게 만들어야하고 할당할 수도 없어야 한다.
    System.out.println(Employee.getSerialNum());

    Employee employeeKim = new Employee();
    employeeKim.setEmployeeName("김유신");

    System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId() + " 입니다.");
    System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId() + " 입니다.");
  }
}
