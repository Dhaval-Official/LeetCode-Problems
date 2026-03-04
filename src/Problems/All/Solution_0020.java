package Problems.All;

import java.util.Stack;

public class Solution_0020 {
    public boolean isValid(String s) {

        if(s.charAt(0)=='}' || s.charAt(0)==')' || s.charAt(0)==']') {
            return false;
        }
        char invert='0';
        Stack st = new Stack<Character>();
        // st.push(s.charAt(0));
        for(int i=0;i<s.length();i++) {

            invert='0';
            if(s.charAt(i)=='}') {
                invert = '{';
            }
            if(s.charAt(i)==']') {
                invert = '[';
            }
            if(s.charAt(i)==')') {
                invert = '(';
            }
            if(invert != '0') {
                if(st.empty()) {
                    return false;
                }
                if(invert == (Character) st.peek()) {
                    st.pop();
                    continue;
                }
            }


            // System.out.print(s.charAt(i)+" ");
            st.push(s.charAt(i));


        }
        // System.out.println(st);
        return st.empty();
    }
}