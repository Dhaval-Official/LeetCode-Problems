package Problems.All;

import java.util.ArrayList;
import java.util.List;

public class Solution_0442 {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        int index;
        for (int i = 0; i < nums.length; i++) {

            index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                ans.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }

        return ans;
    }
}