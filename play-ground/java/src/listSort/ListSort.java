package listSort;

import java.util.ArrayList;
import java.util.List;

public class ListSort {
  public List<List<String>> customSort(List<List<String>> list){
    list.sort(new CustomSort());

    return list;
  }

  public List<String> item(String id, String name){
    List<String> item = new ArrayList<>();

    item.add(id);
    item.add(name);

    return item;
  }

  public List<List<String>> createList(){
    List<List<String>> list = new ArrayList<>();

    list.add(item("100101", "Special Week"));
    list.add(item("100201", "Silence Suzuka"));
    list.add(item("100402", "Maruzensky"));
    list.add(item("100102", "Special Week"));
    list.add(item("100501", "Fuji Kiseki"));
    list.add(item("100401", "Maruzensky"));
    list.add(item("100202", "Silence Suzuka"));
    list.add(item("100301", "Tokai Teio"));
    list.add(item("100103", "Special Week"));
    list.add(item("100302", "Tokai Teio"));
    list.add(item("100101", "Tokai Teio"));

    return list;
  }
}
