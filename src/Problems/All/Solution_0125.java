package Problems.All;

public class Solution_0125 {

    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder();


        for (char c: s.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                sb.append(c);
            }
        }

        StringBuilder sb2 = new StringBuilder(sb.reverse());
        sb.reverse();
//        System.out.println(sb);
//        System.out.println(sb2);

        return sb.compareTo(sb2) == 0;
    }

}
