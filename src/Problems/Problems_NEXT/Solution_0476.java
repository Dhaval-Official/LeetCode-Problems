package Problems.Problems_NEXT;

public class Solution_0476 {
    public int findComplement(int num) {

        StringBuilder binary = new StringBuilder();
        int ans = 0;
        int power = 1;
        //binary's compliment conversion
        while (num > 0) {
            if (num%2 == 1) {
                binary.append('0');
            } else {
                binary.append('1');
            }
            num/=2;
        }
        System.out.println(binary);

        for (int i = binary.length()-1; i >= 0 ; i--) {
//            System.out.println(binary.charAt(i));
            if (binary.charAt(i) == '1') {
                ans = ans + 1*power;
            }
            power = power * 2;
        }

        System.out.println(ans);

        return ans;
    }
}
