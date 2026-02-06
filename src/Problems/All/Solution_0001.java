package Problems.All;

public class Solution_0001 {

    public int[] twoSum(int[] nums, int target) {

        int size = nums.length;

        for(int i=0;i<size-1;i++) {

            // System.out.println("this is "+i);

            for(int j=i+1;j<size;j++) {
                // System.out.println(nums[i] +" "+ nums[j]);
                if(target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }

        }

        return new int[]{0,0};

    }
}
