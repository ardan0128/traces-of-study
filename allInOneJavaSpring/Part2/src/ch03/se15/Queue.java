package ch03.se15;

public interface Queue {
  void enQueue(String title);

  String deQueue();

  int getSize();
}
