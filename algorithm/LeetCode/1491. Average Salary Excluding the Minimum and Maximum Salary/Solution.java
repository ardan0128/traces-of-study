class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        int sum = 0;

        for(int i = 0; i < salary.length; i++){
            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]);
            sum += salary[i];
        }

        sum = sum - min - max;

        double result = (double) sum / (salary.length - 2);

        return result;
    }
}