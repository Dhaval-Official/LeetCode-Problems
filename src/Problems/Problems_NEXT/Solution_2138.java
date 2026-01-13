package Problems.Problems_NEXT;

public class Solution_2138 {

    public String[] divideString(String s, int k, char fill) {

        String temp;
        String[] ans = new String[s.length()/k+1];
//
        int anscounter = 0;

        for (int i = 0; i < s.length(); i+=3) {

            if (i+k < s.length()) {
                temp = s.substring(i,i+k);
                ans[anscounter++] = temp;
            } else {
                break;
            }

        }

        if (s.length()%k != 0) {
//            temp = s.substring((s.length()k)%k);
            System.out.println("---"+s.length()%k);
        }

        return ans;

    }

}
