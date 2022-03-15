package ch05.se14;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberComparatorTreeSet {
  private TreeSet<MemberComparator> memberTreeSet;

  public MemberComparatorTreeSet() {
    memberTreeSet = new TreeSet<MemberComparator>(new MemberComparator());
  }

  public void addMember(MemberComparator member) {
    memberTreeSet.add(member);
  }

  public boolean removeMember(int memberId) {
    Iterator<MemberComparator> ir = memberTreeSet.iterator();

    while (ir.hasNext()) {
      MemberComparator member = ir.next();

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
    for (MemberComparator member : memberTreeSet) {
      System.out.println(member);
    }

    System.out.println();
  }
}
