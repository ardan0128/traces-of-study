
class Solution {

    public int distributeCandies(int[] candyType) {
        Set<Integer> candyTypes = new HashSet<>();

        for (int candy : candyType) {
            candyTypes.add(candy);
        }

        if (candyTypes.size() >= candyType.length / 2) {
            return candyType.length / 2;
        }

        return candyTypes.size();
    }
}
