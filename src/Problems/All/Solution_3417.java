package Problems.All;

import java.util.ArrayList;
import java.util.List;

public class Solution_3417 {

    public List<Integer> zigzagTraversal(int[][] grid) {

        List<Integer> ans = new ArrayList<Integer>();
        boolean check = true;

        for (int i = 0; i < grid.length; i++) {

//            System.out.println(grid[i].length);
            if (i%2 == 0) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (check) {
                        ans.add(grid[i][j]);
                    }
                    check = !check;
//                    System.out.println(ans.add(grid[i][j]));
                }
            } else {
                for (int j = grid[i].length-1; j >= 0 ; j--) {
                    if (check) {
                        ans.add(grid[i][j]);
                    }
                    check = !check;
//                    System.out.println(ans.add(grid[i][j]));
                }
            }



        }

        return ans;
    }

}
