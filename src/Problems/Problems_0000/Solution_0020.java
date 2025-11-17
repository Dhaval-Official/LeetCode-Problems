package Problems.Problems_0000;

import java.util.Stack;

public class Solution_0020 {
    public boolean isValid(String s) {

        if (s.charAt(0) == ')' | s.charAt(0) == ']' | s.charAt(0) == '}') {
            return false;
        }

        Stack<Character> st = new Stack<Character>();
//        System.out.println("Early "+ st);
        for (int i = 0; i < s.length(); i++) {

//            ch = s.charAt(i);
            if (s.charAt(i) == '(' | s.charAt(i) == '[' | s.charAt(i) == '{') {
                st.push(s.charAt(i));
            } else {
                if(st.empty()) {
                    return false;
                } else {
                    if (s.charAt(i) == ')' ) {
                        if (st.peek() == '(') {
                            st.pop();
                        } else {
                            return false;
                        }
                    } else if (s.charAt(i) == ']' ) {
                        if (st.peek() == '[' ) {
                            st.pop();
                        } else {
                            return false;
                        }
                    } else {
                        if (st.peek() == '{') {
                            st.pop();
                        } else {
                            return false;
                        }
                    }
                }
            }
//
        }

//        System.out.println(st);
//        System.out.println("Final Answer");
        return st.empty();

    }
}