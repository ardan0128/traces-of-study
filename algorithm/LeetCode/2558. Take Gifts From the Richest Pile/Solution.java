class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for(int gift : gifts){
            heap.add(gift);
        }

        for(int i = 0; i < k && heap.peek() > 1; i++){
            int x = heap.poll();
            heap.add((int) Math.sqrt(x));
        }

        long sum = 0;

        for(int h : heap){
            sum += h;
        }

        return sum;
    }
}