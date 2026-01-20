package Problems.All;

import common.ListNode;

public class Solution_0083 {
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null) {

            if(slow.val == fast.val) {
                fast = fast.next;
            } else {
                slow.next = fast;
                slow = slow.next;
            }

        }
        slow.next = null;
        // System.out.println();
        return head;
    }
}