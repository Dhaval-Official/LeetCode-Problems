package Problems.Problems_0400;

public class Solution_0485 {
    public int findMaxConsecutiveOnes(int[] nums) {

        int maxConsecutive=0;
        int consecutive = 0;
        for(int i: nums) {
            // System.out.println(i);
            if(i==1) {
                consecutive++;
                if(maxConsecutive < consecutive) {
                    maxConsecutive = consecutive;
                }
            } else {
                consecutive = 0;
            }
        }

        return maxConsecutive;
    }
}