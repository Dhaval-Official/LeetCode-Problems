package Problems.All;

public class Solution_1716 {
    public int totalMoney(int n) {

        int totalMoney = 0;
//        int weeks = n/7;
//        int spareDays = n%7;

        for (int i = 1; i <= n/7; i++) {

            for (int j = i; j < i+7; j++) {
                totalMoney+= j;
//                System.out.println(totalMoney);
            }
        }
//        System.out.println("Full Weeks Done "+totalMoney);
        for (int i = 1; i <= n%7; i++) {
            totalMoney+= n/7 + i;
//            System.out.println(totalMoney);
        }

        return totalMoney;

    }
}
