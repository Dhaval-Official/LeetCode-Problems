package Problems.All;

public class Solution_0075 {

    public void sortColors(int[] nums) {
        int red=0,white=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) {red++;}
            else if(nums[i] == 1) {white++;}

        }
        for(int i=0;i<nums.length;i++) {
            if(red-- > 0) nums[i] = 0;
            else if(white-- > 0) nums[i] = 1;
            else nums[i] = 2;

        }
    }
}
