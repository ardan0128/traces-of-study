package ch05.se12;

import java.util.ArrayList;
import java.util.Iterator;

import ch05.se11.Member;

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
    Iterator<Member> ir = memberList.iterator();

    while (ir.hasNext()) {
      Member member = ir.next();

      int tempId = member.getMemberId();

      if (tempId == memberId) {
        memberList.remove(member);

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
