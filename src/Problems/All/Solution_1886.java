package Problems.All;

public class Solution_1886 {

    public boolean findRotation(int[][] mat, int[][] target) {

        boolean mismatchFound = false;
        int n = mat.length;

        for (int i=0;i<n; i++) {

            for (int j=0;j<n;j++) {
                if (mat[i][j] != target[i][j]) {
                    mismatchFound = true;
                    break;
                }
            }

            if (mismatchFound) {
//                System.out.println("Flag");
                break;
            }
        }

        if (!mismatchFound) {return true;}

        //90 degree turn
        int x = 0;
        int y = n;
        mismatchFound = false;

        for (int i=0; i<n; i++) {
           y--;
           x=0;
           for (int j=0;j<n;j++) {
//               System.out.println(mat[i][j] +" "+ target[x][y] +" "+ x +" "+ y);
               if (mat[i][j] != target[x][y]) {
                   mismatchFound = true;
                   break;
               }
               x++;
           }

            if (mismatchFound) {
//                System.out.println("Flag2");
                break;
            }
        }

        if (!mismatchFound) {return true;}

        //180 degree turn
        x = n;
        y = n;
        mismatchFound = false;

        for (int i=0; i<n; i++) {
            y=n;
            x--;
            for (int j=0;j<n;j++) {
                y--;
//                System.out.println(mat[i][j] +" "+ target[x][y] +" "+ x +" "+ y);
                if (mat[i][j] != target[x][y]) {
                    mismatchFound = true;
                    break;
                }

            }

            if (mismatchFound) {
//                System.out.println("Flag3");
                break;
            }
        }

        if (!mismatchFound) {return true;}

        //90 degree turn
        x = n;
        y = 0;
        mismatchFound = false;

        for (int i=0; i<n; i++) {
            x=n;
            for (int j=0;j<n;j++) {
                x--;
//               System.out.println(mat[i][j] +" "+ target[x][y] +" "+ x +" "+ y);
                if (mat[i][j] != target[x][y]) {
                    mismatchFound = true;
                    break;
                }

            }
            y++;
            if (mismatchFound) {
//                System.out.println("Flag4");
                break;
            }
        }

        if (!mismatchFound) {return true;}

//        System.out.println("Default Return");
        return false;

    }

}
