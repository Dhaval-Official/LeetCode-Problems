package Problems.Problems_1400;

public class Solution_1460 {

    public boolean canBeEqual(int[] target, int[] arr) {

        boolean replacementPresent;

        for (int i = 0; i < target.length; i++) {

            if (target[i] != arr[i]) {
                replacementPresent = searchReplacement(arr, target[i], i);
                if (replacementPresent) {
                    arr = reverseSubArr(arr, i, target[i]);
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean searchReplacement(int[] arr, int targetValue, int offset) {

        for (int i = offset; i < arr.length; i++) {
            if (targetValue == arr[i]) {
                return true;
            }
        }

        return false;
    }

    public int[] reverseSubArr(int[] arr, int start, int target) {

        int[] revarr = arr.clone();
        int subArrlimit=0;
        int reversepointer=0;

        for (int i = start; i < arr.length; i++) {
            if (arr[i] == target)  {
                subArrlimit = i;
                reversepointer = i;
            }
        }

        for (int i = start; i <= subArrlimit; i++) {
            revarr[i] = arr[reversepointer--];
        }

        return revarr;
    }

}
