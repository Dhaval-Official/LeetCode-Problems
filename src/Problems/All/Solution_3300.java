package Problems.All;

public class Solution_3300 {

    public int minElement(int[] nums) {

        int temp, ans=Integer.MAX_VALUE;
        int sum;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            sum=0;
            while (temp > 0) {
//                System.out.println(nums[i]+" "+temp%10);
                sum+=temp%10;
                temp/=10;
            }
            nums[i] = sum;
            if (nums[i] < ans) {
                ans = nums[i];
            }


        }

        return ans;
    }

}
