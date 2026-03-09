
class Solution {

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int dif = (IntStream.of(aliceSizes).sum() - IntStream.of(bobSizes).sum()) / 2;
        HashSet<Integer> set = new HashSet<>();

        for (int aliceSize : aliceSizes) {
            set.add(aliceSize);
        }

        for (int bobSize : bobSizes) {
            if (set.contains(bobSize + dif)) {
                return new int[]{bobSize + dif, bobSize};
            }
        }

        return new int[0];
    }
}
