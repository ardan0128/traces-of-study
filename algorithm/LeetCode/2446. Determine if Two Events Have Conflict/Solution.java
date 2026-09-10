class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int start1 = toMinutes(event1[0]);
        int end1 = toMinutes(event1[1]);
        int start2 = toMinutes(event2[0]);
        int end2 = toMinutes(event2[1]);

        return start1 <= end2 && start2 <= end1;
    }

    private int toMinutes(String time){
        return Integer.parseInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3));
    }
}