package Problems.Problems_NEXT;

public class Solution_3701 {

    public int alternatingSum(int[] nums) {

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i%2 == 0) {
                ans+=nums[i];
            } else {
                ans-=nums[i];
            }
        }

        return ans;
    }

}
