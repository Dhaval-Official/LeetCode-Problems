package Problems.All;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution_2465 {

    public int distinctAverages(int[] nums) {

        ArrayList<Integer> al = new ArrayList<Integer>(nums.length);
        for (int num : nums) {
            al.add(num);
        }

        HashSet<Double> hs = new HashSet<Double>();

        int currMax, currMin;
//        double d;
        while (!al.isEmpty()) {
            currMax = returnMax(al);
            currMin = returnMin(al);
//            d = (double) (currMin + currMax) /2;
//            System.out.println(currMax+" "+currMin+" "+al+" =>"+d);
            hs.add((double) (currMin + currMax) /2);
            al.remove((Integer) currMax);
            al.remove((Integer) currMin);
        }


        return hs.size();
    }

    public int returnMax(ArrayList<Integer> ar) {

        int max = -1;
        for (int i : ar) {
            if (i >max) {
                max = i;
            }
        }
        return max;

    }

    public int returnMin(ArrayList<Integer> ar) {

        int min = 999;
        for (int i : ar) {
            if (i < min) {
                min = i;
            }
        }
        return min;

    }


}
