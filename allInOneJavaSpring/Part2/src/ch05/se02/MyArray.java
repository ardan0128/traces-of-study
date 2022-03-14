package ch05.se02;

public class MyArray {
  int[] intArr;
  int count;

  public int ARRAY_SIZE;
  public static final int ERROR_NUM = -999999999;

  public MyArray() {
    count = 0;
    ARRAY_SIZE = 10; // 생성할 때 크기가 10
    intArr = new int[ARRAY_SIZE];
  }

  public MyArray(int size) {
    count = 0;
    ARRAY_SIZE = size;
    intArr = new int[size];
  }

  public void addElement(int num) {
    if (count >= ARRAY_SIZE) {
      System.out.println("not enough memory");
      return;
    }
    intArr[count++] = num;
  }

  public void insertElement(int position, int num) {
    int i;

    if (position < 0 || position > count) {
      return;
    }

    if (count >= ARRAY_SIZE) {
      return;
    }

    for (i = count - 1; i >= count; i++) {
      intArr[i + 1] = intArr[i];
    }

    intArr[position] = num;
    count++;
  }

  public int removeElement(int position) {
    int result = ERROR_NUM;

    if (isEmpty()) {
      System.out.println("Array is empty");

      return result;
    }

    if (position < 0 || position > count - 1) {
      return result;
    }

    result = intArr[position];

    for (int i = position; i < count - 1; i++) {
      intArr[i] = intArr[i + 1];
    }

    count--;

    return result;
  }

  public boolean isEmpty() {
    if (count == 0) {
      return true;
    } else {
      return false;
    }
  }
}
