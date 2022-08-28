package ch03.se06;

public class VipCustomer extends Customer {
  double salesRatio;
  private String agentId;

  public VipCustomer(int customerId, String customerName) {
    super(customerId, customerName);

    customerGrade = "VIP";
    bonusRatio = 0.05;
    salesRatio = 0.1;
  }

  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  @Override
  public int calcPrice(int price) {
    bonusPoint += price * bonusRatio;

    return price -= (int) (price * salesRatio);
  }
}
