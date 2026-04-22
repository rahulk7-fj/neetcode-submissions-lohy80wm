class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = Integer.MAX_VALUE,  total =0, L=0;

        for(int i =0; i<nums.length; i++){
            total += nums[i];
            while(total >= target){
                len = Math.min(len,i-L+1);
                total -= nums[L];
                L += 1;
            }
        }
        if(len == Integer.MAX_VALUE) return 0;

        return len;
   
    }
}