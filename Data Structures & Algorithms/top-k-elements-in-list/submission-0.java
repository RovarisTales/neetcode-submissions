/*
count elements and add them to map?
priotiry queue?
heap?

*/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            freqMap.merge(nums[i], 1, Integer::sum);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(freqMap::get));
        for (Integer i : freqMap.keySet()) {
            pq.offer(i);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        return pq.stream().mapToInt(Integer::intValue).toArray();
    }
}
