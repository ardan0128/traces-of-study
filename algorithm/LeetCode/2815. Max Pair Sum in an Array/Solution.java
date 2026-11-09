class Solution {
    public int maxSum(int[] nums) {
        int max = -1;
        int[] temp = new int[10];
        Arrays.fill(temp, -1);

        for(int num : nums){
            int digit = getMaxDigit(num);

            if(temp[digit] != -1){
                int sum = temp[digit] + num;
                max = max > sum ? max : sum;
            }

            if(num > temp[digit]){
                temp[digit] = num;
            }
        }

        return max;
    }

    private int getMaxDigit(int num){
        int max = 0;

        while(num > 0){
            int last = num % 10;
            max = max < last ? last : max;
            num /= 10;
        }

        return max;
    }
}