class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int L = 0 , R = numbers.length-1;
        int sum =0;
        while(L<R){
            sum = numbers[L] + numbers[R] ;

            if(sum > target){
                R--;
            }else if( sum < target){
                L++;
            }else{
                break;
            }
        }

        return new int[]{L+1, R+1};
    }
}
