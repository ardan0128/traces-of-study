package ch05.se13;

public class MemberHashSetTest {
  public static void main(String[] args) {
    MemberHashSet memberHashSet = new MemberHashSet();

    Member member1 = new Member(10001, "이순신");
    Member member2 = new Member(10002, "김유신");
    Member member3 = new Member(10003, "강감찬");
    Member member4 = new Member(10003, "홍길동");

    memberHashSet.addMember(member1);
    memberHashSet.addMember(member2);
    memberHashSet.addMember(member3);
    memberHashSet.addMember(member4);

    memberHashSet.showAllMember();
  }
}
