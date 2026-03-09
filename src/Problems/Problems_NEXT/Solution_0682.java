package Problems.Problems_NEXT;

import java.util.Objects;
import java.util.Stack;

public class Solution_0682 {

    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();
        int lastRecord;
        int secondLastRecord;

        for (String operation : operations) {

            if (Objects.equals(operation, "+")) {

                lastRecord = st.pop();
                secondLastRecord = st.peek();
                st.push(lastRecord);
                st.push(lastRecord + secondLastRecord);

            } else if (Objects.equals(operation, "C")) {

                st.pop();

            } else if (Objects.equals(operation, "D")) {

                lastRecord = st.peek();
                st.push(2 * lastRecord);

            } else {
                st.push(Integer.parseInt(operation));
            }

        }
//        System.out.println(st);
        int total = 0;
        while (!st.empty()) {
            total+=st.pop();
//            System.out.println(total);
        }


        return total;
    }
}