class Solution {
    public String kthDistinct(String[] arr, int k) {
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(isDistinct(arr, i)){
                count++;

                if(count == k){
                    return arr[i];
                }
            }
        }

        return "";
    }

    private boolean isDistinct(String[] arr, int index){
        for(int i = 0; i < arr.length; i++){
            if(i != index && arr[i].equals(arr[index])){
                return false;
            }
        }

        return true;
    }
}