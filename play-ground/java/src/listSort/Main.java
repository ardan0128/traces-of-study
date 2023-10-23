package listSort;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    ListSort listSort = new ListSort();
    List<List<String>> test = listSort.createList();

    listSort.customSort(test);

    for(List<String> item : test){
      System.out.println(item);
    }
  }
}
