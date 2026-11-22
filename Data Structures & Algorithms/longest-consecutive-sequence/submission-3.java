class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length <= 0) {
            return 0;
        }
        Set<Integer> numSet = new HashSet<>();
        for (Integer i : nums) {
            numSet.add(i);
        }

        int maxSeq = 1;
        for (Integer num : numSet) {
            if (numSet.contains(num - 1)) {
                continue;
            }
            int seq = 1;
            int auxNum = num;
            while(numSet.contains(auxNum +1)) {
                seq++;
                auxNum++;
            }
            if (seq > maxSeq) {
                maxSeq = seq;
            }
        }
        return maxSeq;
    }
}
