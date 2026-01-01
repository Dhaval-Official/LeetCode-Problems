package Problems.Problems_1500;

public class Solution_1502 {

    public boolean canMakeArithmeticProgression(int[] arr) {

        int minCurr;
        int gap=Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {
            minCurr = arr[i];
            for (int j = i; j < arr.length; j++) {
                if(arr[j] < minCurr) {
                    minCurr = arr[j];
                    arr[j] = arr[i];
                    arr[i] = minCurr;
                }
            }
            if (i == 1) {
//                gap = ;
                gap = Math.abs(arr[1] - arr[0]);
//                System.out.println(gap);
            }
            if (i >= 2) {
                if (arr[i] - arr[i-1] != gap) {
                    return false;
                }
            }

        }

        return true;
    }
}