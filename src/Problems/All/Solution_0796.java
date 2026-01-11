package Problems.All;

public class Solution_0796 {

    public boolean rotateString(String s, String goal) {

        String ss = s + s;
        return ss.contains(goal) && s.length()==goal.length();

    }
}
