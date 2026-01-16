package Problems.Problems_NEXT;

import java.util.ArrayList;
import java.util.List;

public class Solution_3417 {

    public List<Integer> zigzagTraversal(int[][] grid) {

        List<Integer> ans = new ArrayList<Integer>();

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[i].length; j++) {

                ans.add(grid[i][j]);

            }

        }

        return ans;
    }

}
