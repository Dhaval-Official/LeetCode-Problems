import Problems.Problems_0000.Solution_0014;
import common.ListNode;

public class Driver {

    public static void main(String[] args) {


        ListNode ll0 = new ListNode(0);
        ListNode ll1 = new ListNode(1);
        ListNode ll2 = new ListNode(2);
        ListNode ll3 = new ListNode(3);
        ListNode ll4 = new ListNode(4);
        ListNode ll5 = new ListNode(5);
        ListNode ll6 = new ListNode(6);
        ListNode ll7 = new ListNode(7);
        ListNode ll8 = new ListNode(8);

        ll0.next = ll1;

        String[] arr = {"dog","dog","dog","do"};

        Solution_0014 s1 = new Solution_0014();
        System.out.println(s1.longestCommonPrefix(arr));
        System.out.println();
    }


}
