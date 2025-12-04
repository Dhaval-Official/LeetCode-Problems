package Problems.Problems_0100;

import java.util.HashSet;

public class Solution_0136 {
    public int singleNumber(int[] nums) {

        HashSet<Integer> hSet =new HashSet<>();
        int ans=0;
        for(int i: nums) {
            if(hSet.contains(i)){
                hSet.remove(i);
            } else {
                hSet.add(i);
            }

        }

        // System.out.println("The size of has set is: " + hSet.size());
        for(int i: hSet) {
            ans = i;
        }

        return ans;
    }
}