package Problems.Problems_0000;

public class Solution_0028 {
    public int strStr(String haystack, String needle) {

/*        boolean foundit = false;
        if(haystack.length() < needle.length()) {return -1;}
        int p = -1;

        for(int i=0;i<haystack.length();i++) {

            if(haystack.charAt(i) == needle.charAt(0)) {

                for(int j=i,k=0;k<needle.length();j++,k++) {
//                    System.out.println(haystack.charAt(i) +" "+ needle.charAt(0));
                   try {
                       if(haystack.charAt(j) == needle.charAt(k)) {
//                        System.out.println(" "+haystack.charAt(j) +" "+ needle.charAt(k));
                           foundit = true;

                       } else {
                           foundit = false;
                           break;
                       }
                   } catch (StringIndexOutOfBoundsException e) {
                       return -1;
                   }
                }
            }

            if(foundit) {
                p = i;
                break;
            }

        }


//        System.out.println("Final Answer");
        return p;

 */
        if(!(haystack.contains(needle))) {return -1;}
        boolean foundit = false;
        if(haystack.length() < needle.length()) {return -1;}
        int p = -1;

        for(int i=0;i<haystack.length();i++) {

            if(haystack.charAt(i) == needle.charAt(0)) {
            foundit = true;
                for(int j=i,k=0;k<needle.length();j++,k++) {
//                    System.out.println(haystack.charAt(i) +" "+ needle.charAt(0));

                   if(!(haystack.charAt(j) == needle.charAt(k))) {
//                      System.out.println(" "+haystack.charAt(j) +" "+ needle.charAt(k));
                       foundit = false;
                       break;
                   }
                }
            }

            if(foundit) {
                p = i;
                break;
            }

        }

        return p;

    }
}
