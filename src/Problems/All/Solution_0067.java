package Problems.All;

public class Solution_0067 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int aptr = a.length() - 1;
        int bptr = b.length() - 1;
        int carry = 0;

        while (aptr >= 0 || bptr >= 0 || carry == 1) {
            int sum = carry;

            if (aptr >= 0) sum += a.charAt(aptr--) - '0';
            if (bptr >= 0) sum += b.charAt(bptr--) - '0';

            sb.append(sum % 2);
            carry = sum / 2;
        }

        return sb.reverse().toString();
    }
}