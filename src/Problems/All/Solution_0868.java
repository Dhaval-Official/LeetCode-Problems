package Problems.All;

public class Solution_0868 {

    public int binaryGap(int n) {

        int maxGap = 0;
        int gap = 0;
        boolean check = false;

        while (n > 0) {
//            System.out.print(n%2);
            if (n%2 == 1) {

                if (maxGap < gap) {maxGap = gap;}
                gap = 1;
                check = true;

            } else if (check){

                gap++;


            }
            n/=2;
        }

//        System.out.println();
//        System.out.println(maxGap++);

//        if (maxGap == 0) {return 0;}

        return maxGap;
    }

}
