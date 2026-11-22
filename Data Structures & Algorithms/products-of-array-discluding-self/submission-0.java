/*
obvious idea: loop once to find result of everything multipled then divide each index i by that value
problem: overflows (no issue because of constraint 3)
no division allowed 
result list with all 1s
then loop over List
multiply each value of that by nums[i] except output[i]
return 
this is o^2
hashmap?

*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] rightMult = new int[nums.length];
        int[] leftMult = new int[nums.length];
        leftMult[0] = 1;
        rightMult[nums.length - 1] = 1;
        for(int i = 1; i < nums.length; i++) {
            leftMult[i] = leftMult[i-1] * nums[i - 1];
        }
        for(int i = nums.length -2 ; i >=0; i--) {
            rightMult[i] = rightMult[i+1] * nums[i + 1];
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            result[i] = leftMult[i] * rightMult[i];
        }
        return result;
    }
}  
