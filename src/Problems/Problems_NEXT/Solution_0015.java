package Problems.Problems_NEXT;

import java.util.*;

public class Solution_0015 {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> ansInSet = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> triplet;

        Arrays.sort(nums);


        for (int i = 0; i < nums.length-2; i++) {

            for (int j = i+1; j < nums.length-1; j++) {

                for (int k = j+1; k < nums.length; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {

                        int[] temp = {nums[i], nums[j], nums[k]};
                        Arrays.sort(temp);
                        triplet = List.of(temp[0], temp[1], temp[2]);
//                        System.out.println(triplet);
                        ansInSet.add(triplet);

                    }


                }
                while (nums[j] == nums[j+1]) {
                    j++;
                    if (j+1 == nums.length) {break;}
                }

            }
            while (nums[i] == nums[i+1]) {
                i++;
                if (i+1 == nums.length) {break;}
            }

        }

        for (List li: ansInSet) {
            ans.add(li);
        }


        return ans;
    }
}
