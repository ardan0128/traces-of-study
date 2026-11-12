class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] line = new int[102];

        for(List<Integer> num : nums){
            line[num.get(0)]++;
            line[num.get(1) + 1]--;
        }

        int ans = 0;
        int count = 0;

        for(int i = 0; i < 102; i++){
            count += line[i];
            if(count > 0){
                ans++;
            }
        }
        
        return ans;
    }
}