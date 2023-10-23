package listSort;

import java.util.Comparator;
import java.util.List;

public class CustomSort implements Comparator<List<String>> {
  @Override
  public int compare(List<String> o1, List<String> o2) {
    if(!o1.get(0).equals(o2.get(0))){
      return o1.get(0).compareToIgnoreCase(o2.get(0));
    }else if(o1.get(0).equals(o2.get(0))){
      return o1.get(1).compareToIgnoreCase(o2.get(1));
    }

    return 0;
  }
}
