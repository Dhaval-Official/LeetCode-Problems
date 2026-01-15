package Problems.All;

public class Solution_2138 {

    public String[] divideString(String s, int k, char fill) {

        String temp;
        int ansLength = s.length()%k == 0 ? s.length()/k : s.length()/k+1;
        String[] ans = new String[ansLength];
        int totalFixedStrs = s.length()/k;
//        int offset;
        int anscounter = 0;

        for (int i = 0; i < s.length(); i+=k) {

            if (i+k <= s.length()) {
                temp = s.substring(i,i+k);
                ans[anscounter++] = temp;
            } else {
                break;
            }

        }

        StringBuilder sb = new StringBuilder("");
        if (s.length()%k != 0) {

//            offset = totalFixedStrs * k;
//            System.out.println(s.charAt(offset));
            temp = s.substring(totalFixedStrs * k);
//            System.out.println("---"+temp);
            sb.append(temp);
            for (int i = 0; i < k-temp.length(); i++) {
                sb.append(fill);
            }
//            System.out.println(sb);

            ans[ans.length-1] = sb.toString();
        }

        return ans;

    }

}
