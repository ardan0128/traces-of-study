class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] elementCount = new int[1001];
        int uniqueCount = 0;

        for(int i = 0; i < target.length; i++){
            if(elementCount[target[i]]++ == 0){
                uniqueCount++;
            }

            if(elementCount[arr[i]]-- == 1){
                uniqueCount--;
            }
        }

        return uniqueCount == 0;
    }
}