
class Solution {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>((a, b) -> b - a);

        for (int stone : stones) {
            pQueue.offer(stone);
        }

        while (pQueue.size() > 1) {
            pQueue.offer(pQueue.poll() - pQueue.poll());
        }

        return pQueue.poll();
    }
}
