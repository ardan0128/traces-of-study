class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int total[] = new int[1001];

        for(int[] item : items1){
            total[item[0]] = item[1];
        }

        for(int[] item : items2){
            if(total[item[0]] != 0){
                total[item[0]] += item[1];
            }else{
                total[item[0]] = item[1];
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < 1001; i++){
            if(total[i] != 0){
                List<Integer> items = new ArrayList<>();
                items.add(i);
                items.add(total[i]);
                result.add(items);
            }
        }

        return result;
    }
}