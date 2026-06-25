class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0;

        for(int i = lowLimit; i <= highLimit; i++){
            int box = getBoxNumber(i);

            hm.put(box, hm.getOrDefault(box, 0) + 1);

            max = Math.max(max, hm.get(box));
        }

        return max;
    }

    public int getBoxNumber(int n){
        int sum = 0;

        while(n > 0){
            sum += (n % 10);
            n /= 10;
        }

        return sum;
    }
}