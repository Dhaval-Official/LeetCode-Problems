package Problems.All;

public class Solution_3783 {

    public int mirrorDistance(int n) {

        int val = n;
        int rev = 0;

        while (val > 0) {

            rev = rev * 10 + val%10;
            val = val/10;
        }
//        System.out.println(rev);
//        int as = Math.abs(n-rev);
//        System.out.println(as);

        return Math.abs(n-rev);
    }

}
