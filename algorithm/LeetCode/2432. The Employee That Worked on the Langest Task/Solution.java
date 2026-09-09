class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int id = logs[0][0];
        int max = logs[0][1];

        for(int i = 1; i < logs.length; i++){
            int time = logs[i][1] - logs[i - 1][1];

            if(time > max){
                id = logs[i][0];
                max = time;
            }

            if(time == max){
                id = Math.min(id, logs[i][0]);
            }
        }

        return id;
    }
}