package ch06.se20;

/**
 * MyThread
 */
class MyThread extends Thread {
  public void run() {
    int i;

    for (i = 1; i <= 200; i++) {
      System.out.print(i + " ");
    }
  }
}

/**
 * MyRunnable
 */
class MyRunnable implements Runnable {

  @Override
  public void run() {
    int i;

    for (i = 1; i <= 200; i++) {
      System.out.print(i + " ");
    }
  }
}

public class ThreadTest {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread() + " start");
    MyThread mt1 = new MyThread();
    MyRunnable mr = new MyRunnable();
    Thread thread = new Thread(mr);

    System.out.println();
    mt1.start();
    thread.start();

    System.out.println(Thread.currentThread() + " end");

    Runnable run = new Runnable() {

      @Override
      public void run() {
        System.out.println("run");

      }

    };

    run.run();
  }
}
