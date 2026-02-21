package Problems.All;

import java.util.HashMap;

public class Solution_3005 {

    public int maxFrequencyElements(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int maxvalue = 0;
        int maxKeyCount = 0;

        for (int i: nums){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }

//        System.out.println(hm);

        for (int i: hm.keySet()) {
            if (hm.get(i) > maxvalue) {
                maxvalue = hm.get(i);
            }
        }

        for (int i: hm.keySet()) {
            if (hm.get(i) == maxvalue) {
                maxKeyCount+=maxvalue;
            }
        }

        return maxKeyCount;

    }

}
/*
* Runtime
3
ms
Beats
30.53%
Analyze Complexity
Memory
44.22
MB
Beats
32.17%*/