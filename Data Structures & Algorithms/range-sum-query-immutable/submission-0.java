class NumArray {

    private int[] numArray;

    public NumArray(int[] nums) {
        numArray = new int[nums.length];
        int total = 0;
        for(int i =0; i< nums.length; i++){

            total += nums[i];
            numArray[i] = total;
        }
    }
    
    public int sumRange(int left, int right) {
        int preR = numArray[right];
        int preL = left > 0 ? numArray[left-1] : 0;

        return (preR - preL);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */