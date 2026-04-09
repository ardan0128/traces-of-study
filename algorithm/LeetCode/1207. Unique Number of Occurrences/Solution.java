
class Solution {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> nums = new HashMap<>();

        for (int num : arr) {
            nums.put(num, nums.getOrDefault(num, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();

        for (int num : nums.values()) {
            if (!set.add(num)) {
                return false;
            }
        }

        return true;
    }
}
