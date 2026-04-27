class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(getDays(date1) - getDays(date2));
    }

    private int getDays(String date){
        int y = Integer.parseInt(date.substring(0, 4));
        int m = Integer.parseInt(date.substring(5, 7));
        int d = Integer.parseInt(date.substring(8, 10));
        int[] prefix = new int[]{0, 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int i = 2; i <= 13; i++){
            prefix[i] += prefix[i - 1];
        }

        int days = (y - 1972) * 365 + prefix[m] + d;

        for(int i = 1972; i < y; i += 4){
            if(isLeap(i)){
                days++;
            }
        }

        if(isLeap(y) && m > 2){
            days++;
        }

        return days;
    }

    private boolean isLeap(int year){
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}