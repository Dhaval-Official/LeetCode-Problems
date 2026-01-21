package Problems.All;

public class Solution_2544 {

    public int alternateDigitSum(int n) {

        int ans = 0;
        boolean add = true;
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i));
            if (add) {
//                add = false;
                ans = ans + (s.charAt(i) - '0');
            } else {
//                add = true;
                ans = ans - (s.charAt(i) - '0');
            }
            add = !add;

        }
//        if (ans == 0) {return 0;}
//        System.out.println(ans);
        return ans;
    }

}
