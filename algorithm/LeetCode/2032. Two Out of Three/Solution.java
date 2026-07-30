class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        HashSet<Integer> hs3 = new HashSet<>();
        HashSet<Integer> all = new HashSet<>();

        for(int num : nums1){
            hs1.add(num);
            all.add(num);
        }

        for(int num : nums2){
            hs2.add(num);
            all.add(num);
        }

        for(int num : nums3){
            hs3.add(num);
            all.add(num);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(int num : all){
            int count = 0;

            if(hs1.contains(num)){
                count++;
            }

            if(hs2.contains(num)){
                count++;
            }

            if(hs3.contains(num)){
                count++;
            }

            if(count > 1){
                result.add(num);
            }
        }

        return result;
    }
}