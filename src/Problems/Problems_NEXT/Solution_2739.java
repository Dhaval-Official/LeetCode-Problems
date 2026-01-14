package Problems.Problems_NEXT;

public class Solution_2739 {

    public int distanceTraveled(int mainTank, int additionalTank) {

        int distancecovered = 0;

        while (mainTank > 0) {

            if (mainTank >= 5) {
                distancecovered += 5*10;
                mainTank-=5;
            } else {
                distancecovered += mainTank*10;
                break;
            }

            if (additionalTank > 0) {
                additionalTank--;
                mainTank++;
            }

        }

        return distancecovered;

    }

}
