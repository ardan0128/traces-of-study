
class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hs = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            hs.add(nums1[i]);
        }

        Set<Integer> res = new HashSet<>();

        for (int i = 0; i < nums2.length; i++) {
            if (hs.contains(nums2[i])) {
                res.add(nums2[i]);
            }
        }

        int[] arr = new int[res.size()];
        int i = 0;
        for (int el : res) {
            arr[i++] = el;
        }

        return arr;
    }
}
