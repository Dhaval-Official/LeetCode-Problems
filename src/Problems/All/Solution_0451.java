package Problems.All;

import java.util.*;

public class Solution_0451 {

    public String frequencySort(String s) {

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        StringBuilder ans = new StringBuilder("");

        for (int i=0;i<s.length();i++) {
            hm.put( s.charAt(i),hm.getOrDefault( s.charAt(i),0)+1);

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
