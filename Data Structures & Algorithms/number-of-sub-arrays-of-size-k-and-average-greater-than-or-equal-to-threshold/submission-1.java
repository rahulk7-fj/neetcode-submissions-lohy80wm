class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int res = 0;

        for(int i=0; i<= arr.length - k; i++){
            int total =0;
            for(int j=0; j<k; j++ ){
                total += arr[j+i];
            };
            if(total >= threshold * k){
                res++;
            }
        }
        return res;
    }
}