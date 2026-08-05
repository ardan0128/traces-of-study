class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] nums = new int[10];

        for(int digit : digits){
            nums[digit]++;
        }

        List<Integer> result = new ArrayList<>();

        for(int i = 1; i <= 9; i++){
            if(nums[i] == 0){
                continue;
            }

            nums[i]--;

            for(int j = 0; j <= 9; j++){
                if(nums[j] == 0){
                    continue;
                }

                nums[j]--;

                for(int k = 0; k <= 8; k += 2){
                    if(nums[k] == 0){
                        continue;
                    }

                    result.add(i * 100 + j * 10 + k);
                }

                nums[j]++;
            }

            nums[i]++;
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}