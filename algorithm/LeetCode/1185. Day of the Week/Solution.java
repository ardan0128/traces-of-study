
class Solution {

    public String dayOfTheWeek(int day, int month, int year) {
        String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] dayOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (leapYear(year)) {
            dayOfMonth[2] = 29;
        }

        int dayOfYear = 4;

        for (int i = 1971; i < year; i++) {
            if (leapYear(i)) {
                dayOfYear += 366;
            } else {
                dayOfYear += 365;
            }
        }

        for (int i = 1; i < month; i++) {
            dayOfYear += dayOfMonth[i];
        }

        dayOfYear += day;

        return dayOfWeek[dayOfYear % 7];
    }

    private boolean leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }

        return false;
    }
}
