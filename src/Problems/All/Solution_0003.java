package Problems.All;

import java.util.HashSet;
import java.util.Set;

public class Solution_0003 {

    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();


        if (s.isEmpty()) {return 0;}
        if (s.charAt(0) == ' ') {return 1;}
        int ans = 1;

        for (int i = 0; i < s.length(); i++) {
//            System.out.println("Iteration "+i);
            for (int j = i; j < s.length(); j++) {

                if (set.contains(s.charAt(j))) {
                    ans = Math.max(ans, set.size());
                    set.clear();
                    break;
                } else {
                    set.add(s.charAt(j));
                }
//                System.out.println(set);
            }

//            System.out.println("ans:"+ans);

        }

//        System.out.println(ans);
        return ans;
    }

/*
* public int lengthOfLongestSubstring(String s) {
    // Sliding window using a HashSet
    Set<Character> set = new HashSet<>();
    int left = 0, ans = 0;

    for (int right = 0; right < s.length(); right++) {
        // While the character at 'right' is a duplicate,
        // slide 'left' forward and remove characters from the set
        while (set.contains(s.charAt(right))) {
            set.remove(s.charAt(left));
            left++;
        }

        set.add(s.charAt(right));
        // Window size formula: (right - left + 1)
        ans = Math.max(ans, right - left + 1);
    }

    return ans;
}
*
* */
}
