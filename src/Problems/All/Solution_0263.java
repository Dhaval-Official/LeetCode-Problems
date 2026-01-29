package Problems.All;

public class Solution_0263 {

    public boolean isUgly(int n) {

        if (n < 1) {return false;}

        //factoring down by 2
        while (n%2 == 0) {
            n/=2;
        }

        //factoring down by 3
        while (n%3 == 0) {
            n/=3;
        }

        //factoring down by 5
        while (n%5 == 0) {
            n/=5;
        }

//        System.out.println(n+" "+num);

        return n == 1;
    }

}
