
class Solution {

    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int countCandy = 1;
        int idx = 0;

        while (candies > 0) {
            int person = idx % num_people;
            int giveCandy = Math.min(countCandy, candies);

            result[person] += giveCandy;
            candies -= giveCandy;
            countCandy++;
            idx++;
        }

        return result;
    }
}
