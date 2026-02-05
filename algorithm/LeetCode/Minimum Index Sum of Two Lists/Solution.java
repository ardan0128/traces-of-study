
class Solution {

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        int sum = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        for (int i = 0; i < list2.length; i++) {
            Integer j = map.get(list2[i]);

            if (j != null && i + j <= sum) {
                if (i + j < sum) {
                    result.clear();
                    sum = i + j;
                }

                result.add(list2[i]);
            }
        }

        return result.toArray(new String[result.size()]);
    }
}
