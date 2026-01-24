package Problems.All;

public class Solution_0058 {
    public int lengthOfLastWord(String s) {

        int len = 0;
        int i = s.length() - 1;

        // Skipping trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Counting last word length
        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }

        return len;

    }
}
