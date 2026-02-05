package Problems.All;

import java.util.HashSet;

public class Solution_3289 {

    public int[] getSneakyNumbers(int[] nums) {

        int[] ans = new int[2];
        HashSet<Integer> hs = new HashSet<Integer>();
        int ptr = 0;

        for (int i: nums) {
//            hm.put(i, hm.getOrDefault(i, 0) + 1);
            if (hs.contains(i)) {
                ans[ptr] = i;
                ptr++;
            } else {
                hs.add(i);
            }
        }

//        System.out.println(hm);
        return ans;

    }

}
