class Solution {
    public int shortestPath(int[][] grid) {

        int R = grid.length, C = grid[0].length;
        int[][] visit = new int[R][C];
        Deque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[2]);
        visit[0][0] = 1;

        int length = 0;
        while(!queue.isEmpty()){

            for(int i = 0; i<queue.size(); i++){
                int[] pair = queue.poll();
                int r = pair[0], c = pair[1];

                if(r == R-1 && c == C-1){
                    return length;
                }

                // lets construct the neighbors of the vertex
                int[][] lrdu = {{r, c+1}, {r, c-1}, {r+1, c}, {r-1, c}};

                for(int j = 0; j<lrdu.length; j++){
                    int row = lrdu[j][0], col = lrdu[j][1];
                    if(
                        row < 0 || col < 0 || row >= R || col >= C || visit[row][col] == 1 || grid[row][col] == 1
                    ){
                        continue;
                    }

                    queue.add(lrdu[j]);
                    visit[row][col] = 1;
                }
                
            }
            length++;
        }
        return -1;
    }
}
