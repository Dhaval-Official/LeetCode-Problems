package Problems.All;

public class Solution_0831 {

    public String maskPII(String s) {

        if (s.contains("@")) {
            return s.toLowerCase().charAt(0)+"*****"+s.substring(s.indexOf('@')-1).toLowerCase();
        } else {
            return maskNumber(s);
        }

    }

    public String maskNumber(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= '9' && s.charAt(i) >= '0') {
                sb.append(s.charAt(i));
            }
        }
//        System.out.println(sb);

        StringBuilder ans = new StringBuilder();
        if (sb.length() < 11) {
            ans.append("***-***-").append(sb, 6, 10);
        } else if (sb.length() < 12) {
            ans.append("+*-***-***-").append(sb, 7, 11);
        } else if (sb.length() < 13) {
            ans.append("+**-***-***-").append(sb, 8, 12);
        } else {
            ans.append("+***-***-***-").append(sb, 9, 13);
        }
//        System.out.println(ans);
        return ans.toString();
    }

}
