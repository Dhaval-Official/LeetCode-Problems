package Problems.All;

public class Solution_0476 {
    public int findComplement(int num) {

//        System.out.println("PS: "+num);
        int ans = 0;
        int power = 1;

        while (num > 0) {
            if (num%2 == 0) {
                ans += power;
            }
            num/=2;
            power*=2;
        }

        return ans;
    }
}
