class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> odd = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> even = new PriorityQueue<>(Collections.reverseOrder());
        int nums = num;

        while(nums > 0){
            int digit = nums % 10;

            if(digit % 2 == 1){
                odd.offer(digit);
            }else{
                even.offer(digit);
            }

            nums /= 10;
        }

        int result = 0;

        for(char digit : Integer.toString(num).toCharArray()){
            result *= 10;

            if((digit - '0') % 2 == 1){
                result += odd.poll();
            }else{
                result += even.poll();
            }
        }

        return result;
    }
}