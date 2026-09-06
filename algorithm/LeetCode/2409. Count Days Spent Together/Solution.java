class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aA = Days(arriveAlice);
        int lA = Days(leaveAlice);
        int aB = Days(arriveBob);
        int lB = Days(leaveBob);

        if(lA < aB || lB < aA){
            return 0;
        }

        return Math.abs(Math.max(aA, aB) - Math.min(lA, lB)) + 1;
    }

    private int Days(String s){
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;
        int m = Integer.valueOf(s.substring(0, 2));
        int d = Integer.valueOf(s.substring(3, 5));

        for(int i = 0; i < m - 1; i++){
            sum += month[i];
        }

        return d + sum;
    }
}