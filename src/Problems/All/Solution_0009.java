package Problems.All;

public class Solution_0009 {
    public boolean isPalindrome(int x) {

        if(x < 0) {return false;}

        int R,L;
        int newLeft = 0;
        L = x;

        while (L > 0){
            R = L%10;
            newLeft = newLeft*10 + R;
//            System.out.println(L+" "+R+" "+newLeft);
            L = L/10;
        };
//        System.out.println(x);
//        System.out.println(newLeft);
        return (x == newLeft);
    }

    /*this is more Optimized version on Leetcode
    *
    * public boolean isPalindrome(int x) {

        if(x < 0) {return false;}

        int L = x;
        int y = 0;

        while (L > 0){
            y = y*10 + L%10;
            L = L/10;
        };

        return (x == y);
    }*/
}
