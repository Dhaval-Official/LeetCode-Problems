package Problems.Problems_0000;

public class Solution_0014 {

    public String longestCommonPrefix(String[] strs) {

        StringBuffer realcommon = new StringBuffer("");
        String s = strs[0];
        char common;
//        common = new StringBuilder(s);
        boolean diffFound = false;

        for (int i = 0; i < strs[0].length()-1; i++) {
            common = strs[0].charAt(i);
            for (int j=1;j<strs.length-1;j++) {
                if(common != strs[j].charAt(i)) {
                    diffFound = true;
                    break;
                }
            }
            if(diffFound) {
                break;
            } else {
                realcommon.append(common);
            }
        }


        return realcommon.toString();
    }

}
