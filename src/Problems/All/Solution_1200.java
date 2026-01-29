package Problems.All;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_1200 {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp;
        int minDiff = Integer.MAX_VALUE;

//        for (int i = 0; i < arr.length; i++) {System.out.print(arr[i]+" ");}

        Arrays.sort(arr);

//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {System.out.print(arr[i]+" ");}

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1] - arr[i] < minDiff) {
                minDiff = arr[i+1] - arr[i];
            }
        }

//        System.out.println(minDiff);

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1] - arr[i] == minDiff) {
                temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                ans.add(temp);
            }

        }



        return ans;
    }

}
