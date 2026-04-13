class Solution {
    public int uniquePaths(int m, int n) {
        int[][] cache = new int[m][n];
        int mr = m , nc= n ;
        return dfsMemo(0,0,cache,mr,nc);
    }

    public int dfsMemo(int m, int n, int[][] cache, int rows, int cols){

        if(m == rows || n == cols) return 0;

        if(cache[m][n] !=0) return cache[m][n];

        if(m == rows-1 && n == cols-1) return 1;

        cache[m][n] = dfsMemo(m+1,n,cache,rows,cols) + dfsMemo(m,n+1,cache,rows,cols);

        return cache[m][n];
    }
}
