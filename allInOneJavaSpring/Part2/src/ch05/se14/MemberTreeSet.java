package ch05.se14;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
  private TreeSet<MemberComparable> memberTreeSet;

  public MemberTreeSet() {
    memberTreeSet = new TreeSet<>();
  }

  public void addMember(MemberComparable member) {
    memberTreeSet.add(member);
  }

  public boolean removeMember(int memberId) {
    Iterator<MemberComparable> ir = memberTreeSet.iterator();

    while (ir.hasNext()) {
      MemberComparable member = ir.next();

      int tempId = member.getMemberId();

      if (tempId == memberId) {
        memberTreeSet.remove(member);

        return true;
      }
    }

    System.out.println(memberId + " 가 존재하지 않습니다.");

    return false;
  }

  public void showAllMember() {
    for (MemberComparable member : memberTreeSet) {
      System.out.println(member);
    }

    System.out.println();
  }
}
