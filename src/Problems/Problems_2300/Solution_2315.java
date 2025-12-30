package Problems.Problems_2300;

public class Solution_2315 {
    public int countAsterisks(String s) {

        boolean countAss = true;
        int asCounted = 0;

        for (int i = 0; i <s.length(); i++) {

            if (countAss) {
                if(s.charAt(i) == '*') {
                    asCounted++;
                }
            }

            if(s.charAt(i) == '|') {
//                System.out.println("caught |");
                if (countAss) {
                    countAss = false;
                } else {
                    countAss = true;
                }
            }


        }


        return asCounted;
    }
}