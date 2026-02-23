package Problems.All;

public class Solution_3560 {

    public long minCuttingCost(int n, int m, int k) {

        if (n <= k && m <= k) {
            return 0;
        } else if (n > k && m > k) {
            return (long) (n-k)*k + (long) (m-k) *k;
        }

        if(n > k) {
            return (long) (n-k)*k;
        } else {
            return (long) (m-k)*k;
        }

    }

}
