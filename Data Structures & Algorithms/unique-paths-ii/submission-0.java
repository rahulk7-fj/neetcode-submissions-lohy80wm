class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length, cols = obstacleGrid[0].length;
        Integer[][] cache = new Integer[rows][cols];
        return upoMemo(obstacleGrid, cache, rows, cols,0,0);
    }

    public int upoMemo(int[][] oGrid, Integer[][] cache, int R, int C, int currR, int currC){
          if(currR == R || currC == C) return 0;

          if(oGrid[currR][currC] == 1 ) return 0;

          if(currR == R-1 && currC == C-1){
            return 1;
          }

          if(cache[currR][currC] != null){
            return cache[currR][currC];
          }
          int rightPaths = upoMemo(oGrid, cache, R, C, currR,currC+1);
          int downPaths = upoMemo(oGrid, cache, R, C, currR+1,currC);

          cache[currR][currC] = rightPaths + downPaths;

          return cache[currR][currC];
    }
}