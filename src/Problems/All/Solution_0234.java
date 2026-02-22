package Problems.All;

import common.ListNode;

public class Solution_0234 {
    public boolean isPalindrome(ListNode head) {

        //Approach II
        int numOfNodes = 0;
        ListNode counter = head;
        ListNode ptr = head;
        int mid;

        while (counter != null) {
//            System.out.print(counter.val+"-->");
            numOfNodes++;
            counter = counter.next;
        }
        mid = numOfNodes/2;
        int[] half = new int[mid];
        int arrPtr = 0;

        for (int i=0; i< mid;i++) {
            half[arrPtr++] = ptr.val;
            ptr = ptr.next;
        }
        if (numOfNodes%2 == 1) {ptr = ptr.next;}

        for (int i=0; i< mid;i++) {

            if (half[--arrPtr] != ptr.val) {
                return false;
            }
            ptr = ptr.next;
        }


        return true;
    }

    /* Approach I
    * public boolean isPalindrome(ListNode head) {

        if(head.next == null) {
            return true;
        }

        ListNode slow = head, fast = head;
        Stack<Integer> s = new Stack<Integer>();
        // System.out.print("going in bag ");
        while(fast.next != null && fast.next.next != null) {

            s.push(slow.val);
            // System.out.print(" "+s.peek());
            fast = fast.next.next;
            slow = slow.next;

        }
        if(fast.next != null) {
            s.push(slow.val);
        }
        slow = slow.next;
        // System.out.println();
        while(slow.next != null) {
            // System.out.println(slow.val+" = "+s.peek());
            if(slow.val != s.pop()) {
                return false;
            }
            slow = slow.next;
        }
        // System.out.println(slow.val+" "+s.peek());
        return slow.val == s.pop();
    }*/
}
