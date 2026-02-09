package Problems.All;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution_0387 {

    public int firstUniqChar(String s) {

        Map<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            lhm.put(s.charAt(i), lhm.getOrDefault(s.charAt(i),0)+1);
        }

        if (lhm.containsValue(1)) {
            for (int i = 0; i < s.length(); i++) {
                if (lhm.get(s.charAt(i)) == 1) {
                    return i;
                }
            }
        }

        return -1;

    }

}
