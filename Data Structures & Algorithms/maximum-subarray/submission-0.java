class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int mxsum = nums[0], curr_sum = 0;

        for(int num : nums ){
            curr_sum = Math.max(curr_sum, 0) + num;
            mxsum = Math.max(curr_sum, mxsum);
        }
        return mxsum;
    }
}
