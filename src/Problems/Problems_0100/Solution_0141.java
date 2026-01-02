package Problems.Problems_0100;

import common.ListNode;

public class Solution_0141 {

    public boolean hasCycle(ListNode head) {

        if(head == null || head.next == null || head.next.next == null)
            return false;

        ListNode fast = head;
        ListNode slow = head;

        while(true) {

            fast = fast.next.next;
            slow = slow.next;

            if(fast == null || fast.next == null) {
                return false;
            }

            if(fast.next == slow.next) {
                return true;
            }

        }

    }

}