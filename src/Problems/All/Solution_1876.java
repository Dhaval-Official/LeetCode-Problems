package Problems.All;

public class Solution_1876 {

    public int countGoodSubstrings(String s) {

/*        //Solution1
        ArrayList<String> hs = new ArrayList<>();
        for (int i = 0; i < s.length()-2; i++) {
            if (s.charAt(i) != s.charAt(i+1) && s.charAt(i+1) != s.charAt(i+2) && s.charAt(i) != s.charAt(i+2)) {
                hs.add(s.substring(i,i+3));
            }
        }
//        System.out.println(hs);
        return hs.size();
*/
        //Solution2
        int count = 0;
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length - 2; i++) {
            char a = arr[i];
            char b = arr[i+1];
            char c = arr[i+2];

            if (a != b && b != c && a != c) {
                count++;
            }
        }

        return count;

    }

}
