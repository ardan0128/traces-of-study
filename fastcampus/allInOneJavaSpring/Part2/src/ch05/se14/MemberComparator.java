package ch05.se14;

import java.util.Comparator;

public class MemberComparator implements Comparator<MemberComparator> {
  private int memberId;
  private String memberName;

  public MemberComparator() {
  }

  public MemberComparator(int memberId, String memberName) {
    this.memberId = memberId;
    this.memberName = memberName;
  }

  public int getMemberId() {
    return memberId;
  }

  public void setMemberId(int memberId) {
    this.memberId = memberId;
  }

  public String getMemberName() {
    return memberName;
  }

  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof MemberComparator) {
      MemberComparator member = (MemberComparator) obj;

      if (this.memberId == member.memberId) {
        return true;
      } else {
        return false;
      }
    }

    return false;
  }

  @Override
  public int hashCode() {
    return memberId;
  }

  @Override
  public String toString() {
    return memberName + " 회원님의 아이디는 " + memberId + " 입니다.";
  }

  @Override
  public int compare(MemberComparator member1, MemberComparator member2) {
    return (member1.memberId - member2.memberId);
  }

}
