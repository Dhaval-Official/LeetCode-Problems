package Problems.Problems_NEXT;

public class Solution_2748 {
    public int countBeautifulPairs(int[] nums) {

        int BeautifulPairs = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {
//                System.out.println(nums[i]+" "+nums[j]);
                if (firstAndLast(nums[i], nums[j])) {
                    BeautifulPairs++;
                }

            }

        }

        return 69;
    }

    public boolean firstAndLast(int x, int y) {

        int lasty = y%10;
        int firstx = x;
        while (x >= 10) {
            firstx = x/10;
            x/=10;
        }

        if(firstx == lasty) {return true;}
        if (firstx > lasty) {
            return GCD(lasty, firstx);
        }

        return GCD(firstx, lasty);
    }

    public boolean GCD(int x, int y) {

        for (int i = x; i < y; i++) {
            if (y%x == 0) {

            }
        }

        return true;
    }

}
