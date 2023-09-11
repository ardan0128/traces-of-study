```java
class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length < n - 1){
            return -1;
        }

        int[] indegree = new int[n + 1];
        int[] outdegree = new int[n + 1];

        for(int[] vertex : trust){
            outdegree[vertex[0]]++;
            indegree[vertex[1]]++;
        }

        for(int i = 1; i <= n; i++){
            if(indegree[i] == n - 1){
                if(outdegree[i] == 0){
                    return i;
                }else{
                    return - 1;
                }
            }
        }

        return - 1;
    }
}
```
