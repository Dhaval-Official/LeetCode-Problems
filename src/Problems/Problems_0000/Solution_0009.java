package Problems.Problems_0000;

public class Solution_0009 {
    public boolean isPalindrome(int x) {

        if(x < 0) {return false;}

        int L = x;
        int y = 0;

        while (L > 0){
            y = y*10 + L%10;
            L = L/10;
        };

        return (x == y);
    }
}
