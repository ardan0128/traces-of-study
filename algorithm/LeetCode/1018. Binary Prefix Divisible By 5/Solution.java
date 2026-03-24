
class Solution {

    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int val = 0;

        for (int num : nums) {
            val = ((val * 2) + num) % 5;
            result.add(val == 0);
        }

        return result;
    }
}
