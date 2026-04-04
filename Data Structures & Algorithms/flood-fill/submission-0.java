class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] visit = new int[image.length][image[0].length];
        dfs(image, sr, sc, color, visit);
        return image;
    }

    public void dfs(int[][] image, int r, int c, int color, int[][] visit){
        int R = image.length, C = image[0].length;
        if(
            r < 0 || c < 0 || r >=R || c >= C || image[r][c] == color || image[r][c] == 0 || visit[r][c] == 1
        ){
            return ; 
        }

        image[r][c] = color;
        dfs(image, r+1, c, color, visit);
        dfs(image, r-1, c, color, visit);
        dfs(image, r, c+1, color, visit);
        dfs(image, r, c-1, color, visit);
    }
}