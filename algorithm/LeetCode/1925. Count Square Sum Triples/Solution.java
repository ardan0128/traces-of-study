class Solution {
    public int countTriples(int n) {
        int count = 0;

        for(int i = 3; i <= 3 * n / 4; i++){
            for(int j = i + 1; j < n; j++){
                int sum = i * i + j * j;
                int num = (int) Math.sqrt(sum);

                if(num <= n){
                    if(num * num == sum){
                        count += 2;
                    }
                }else{
                    break;
                }
            }
        }

        return count;
    }
}