package Problems.All;

import java.util.HashSet;

public class Solution_1695 {


    public int maximumUniqueSubarray(int[] nums) {

        int ans = 0;
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int num : nums) {

            hs.add(num);

        }

        System.out.println(hs);

        for (int i: hs) {
            ans+=i;
        }


        return ans;

    }

}
