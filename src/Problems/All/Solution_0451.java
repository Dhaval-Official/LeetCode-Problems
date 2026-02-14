package Problems.All;

import java.util.*;

public class Solution_0451 {

    public String frequencySort(String s) {

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        char c;
        StringBuilder ans = new StringBuilder("");
        int times;

        for (int i=0;i<s.length();i++) {
            c = s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);

        }
//        System.out.println(hm);

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(hm.entrySet());

        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        char ch;
        for (Map.Entry<Character, Integer> entry : list) {
//            times = ;
//            ch = ;
            ans.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

//        System.out.println(sortedHM);





//            System.out.println(ans);



        return ans.toString();
    }

}
