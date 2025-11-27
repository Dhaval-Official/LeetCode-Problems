package Problems.Problems_0000;

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
                if(fast == null) {
                    // System.out.print("wola");
                    slow.next = null;
                    break;
                }
            } else {
                // System.out.print(slow.val+"->");
                slow.next = fast;
                slow = slow.next;

            }
        }
        System.out.println();
        return head;
    }
}
