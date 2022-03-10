package ch03.se16.scheduler;

import java.io.IOException;

public class SchedulerTest {
  public static void main(String[] args) throws IOException {
    System.out.println("전화 상담원 할당 방식을 선택하세요");
    System.out.println("1 : 한명씩 차례대로");
    System.out.println("2 : 대기가 적은 상담원 우선");
    System.out.println("3 : 우선순위가 높은 고객우선 숙련도 높은 상담원");

    int ch = System.in.read();

    Scheduler scheduler = null;

    if (ch == 82 || ch == 114) {
      scheduler = new RoundRobin();
    } else if (ch == 76 || ch == 108) {
      scheduler = new LeastJob();
    } else if (ch == 80 || ch == 112) {
      scheduler = new PriorityAllocation();
    } else {
      System.out.println("지원하지 않는 기능입니다.");
      return;
    }

    scheduler.getNextCall();
    scheduler.sendCallToAgent();
  }
}
