class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> targetMap = new HashMap<>();
        //. target to sum, index of seen value
        for (int i = 0; i < nums.length; i++) {
            if (targetMap.containsKey(nums[i])) {
                return new int[]{targetMap.get(nums[i]), i};
            }
            targetMap.put(target-nums[i], i);
        }
        return new int[2];
    }
}
