package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public int removeDuplicates(int[] nums) {
    List<Integer> result = new ArrayList<>();

    result.add(nums[0]);
    for(int i = 1; i < nums.length; i++){
      if(nums[i] != result.get(result.size() - 1)){
        result.add(nums[i]);
      }
    }

    System.out.println(result);

    return result.size();
  }
}
