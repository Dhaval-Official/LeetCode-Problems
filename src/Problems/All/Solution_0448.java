package Problems.All;

import java.util.ArrayList;
import java.util.List;

public class Solution_0448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList ans = new ArrayList<Integer>();
        int[] nums2 = new int[nums.length];

        for(int i=0;i<nums.length;i++) {
            nums2[nums[i]-1] = nums[i];
        }

        for(int i=0;i<nums.length;i++) {
            if(nums2[i] == 0) {
                ans.add(i+1);
            }
        }

        return ans;
    }
}
