class Solution {
  public int[] twoSum(int[] nums, int target){
    int left = 0;
    int right = left + 1;

    while(left < right){
      if(nums[left] + nums[right] == target){
        break;
      }

      right++;

      if(right >= nums.length){
        left++;
        right = left + 1;
      }
    }

    int[] result = new int[2];
    result[0] = left;
    result[1] = right;

    return result;
  }
}