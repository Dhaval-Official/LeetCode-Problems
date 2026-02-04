package Problems.All;

public class Solution_1208 {
    public int equalSubstring(String s, String t, int maxCost) {

        int[] distances = new int[s.length()];
        int ans = 0, temp, sum;

        for (int i = 0; i < s.length(); i++) {
            distances[i] = Math.abs(t.charAt(i) - s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            temp = 0;
            sum = 0;
            for (int j = i; j < s.length(); j++) {

                if (sum + distances[j] <= maxCost) {
                    sum += distances[j];
                    temp++;
                } else {
                    break;
                }

            }
//            System.out.println(t.charAt(i) +" "+ s.charAt(i) +" "+ distances[i] +" "+ sums[i] +" "+temp);
            if (temp > ans) {
                ans = temp;
            }

        }




        return ans;
    }
}