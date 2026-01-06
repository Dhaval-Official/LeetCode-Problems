package Problems.All;

public class Solution_3492 {

    public int maxContainers(int n, int w, int maxWeight) {
/*      with Declarations easy to understand
        int maxSpace = n*n;
        int maxWeightTakable = maxWeight/w;

        int ans = Math.min(maxSpace, maxWeightTakable);

        return ans;

 */

        return Math.min(n*n, maxWeight/w);
    }
}