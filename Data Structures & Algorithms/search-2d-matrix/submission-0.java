class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0;
        int high = n*matrix[0].length-1;

        while(low <= high){
         int mid = (low+high)/2;
         int row = mid/n;
         int col = mid%n;
         if(matrix[row][col] == target ){
            return true;
         }else if (matrix[row][col] < target){
            low = mid+1;
         }else{
            high = mid-1;
         }
        }
        return false;
    }

}
