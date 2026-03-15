package Problems.This_Week;

public class Solution_1295 {

    public int findNumbers(int[] nums) {

        int totalEven = 0;
        boolean isEven;

        for(int i=0;i<nums.length;i++) {

            isEven = true;
            while(nums[i] > 0) {
                nums[i] = nums[i]/10;
                isEven = !isEven;
            }

            if(isEven) {
                totalEven++;
            }

        }

        return totalEven;

    }

}

