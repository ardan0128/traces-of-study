package ch05.se14;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<String> {

  @Override
  public int compare(String string1, String string2) {
    return string1.compareTo(string2) * (-1);
  }

}

public class MyCompare {
  public static void main(String[] args) {
    TreeSet<String> set1 = new TreeSet<String>(new MyComparator());
    set1.add("111");
    set1.add("222");
    set1.add("333");

    System.out.println(set1);
    System.out.println("===============");

    TreeSet<String> set2 = new TreeSet<String>();
    set2.add("111");
    set2.add("222");
    set2.add("333");

    System.out.println(set2);
  }
}
