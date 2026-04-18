class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int gMax = nums[0], gMin = nums[0];
        int currMax = 0, currMin = 0;
        int total = 0;

        for(int i=0; i< nums.length; i++){
            currMax = Math.max(currMax + nums[i], nums[i]);
            currMin = Math.min(currMin + nums[i], nums[i]);

            gMax = Math.max(currMax, gMax);
            gMin = Math.min(currMin, gMin);

            total += nums[i];
        }

        return gMax > 0 ? Math.max(gMax, total-gMin) : gMax;
    }
}