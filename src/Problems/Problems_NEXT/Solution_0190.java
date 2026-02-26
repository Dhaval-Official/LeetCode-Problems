package Problems.Problems_NEXT;

public class Solution_0190 {

    public int reverseBits(int n) {

        StringBuilder sb = new StringBuilder();
        while (n>0) {
            if (n%2 == 0) {
                sb.append('0');
            } else {
                sb.append('1');
            }
            n=n/2;
        }

        while (sb.length() != 32) {
            sb.append('0');
        }
        int ans = 0;
        int power = 0;
        for (int i = sb.length()-1; i >= 0; i--) {
            if (sb.charAt(i) == '1') {
                ans = (int) (ans + Math.pow(2,power));
//                System.out.println(ans+" "+power);
            }
            power++;
        }

//        System.out.println(ans);
        return ans;
    }

}
