package ch03.se03;

public class VipCustomer extends Customer {
  double salesRatio;
  private String agentId;

  public VipCustomer(int customerId, String customerName) {
    super(customerId, customerName);

    customerGrade = "VIP";
    bonusRatio = 0.05;
    salesRatio = 0.1;

    System.out.println("VipCustomer(int, String) 생성자 호출");
  }

  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }
}
