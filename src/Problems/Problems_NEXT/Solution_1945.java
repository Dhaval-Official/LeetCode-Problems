package Problems.Problems_NEXT;

public class Solution_1945 {

    public int getLucky(String s, int k) {

        //convert & k1
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {

            int temp = s.charAt(i) - '0' - 48;
//            System.out.println(s.charAt(i)+" "+temp);
            if (temp > 9) {
                ans+=temp%10;
                temp/=10;
            }
            ans+=temp;

        }
        if(k == 1) {return ans;}
        int kcounter = 1;

        int temp;
        while (kcounter != k) {

            if (ans/10 == 0) {
                return ans;
            }
            temp = ans;
            ans = 0;
            while (temp > 0) {
                ans += temp%10;
                temp/=10;
            }


            kcounter++;
        }


        return ans;
    }

}
