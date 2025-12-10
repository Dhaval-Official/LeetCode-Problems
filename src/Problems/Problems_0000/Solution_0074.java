package Problems.Problems_0000;

public class Solution_0074 {

    public boolean searchMatrix(int[][] matrix, int target) {

        for(int i=0;i<matrix.length;i++) {

            if(target <= matrix[i][matrix[0].length-1] && target >= matrix[i][0]) {
                for(int j=0;j<=matrix[0].length-1;j++) {
                    if(matrix[i][j] == target) {
                        return true;
                    }
                }
            }

        }

        return false;
    }
}