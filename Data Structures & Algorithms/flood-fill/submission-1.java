class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int stCol = image[sr][sc];
        if(stCol == color) return image;

        dfs(image, sr, sc, color, stCol);
        return image;
    }

    public void dfs(int[][] image, int r, int c, int color, int startingColor){
        int R = image.length, C = image[0].length;
        if(
            r < 0 || c < 0 || r >=R || c >= C || image[r][c] != startingColor
        ){
            return ; 
        }
        image[r][c] = color;
        
        dfs(image, r+1, c, color, startingColor);
        dfs(image, r-1, c, color, startingColor);
        dfs(image, r, c+1, color, startingColor);
        dfs(image, r, c-1, color, startingColor);

    }
}