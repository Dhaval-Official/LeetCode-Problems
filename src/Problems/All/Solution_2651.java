package Problems.All;

public class Solution_2651 {

    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {

        int ans = arrivalTime + delayedTime;
        return ans  > 23 ? ans - 24: ans;

    }
}
