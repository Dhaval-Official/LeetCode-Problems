package Problems.All;

public class Solution_0027 {

    public int removeElement(int[] nums, int val) {

        int pos = 0;

        int count=0;
        for (int num : nums) {
            if (num == val) {
                count++;
            }
        }


        for(int i=0;i<nums.length;i++) {
            if(pos >= count) {break;}
            if(nums[i] == val) {
                nums = shiftLefter(nums, i);
                pos++;
                i--;
            }
        }

        return nums.length-count;
    }

    public int[] shiftLefter(int[] nums, int start) {

        for(int i=start;i<nums.length-1;i++) {
            nums[i] = nums[i+1];
        }

        return nums;

    }

}
