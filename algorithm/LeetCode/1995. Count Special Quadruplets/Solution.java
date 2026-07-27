class Solution {
    public int countQuadruplets(int[] nums) {
        int n = nums.length;
        int result = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < n - 3; i++){
            for(int j = i + 1; j < n - 2; j++){
                int sum = nums[i] + nums[j];
                List<Integer> list = map.getOrDefault(sum, new ArrayList<>());
                map.put(sum, list);
                list.add(j);
            }
        }

        for(int i = n - 1; i > 2; i--){
            for(int j = i - 1; j > 1; j--){
                int sum = nums[i] - nums[j];

                if(map.containsKey(sum)){
                    List<Integer> list = map.get(sum);

                    for(int l : list){
                        if(l < j){
                            result++;
                        }
                    }
                }
            }
        }

        return result;
    }
}