package Problems.Problems_0000;

public class Solution_0035 {

    public int searchInsert(int[] nums, int target) {

        int position=0;

        for(int i=0;i<nums.length;i++) {
            if(nums[i] >= target) {
                position = i-1;
            }
        }

        return position;
    }

}
