
class Solution {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);

        long pre = 1;

        for (int i = 1; i <= rowIndex; i++) {
            long next = pre * (rowIndex - i + 1) / i;

            result.add((int) next);

            pre = next;
        }

        return result;
    }
}
