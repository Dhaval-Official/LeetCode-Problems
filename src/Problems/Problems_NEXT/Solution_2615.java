package Problems.Problems_NEXT;

public class Solution_2615 {

    public long[] distance(int[] nums) {

        int size = nums.length;
        long[] ans = new long[size];
        long curr;

        for (int i = 0; i < size; i++) {
            curr = 0;
            for (int j = 0; j < size; j++) {

                if (nums[i] == nums[j]) {
                    curr+= Math.abs(i-j);
                }
            }
            ans[i] = curr;
        }

        return ans;

    }

}
