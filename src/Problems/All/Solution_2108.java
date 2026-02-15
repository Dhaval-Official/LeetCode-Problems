package Problems.All;

public class Solution_2108 {
/*
    public String firstPalindrome(String[] words) {

        boolean match;
        for(String word: words) {
            int L=0, R=word.length()-1;
            match = true;
            while (L < R) {
                if (word.charAt(L++) != word.charAt(R--)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return word;
            }

        }


        return "";
    }

 */
public String firstPalindrome(String[] words) {
    for (String word : words) {
        if (isPalindrome(word)) {
            return word;
        }
    }
    return "";
}

    private boolean isPalindrome(String s) {
        int L = 0, R = s.length() - 1;
        while (L < R) { // No need for <=, the middle char always matches itself
            if (s.charAt(L++) != s.charAt(R--)) {
                return false; // Fail fast
            }
        }
        return true; // If we finish the loop, it's a palindrome
    }
}
