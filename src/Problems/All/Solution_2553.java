package Problems.All;

import java.util.ArrayList;

public class Solution_2553 {

    public int[] separateDigits(int[] nums) {

        ArrayList<Integer> altemp;
        ArrayList<Integer> alans = new ArrayList<Integer>();
        int temp;
        int[] ans;

        for (int i = 0; i < nums.length; i++) {

            altemp = new ArrayList<Integer>();
            temp = nums[i];
            while (temp > 0) {
                altemp.add(temp%10);
                temp = temp/10;
            }

            for (int j = altemp.size()-1; j >= 0; j--) {
                alans.add(altemp.get(j));
            }


        }

        ans = new int[alans.size()];
        for (int i = 0; i < alans.size(); i++) {
            ans[i] = alans.get(i);
        }
        return ans;
    }

}
