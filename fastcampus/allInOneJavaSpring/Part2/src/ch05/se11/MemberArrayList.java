package ch05.se11;

import java.util.ArrayList;

public class MemberArrayList {
  private ArrayList<Member> memberList;

  public MemberArrayList() {
    memberList = new ArrayList<>();
  }

  public MemberArrayList(int size) {
    memberList = new ArrayList<>(size);
  }

  public void addMember(Member member) {
    memberList.add(member);
  }

  public boolean removeMember(int memberId) {
    for (int i = 0; i < memberList.size(); i++) {
      Member member = memberList.get(i);
      int tempId = member.getMemberId();

      if (tempId == memberId) {
        memberList.remove(i);

        return true;
      }
    }

    System.out.println(memberId + " 가 존재하지 않습니다.");

    return false;
  }

  public void showAllMember() {
    for (Member member : memberList) {
      System.out.println(member);
    }

    System.out.println();
  }
}
