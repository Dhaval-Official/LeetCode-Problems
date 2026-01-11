package Problems.All;

import java.util.HashMap;

public class Solution_1394 {
    public int findLucky(int[] arr) {

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int maxLucky = -1;

        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num,0)+1);
        }
//        System.out.println(hm);

        for (int key : hm.keySet()) {
//            System.out.println(key+" "+hm.get(key));
            if (key == hm.get(key)) {
                if (key > maxLucky) {
                    maxLucky = key;
                }
            }
        }

        return maxLucky;
    }

}
