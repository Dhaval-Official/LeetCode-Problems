package Problems.All;

public class Solution_2180 {

    public int countEven(int num) {

        int ans = 0, temp, sum;

        for (int i = 1; i <= num; i++) {
            temp = i;
            sum = 0;
            while (temp != 0) {
                sum+=temp%10;
                temp/=10;
            }
            if (sum %2 == 0) {
                ans++;
//                System.out.println(i);
            }
        }

        return ans;
    }

}
