class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int lessNum = 0;
        int equalNum = 0;

        for(int num : nums){
            if(num < target){
                lessNum++;
            }else if(num == target){
                equalNum++;
            }
        }

        List<Integer> result = new ArrayList<>();

        for(int i = lessNum; i < lessNum + equalNum; i++){
            result.add(i);
        }

        return result;
    }
}