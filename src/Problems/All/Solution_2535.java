package Problems.All;

public class Solution_2535 {

    public int differenceOfSum(int[] nums) {

        int sum=0,digiSum=0,temp;

        for (int num : nums) {
            temp = num;
            sum += temp;
            while (temp > 0) {
                digiSum += temp % 10;
                temp = temp / 10;
            }

        }
        // System.out.println(sum+" "+digiSum);
        return (sum-digiSum >=0 ) ? sum-digiSum : digiSum-sum;
    }

}
