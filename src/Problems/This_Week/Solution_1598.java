package Problems.This_Week;

import java.util.Objects;

public class Solution_1598 {

    public int minOperations(String[] logs) {

        int loc = 0;

        for (String log: logs) {
            if (Objects.equals(log, "./")) {
                continue;
            } else if (Objects.equals(log, "../")) {
                if (loc > 0) {
                    loc--;
                }
            } else {
                loc++;
            }
        }


        return loc;
    }

}
