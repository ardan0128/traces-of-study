import listSort.ListSort;

import java.io.IOException;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    System.out.println("Hello world!");

    ListSort listSort = new ListSort();

    List<List<String>> test = listSort.createList();

    for(int i = 0; i < test.size(); i++){
      System.out.println(test.get(i));
    }

    System.out.println("===================");

    test = listSort.customSort(test);

    for(int i = 0; i < test.size(); i++){
      System.out.println(test.get(i));
    }
  }
}