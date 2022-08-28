package ch05.se14;

import java.util.TreeSet;

public class MemberTreeSetTest {
  public static void main(String[] args) {
    TreeSet<String> treeSet = new TreeSet<>();
    treeSet.add("홍길동");
    treeSet.add("이순신");
    treeSet.add("김유신");
    treeSet.add("강감찬");
    treeSet.add("장보고");

    System.out.println(treeSet);

    MemberTreeSet memberTreeSet = new MemberTreeSet();
    MemberComparable member1 = new MemberComparable(10001, "이순신");
    MemberComparable member2 = new MemberComparable(10002, "김유신");
    MemberComparable member3 = new MemberComparable(10003, "강감찬");
    MemberComparable member4 = new MemberComparable(10004, "홍길동");

    memberTreeSet.addMember(member1);
    memberTreeSet.addMember(member2);
    memberTreeSet.addMember(member3);
    memberTreeSet.addMember(member4);

    memberTreeSet.showAllMember();
  }
}
