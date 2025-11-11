package Problems.Problems_0000;

public class Solution_0027 {

    public int removeElement(int[] nums, int val) {

        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                count++;
            }
        }


        for(int i=0;i<count;i++) {
            if(nums[i] == val) {
                nums = shiftLefter(nums, i);
                i--;
                count--;
            }
        }

        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+", ");
        }


        return count;
    }

    public int[] shiftLefter(int[] nums, int start) {

        System.out.println("Getting here");
        for(int i=start;i<nums.length-1;i++) {
            System.out.println(nums[i]+"--"+nums[i+1]);
            nums[i] = nums[i+1];
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+", ");
        }
        return nums;

    }




}
