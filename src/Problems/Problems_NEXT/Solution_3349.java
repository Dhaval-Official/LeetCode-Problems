package Problems.Problems_NEXT;

import java.util.List;

public class Solution_3349 {

    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {

        int Bptr = k;
        int Aptr = 0;
        int tries =0;

        boolean AFound = true, BFound = true;

        for (int i=0; i < nums.size()-k; i++) {
            int j=i;
            int kFiller =0;
            while (kFiller < k) {
                if (nums.get(i) > nums.get(j)) {
                    break;
                } else {
                    System.out.println(nums.get(i) +" "+ nums.get(j));
                }
                j++;
                kFiller++;
            }
            if (kFiller == k) {
                break;
            }
        }



        return false;
    }

}
