package ch03.se02;

public class VipCustomer extends Customer {
  double salesRatio;
  private String agentId;

  public VipCustomer() {
    bonusRatio = 0.05;
    salesRatio = 0.1;
    customerGrade = "VIP";
  }

  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }
}
