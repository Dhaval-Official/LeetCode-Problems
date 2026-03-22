package Problems.All;

import java.util.Arrays;

class Solution_0977 {

    public int[] sortedSquares(int[] nums) {

        for(int i=0;i<nums.length;i++) {
            nums[i] = nums[i]*nums[i];

        }
        Arrays.sort(nums);

        return nums;
    }

}
