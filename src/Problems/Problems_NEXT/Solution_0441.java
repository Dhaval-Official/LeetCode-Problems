package Problems.Problems_NEXT;

public class Solution_0441 {

    public int arrangeCoins(int n) {

        if(n == 0) {return 0;}

        int floor = 1;

        while (n>0) {

            if (n-floor >= 0) {

                n-=floor;
                floor++;

            } else {
                break;
            }

        }

        return --floor;
    }

}
