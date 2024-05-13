package listSort;

import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    ListSort listSort = new ListSort();
    List<List<String>> test = listSort.createList();

    listSort.customSort(test);

    for(List<String> item : test){
      System.out.println(item);
    }

    List<List<String>> test2 = listSort.createList();

    test2.sort((o1, o2) -> {
      if(o1.get(0).equals(o2.get(0))){
        return o2.get(1).compareToIgnoreCase(o1.get(1));
      }else{
        return o2.get(0).compareToIgnoreCase(o1.get(0));
      }
    });

    System.out.println("===================");
    for(List<String> item : test2){
      System.out.println(item);
    }
  }
}
