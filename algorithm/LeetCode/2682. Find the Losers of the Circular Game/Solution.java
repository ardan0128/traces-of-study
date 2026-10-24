class Solution {
    public int[] circularGameLosers(int n, int k) {
        boolean[] seen = new boolean[n];
        int cur = 0;
        int count = 1;
        int loser = n;

        while(!seen[cur]){
            seen[cur] = true;
            loser--;
            cur = (cur + count * k) % n;
            count++;
        }

        int[] answer = new int[loser];
        count = 0;

        for(int i = 0; i < n; i++){
            if(!seen[i]){
                answer[count++] = i + 1;
            }
        }

        return answer;
    }
}