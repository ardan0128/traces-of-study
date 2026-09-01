class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> s = new HashSet<>();

        for(int num : nums) {
            if(num != 0){
                s.add(num);
            }
        }

        return s.size();
    }
}