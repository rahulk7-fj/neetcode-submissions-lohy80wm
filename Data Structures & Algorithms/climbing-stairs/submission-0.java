class Solution {
    public int climbStairs(int n) {
       return count(0,n);
    }

    public int count(int i, int n){
        if(i>n) return 0;
        if(i==n) return 1;
        return count(i+1,n)+count(i+2,n);
    }
}
