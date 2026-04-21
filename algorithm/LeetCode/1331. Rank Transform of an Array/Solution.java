
class Solution {

    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> ranks = new HashMap<>();
        int rank = 1;
        int[] temp = arr.clone();
        Arrays.sort(temp);

        for (int i = 0; i < arr.length; i++) {
            if (!ranks.containsKey(temp[i])) {
                ranks.put(temp[i], rank++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ranks.get(arr[i]);
        }

        return arr;
    }
}
