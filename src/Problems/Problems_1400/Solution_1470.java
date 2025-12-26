package Problems.Problems_1400;

public class Solution_1470 {
    public int[] shuffle(int[] nums, int n) {

        int[] ans = new int[n*2];
        int ansptr = 0;

        for (int i = 0; i < n; i++) {
            ans[ansptr++] = nums[i];
            ans[ansptr++] = nums[i+n];

        }

        return ans;
    }
}