package Problems.All;

public class Solution_1582 {

    public int numSpecial(int[][] mat) {

        int specialFound = 0;

        for (int i=0;i<mat.length;i++) {
            for (int j=0;j<mat[0].length;j++) {
                if (mat[i][j] == 1) {
                    if (isSpecial(mat, i, j) ) {
                        specialFound++;
                    }
                }
            }
        }

        return specialFound;

    }

    public boolean isSpecial(int[][] mat, int x, int y) {

//        System.out.println("New Point "+x+" "+y);

        for (int i=0;i<mat[0].length;i++) {

            if (mat[x][i] == 0) {
                continue;
            } else {
                if (i == y) {
                    continue;
                }
                return false;
            }
        }

        for (int i=0;i<mat.length;i++) {
//            System.out.println(i+" "+y+" => "+mat[i][y]);
            if (mat[i][y] == 0) {
                continue;
            } else {
                if (i == x) {
                    continue;
                }
                return false;
            }
        }

        return true;
    }
}
