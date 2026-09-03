class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int w = 0;

        for(int i = 0; i < k; i++){
            if(blocks.charAt(i) == 'W'){
                w++;
            }
        }

        int left = 1;
        int right = k;
        int count = w;

        while(left < n && right < n){
            if(blocks.charAt(left - 1) == 'W'){
                w--;
            }

            if(blocks.charAt(right) == 'W'){
                w++;
            }

            count = Math.min(count, w);
            left++;
            right++;
        }

        return count;
    }
}