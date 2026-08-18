class Solution {
    public int convertTime(String current, String correct) {
        int count = 0;
        int diff = convertMinute(correct) - convertMinute(current);

        while(diff > 0){
            if(diff >= 60){
                diff -= 60;
            }else if(diff >= 15){
                diff -= 15;
            }else if(diff >= 5){
                diff -= 5;
            }else if(diff >= 1){
                diff -= 1;
            }

            count++;
        }

        return count;
    }

    private int convertMinute(String time){
        int minute = 0;

        if(time.charAt(0) == 0){
            minute += time.charAt(1) * 60;
        }else{
            minute += ((time.charAt(0) * 10) + time.charAt(1)) * 60;
        }

        if(time.charAt(3) == 0){
            minute += time.charAt(4);
        }else{
            minute += (time.charAt(3) * 10) + time.charAt(4);
        }

        return minute;
    }
}