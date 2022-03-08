package ch16;

public class Employee {
  private static int serialNum = 1000;

  private int employeeId;
  private String employeeName;
  private String department;

  public Employee() {
    serialNum++;
    employeeId = serialNum;
  }

  public static int getSerialNum() {
    // 메서드가 호출됐을때 해당 변수가 없을 수 있어서 에러가 발생한다.
    // static 메서드 안에서는 인스턴스 변수를 사용할 수 없다.
    // employeeName = "Lee";

    return serialNum;
  }

  public int getEmployeeId() {
    // 메모리에 이미 할당되어 있어서 사용할 수 있다.
    // serialNum = 1000;

    return employeeId;
  }

  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }
}
