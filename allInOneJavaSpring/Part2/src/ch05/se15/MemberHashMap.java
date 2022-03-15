package ch05.se15;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
  private HashMap<Integer, Member> memberHashMap;

  public MemberHashMap() {
    memberHashMap = new HashMap<>();
  }

  public void addMember(Member member) {
    memberHashMap.put(member.getMemberId(), member);
  }

  public boolean removeMember(int memberId) {
    if (memberHashMap.containsKey(memberId)) {
      memberHashMap.remove(memberId);
    }

    System.out.println("no element");

    return false;
  }

  public void showAllMember() {
    Iterator<Integer> ir = memberHashMap.keySet().iterator();

    while (ir.hasNext()) {
      int key = ir.next();
      Member member = memberHashMap.get(key);

      System.out.println(member);
    }
  }
}
