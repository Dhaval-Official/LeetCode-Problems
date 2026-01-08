package Problems.All;

public class Solution_2259 {
    public String removeDigit(String number, char digit) {
        int n = number.length();

        for (int i = 0; i < n - 1; i++) {
            if (number.charAt(i) == digit && number.charAt(i + 1) > digit) {
                return number.substring(0, i) + number.substring(i + 1);
            }
        }

        // If no better option found, remove last occurrence
        int lastIndex = number.lastIndexOf(digit);
        return number.substring(0, lastIndex) + number.substring(lastIndex + 1);
    }
}
