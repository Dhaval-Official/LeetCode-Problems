package Problems.Problems_NEXT;

import java.util.ArrayList;
import java.util.List;

public class Solution_0830 {

    public List<List<Integer>> largeGroupPositions(String s) {

        List<Integer> temp;
        List<List<Integer>> ans = new ArrayList<>();
        int countcurr;
        int iNext = 0;

        for (int i = 0; i < s.length(); i++) {

            countcurr = 1;
            char current = s.charAt(i);
            int jLoc = 0;

            for (int j = i+1; j < s.length(); j++) {
                if (current == s.charAt(j)) {
                    countcurr++;
                    jLoc = j;
                } else {
                    break;
                }
            }

            if (countcurr > 2) {
                temp = new ArrayList<>();
                temp.add(i);
                temp.add(jLoc);
                ans.add(temp);
                i = jLoc;
            }



        }

//        System.out.println(ans);

        return ans;
    }

}
