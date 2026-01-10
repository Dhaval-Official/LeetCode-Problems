package Problems.Problems_NEXT;

public class Solution_1704 {

    public boolean halvesAreAlike(String s) {

        int midpoint = s.length()/2;
        String vowels = "aeiouAEIOU";
        int a = 0, b = 0;

        for (int i = 0; i < s.length()/2; i++) {
            if (vowels.contains(s.substring(i,i+1))) {
                a++;
            }

            if (vowels.contains(s.substring(midpoint+i,midpoint+i+1))) {
                b++;
            }
        }

//        System.out.println(s1 + " " + a + " " + s2 + " " + b);

        return a == b;
    }

}
