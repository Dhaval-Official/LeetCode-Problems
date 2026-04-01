package Problems.All;

public class Solution_1009 {

    public int bitwiseComplement(int n) {

        if (n == 0) {
            return 1;
        }

        StringBuilder sb = new StringBuilder();

        while(n>0) {

            int binary = n%2;
            n = n/2;

            if(binary == 0) {
                sb.append('1');
            } else {
                sb.append('0');
            }

        }

//        System.out.println(sb);
        int ans = sb.charAt(0) == '1' ? 1 : 0;
        int pow = 1;

        for (int i=1; i<sb.length();i++) {
            pow *= 2;
            if (sb.charAt(i) == '1') {
                ans += pow;
            }
        }

        return ans;
    }

}
