package Problems.All;

public class Solution_0014 {

    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 1) {return strs[0];}

        StringBuilder realcommon = new StringBuilder();
        String s = strs[0];
        char common;
        boolean diffFound = false;

        for (int i = 0; i < strs[0].length(); i++) {
            common = strs[0].charAt(i);

            for (int j=1;j<strs.length;j++) {
                if(i<strs[j].length()) {
                    if (common != strs[j].charAt(i)) {
                        diffFound = true;
                        break;
                    }
                } else {
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
