class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);

            if(map.get(num) == 1){
                sum += num;
            }else if(map.get(num) == 2){
                sum -= num;
            }
        }

        return sum;
    }
}