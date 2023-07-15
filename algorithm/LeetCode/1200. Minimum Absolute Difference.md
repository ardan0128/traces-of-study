```java
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList();

        int minDiff = Integer.MAX_VALUE;

        for(int i = 1; i < arr.length; i++){
            if(Math.abs(arr[i] - arr[i - 1]) < minDiff){
                minDiff = Math.abs(arr[i] - arr[i - 1]);
            }
        }

        for(int i = 1; i < arr.length; i++){
            if(Math.abs(arr[i] - arr[i - 1]) == minDiff){
                ArrayList<Integer> pair = new ArrayList<Integer>();
                pair.add(arr[i - 1]);
                pair.add(arr[i]);
                result.add(pair);
            }
        }

        return result;
    }
}
```

```java
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        HashMap<Integer, List<List<Integer>>> result = new HashMap();

        int minDiff = Integer.MAX_VALUE;

        for(int i = 1; i < arr.length; i++){
            int curDiff = Math.abs(arr[i] - arr[i - 1]);
            if(curDiff < minDiff){
                minDiff = curDiff;
            }

            if(!result.containsKey(curDiff)){
                List<List<Integer>> tempResult = new ArrayList();
                ArrayList<Integer> pair = new ArrayList<Integer>();
                pair.add(arr[i - 1]);
                pair.add(arr[i]);
                tempResult.add(pair);
                result.put(curDiff, tempResult);
            }else{
                List<List<Integer>> tempResult = result.get(curDiff);
                ArrayList<Integer> pair = new ArrayList<Integer>();
                pair.add(arr[i - 1]);
                pair.add(arr[i]);
                tempResult.add(pair);
                result.put(curDiff, tempResult);
            }
        }

        return result.get(minDiff);
    }
}
```

```java
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        HashMap<Integer, List<List<Integer>>> result = new HashMap();

        int minDiff = Integer.MAX_VALUE;

        for(int i = 1; i < arr.length; i++){
            int curDiff = Math.abs(arr[i] - arr[i - 1]);
            if(curDiff < minDiff){
                minDiff = curDiff;
            }

            List<List<Integer>> tempResult = !result.containsKey(curDiff) ? new ArrayList() : result.get(curDiff);
            ArrayList<Integer> pair = new ArrayList<Integer>();
            pair.add(arr[i - 1]);
            pair.add(arr[i]);
            tempResult.add(pair);
            result.put(curDiff, tempResult);
        }

        return result.get(minDiff);
    }
}
```
