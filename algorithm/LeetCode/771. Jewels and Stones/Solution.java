
class Solution {

    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        Set setJewels = new HashSet();

        for (char jewel : jewels.toCharArray()) {
            setJewels.add(jewel);
        }

        for (char stone : stones.toCharArray()) {
            if (setJewels.contains(stone)) {
                result++;
            }
        }

        return result;
    }
}
