class Solution {
    public String reformatDate(String date) {
        StringBuilder sb = new StringBuilder();
        int length = date.length();
        String day = date.substring(0, length - 11);
        day = day.length() == 1 ? "0" + day : day;

        return sb
            .append(date.substring(length - 4))
            .append("-")
            .append(monthToNumber(date.substring(length - 8, length - 5)))
            .append("-")
            .append(day)
            .toString();
    }

    private String monthToNumber(String m){
        return switch (m) {
            case "Jan" -> "01";
            case "Feb" -> "02";
            case "Mar" -> "03";
            case "Apr" -> "04";
            case "May" -> "05";
            case "Jun" -> "06";
            case "Jul" -> "07";
            case "Aug" -> "08";
            case "Sep" -> "09";
            case "Oct" -> "10";
            case "Nov" -> "11";
            case "Dec" -> "12";
            default -> "";
        };
    }
}