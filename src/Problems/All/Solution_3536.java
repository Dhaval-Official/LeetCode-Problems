package Problems.All;

public class Solution_3536 {

    public int maxProduct(int n) {

        int max = 0, max2 = 0;
        int u;

        while (n>0) {

            u=n%10;
            if (u >= max) {
                max2 = max;
                max = u;
            } else if (u >= max2) {
                max2 = u;
            }


            n/=10;
        }
//        System.out.println(max+" "+max2);
        return max*max2;
    }

}
