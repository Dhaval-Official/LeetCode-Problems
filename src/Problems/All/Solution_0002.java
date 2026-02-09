package Problems.All;

import common.ListNode;

class Solution_0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode sumNode = new ListNode();
        sumNode.next = l1;
        ListNode prev = new ListNode();
        ListNode head = sumNode;
        ListNode l1Head = l1, l2Head = l2;
        boolean carry = false;
        ListNode last = new ListNode(69);

        while(l1 != null && l2 != null) {

            if(carry) {
                carry = false;
                l1.val++;
            }
            // System.out.println(l1.val+" + "+l2.val+" = "+(l1.val+l2.val)+" "+carry);
            l1.val = l1.val + l2.val;
            if(l1.val > 9) {
                l1.val-=10;
                carry = true;
            }

            sumNode.val = l1.val;
            prev = sumNode;
            sumNode = sumNode.next;
            l1 = l1.next;
            l2 = l2.next;

        }
        prev.next = null;
        // prev = prev.next;
        // System.out.println("HE HE HE HAA");
        // System.out.println(l2.val);
        if(l1 == null) {
            prev.next = l2;
        } else {
            prev.next = l1;
        }
        sumNode = prev;
        prev = prev.next;
        while(prev != null) {
            // System.out.print(prev.val+" ");
            if(carry) {
                prev.val++;
                carry = false;
            }

            if(prev.val > 9) {
                prev.val-=10;
                carry = true;
            }
            sumNode = sumNode.next;
            prev = prev.next;
        }

        if(carry) {
            ListNode carryInt = new ListNode(1);
            sumNode.next = carryInt;
        }



        return head;
    }
}