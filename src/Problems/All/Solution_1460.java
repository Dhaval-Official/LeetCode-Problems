package Problems.All;

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

/* better space time
* class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {

        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : target) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (!freq.containsKey(num)) {
                return false;
            }
            freq.put(num, freq.get(num) - 1);
            if (freq.get(num) == 0) {
                freq.remove(num);
            }
        }

        return freq.isEmpty();
    }
}
*/
