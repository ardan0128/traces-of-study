class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] counts = new int[1001];
        int n = nums.length;
        
        for(int[] num : nums){
            for(int i : num){
                counts[i]++;
            }
        }

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < 1001; i++){
            if(counts[i] == n){
                result.add(i);
            }
        }

        return result;
    }
}