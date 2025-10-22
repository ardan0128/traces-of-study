
class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> temp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];

            if (temp.containsKey(val) && i - temp.get(val) <= k) {
                return true;
            }

            temp.put(val, i);
        }

        return false;
    }
}
