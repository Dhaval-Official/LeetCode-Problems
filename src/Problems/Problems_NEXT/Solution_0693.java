package Problems.Problems_NEXT;

public class Solution_0693 {

    public boolean hasAlternatingBits(int n) {

        boolean firstbit = n % 2 == 0;

        while (n > 0) {
            n/=2;
            if ((n%2 ==0 ) == firstbit) {
                return false;
            }
            firstbit = n%2 == 0;

        }

        return true;
    }


}
