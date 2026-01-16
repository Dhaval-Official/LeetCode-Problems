package Problems.All;

public class Solution_0498 {
    int[] ans;
    public int[] findDiagonalOrder(int[][] mat) {
        // int total = mat.length*mat[0].length;
        ans = new int[mat.length*mat[0].length];

        int ptr = 0;
        int i=0,j=0,imax=mat.length-1,jmax=mat[0].length-1;
        ans[ptr++] = mat[0][0];
        while (ptr < mat.length*mat[0].length) {

            if(i == 0 && j%2 == 0 || j == jmax) {
                if(j == jmax) {i++;} else {j++;}
                while (j>=0 && i<=imax) {
                    ans[ptr++] = mat[i++][j--];
                }
                i--;
                j++;
            } else if(j == 0 && i%2 == 1 || i == imax) {
                if(i == imax) {j++;} else {i++;}
                while(i>=0 && j<=jmax) {
                    ans[ptr++] = mat[i--][j++];
                }
                i++;
                j--;
            }
        }
        return ans;
    }
}
