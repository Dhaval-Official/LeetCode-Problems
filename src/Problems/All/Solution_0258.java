package Problems.All;
//solved earlier in oldID
public class Solution_0258 {

    public int addDigits(int num) {

        if(num < 10) {
            return num;
        }

        while(num >= 10) {

            num = newNum(num);
//            System.out.println(num);
            if(num < 10) {
                return num;
            }

        }

        return 69;
    }

    int newNum(int num) {

        int total = 0;
        while(num > 0) {
            total+=num%10;
            num = num/10;
        }

        return total;
    }

}
