package ch05.se14;

/**
 * Member
 */
public class MemberComparable implements Comparable<MemberComparable> {

  private int memberId;
  private String memberName;

  public MemberComparable(int memberId, String memberName) {
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
    if (obj instanceof MemberComparable) {
      MemberComparable member = (MemberComparable) obj;

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
  public int compareTo(MemberComparable member) {
    if (this.memberId > member.memberId) {
      return 1;
    } else if (this.memberId < member.memberId) {
      return -1;
    } else {
      return 0;
    }

    // return (this.memberId - member.memberId);
  }
}