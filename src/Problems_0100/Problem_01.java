package Problems_0100;

class Solution0001 {

    public int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length-1;i++) {

            // System.out.println("this is "+i);

            for(int j=i+1;j<nums.length;j++) {
                // System.out.println(nums[i] +" "+ nums[j]);
                if(target == nums[i] + nums[j]) {
                    int[] ans = {i,j};
                    return ans;
                }
            }

        }

        int[] ans = {69,69};
        return ans;

    }
}
