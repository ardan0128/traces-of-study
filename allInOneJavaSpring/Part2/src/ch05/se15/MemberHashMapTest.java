package ch05.se15;

public class MemberHashMapTest {
  public static void main(String[] args) {
    MemberHashMap memberHashMap = new MemberHashMap();

    Member member1 = new Member(10001, "이순신");
    Member member2 = new Member(10002, "김유신");
    Member member3 = new Member(10003, "강감찬");
    Member member4 = new Member(10003, "홍길동");

    memberHashMap.addMember(member1);
    memberHashMap.addMember(member2);
    memberHashMap.addMember(member3);
    memberHashMap.addMember(member4);

    memberHashMap.showAllMember();
  }
}
