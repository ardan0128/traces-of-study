package ch05.se12;

import ch05.se11.Member;

public class MemberListTest {
  public static void main(String[] args) {
    MemberArrayList memberList = new MemberArrayList();

    memberList.addMember(new Member(10001, "이순신"));
    memberList.addMember(new Member(10002, "김유신"));
    memberList.addMember(new Member(10003, "강감찬"));
    memberList.addMember(new Member(10004, "홍길동"));

    memberList.showAllMember();

    memberList.removeMember(10002);

    memberList.showAllMember();
  }
}
