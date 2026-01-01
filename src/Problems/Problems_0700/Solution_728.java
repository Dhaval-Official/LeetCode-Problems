package Problems.Problems_0700;

import java.util.ArrayList;
import java.util.List;

public class Solution_728 {


    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> Answer = new ArrayList<Integer>();

        for(int i=left;i<=right;i++) {

            if(checkDivisions(i)) {
                Answer.add(i);
            }
        }

        return Answer;
    }

    public boolean checkDivisions(int num) {

        // System.out.print(num+"\t");
        int mod;
        int n = num;
        while(n > 0) {

            mod = n%10;
            // System.out.print(n+" ");
            if(mod == 0) {
                return false;
            }
            if(num%mod != 0) {
                // System.out.println();
                return false;
            }

            n = n/10;
        }
        // System.out.println();
        return true;
    }
}