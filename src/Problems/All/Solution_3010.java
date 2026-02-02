package Problems.All;

public class Solution_3010 {

    public int minimumCost(int[] nums) {

        int total = nums[0];
        int min = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE-1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < min) {
                min2 = min;
                min = nums[i];

            } else if (nums[i] < min2) {
                min2 = nums[i];
            }

        }


        System.out.println(total+" "+min+" "+min2);

        return total+min+min2;
    }


}
