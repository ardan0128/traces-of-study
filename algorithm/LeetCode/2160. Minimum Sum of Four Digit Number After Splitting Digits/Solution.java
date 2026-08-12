class Solution {
    public int minimumSum(int num) {
        List<Integer> nums = new ArrayList<>();

        while(num > 0){
            nums.add(num % 10);
            num /= 10;
        }

        Collections.sort(nums);

        return (nums.get(0) * 10 + nums.get(2)) + (nums.get(1) * 10 + nums.get(3));
    }
}