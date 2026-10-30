class Solution {
    public int countBeautifulPairs(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i = 0; i < n - 1; i++){
            int first = nums[i];

            while(first >= 10){
                first /= 10;
            }

            for(int j = i + 1; j < n; j++){
                int a = first;
                int b = nums[j] % 10;

                while(b != 0){
                    int temp = a % b;
                    a = b;
                    b = temp;
                }

                if(a == 1){
                    count++;
                }
            }
        }

        return count;
    }
}