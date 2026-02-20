package Problems.All;

import java.util.HashMap;

public class Solution_1897 {

    public boolean makeEqual(String[] words) {

        HashMap<Character, Integer> ht = new HashMap<>();

        for (String word: words) {

            for (int i = 0; i < word.length(); i++) {
//                char letter = ;
                ht.put(word.charAt(i), ht.getOrDefault(word.charAt(i),0)+1);
            }

        }

        for (char c: ht.keySet()) {
            if(ht.get(c)%words.length != 0) {
                return false;
            }
        }


        return true;
    }

}
/*

//Advance
public boolean makeEqual(String[] words) {
        int n = words.length;
        if (n <= 1) return true;

        int[] counts = new int[26];

        for (String word : words) {
            for (char c : word.toCharArray()) {
                counts[c - 'a']++;
            }
        }

        for (int count : counts) {
            if (count % n != 0) {
                return false;
            }
        }

        return true;
    }
*/
