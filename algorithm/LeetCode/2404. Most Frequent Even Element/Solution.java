class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = -1;
        int max = 0;

        for(int num : nums){
            if(num % 2 != 0){
                continue;
            }

            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);

            if(count > max || (count == max && num < result)){
                max = count;
                result = num;
            }
        }

        return result;
    }
}