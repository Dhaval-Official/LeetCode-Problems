package Problems.All;

import java.util.Arrays;

public class Solution_1984 {
    public int minimumDifference(int[] nums, int k) {
/*
        int high, low, mindiff = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-k+1; i++) {

            high = Integer.MIN_VALUE;
            low = Integer.MAX_VALUE;
            for (int j = i; j < i+k; j++) {
//                System.out.print(nums[j]+" ");
                if (nums[j] < low) {low = nums[j];}
                if (nums[j] > high) {high = nums[j];}

            }
//            System.out.print(": "+high+" "+low+" "+(high-low));
//            System.out.println();
            if (high-low < mindiff) {mindiff = high-low;}

        }



        return mindiff;
*/
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i + k <= nums.length; i++) {
            ans = Math.min(ans, nums[i + k - 1] - nums[i]);
        }
        return ans;

    }

}
