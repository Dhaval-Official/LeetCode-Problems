package Problems.Problems_NEXT;

public class Solution_1796 {
    public int secondHighest(String s) {

        int max = -1;
        int secondMax = -1;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                int digit = ch - '0';

                if (digit > max) {
                    secondMax = max;
                    max = digit;
                } else if (digit < max && digit > secondMax) {
                    secondMax = digit;
                }
            }
        }

        return secondMax;
    }
}