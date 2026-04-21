class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int res = 0, currSum = 0;

        for(int i =0; i<k-1; i++){
            currSum += arr[i];
        }

        for(int L=0; L<= arr.length - k; L++){
            currSum += arr[L+k-1];
            if((currSum/k) >= threshold){
                res++;
            }
            currSum -= arr[L];
        }


        return res;
    }
}