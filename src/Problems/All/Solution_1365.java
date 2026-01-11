package Problems.All;

public class Solution_1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] ans = new int[nums.length];
        int k;
        for (int i = 0; i < nums.length; i++) {
            k=0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j]) {
                    k++;
                }
            }
            ans[i] = k;
        }

        return ans;

    }
}
