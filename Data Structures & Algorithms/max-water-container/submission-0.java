class Solution {
    public int maxArea(int[] heights) {
        int res = 0, L=0, R= heights.length - 1;

        while(L< R){

            int area = Math.min(heights[L], heights[R]) * (R-L);
            res = Math.max(res, area);
            if(heights[R] <= heights[L]){
                 R--;
            }else{
                L++;
            }
        }

        return res;
    }
}
