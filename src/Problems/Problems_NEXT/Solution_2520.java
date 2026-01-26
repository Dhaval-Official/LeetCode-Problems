package Problems.Problems_NEXT;

public class Solution_2520 {

    public int countDigits(int num) {

        int ans =0;
        int divident = num;

        while (num != 0) {

//            divisor = num%10;
            if (divident%(num%10) == 0) {
                ans++;
            }

            num/=10;
        }


        return ans;
    }

}
