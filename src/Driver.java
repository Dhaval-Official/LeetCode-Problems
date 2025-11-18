import Problems.Problems_0000.Solution_0014;
import Problems.Problems_0000.Solution_0020;
import Problems.Problems_0000.Solution_0027;
import Problems.Problems_0000.Solution_0028;
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

        ListNode llA = new ListNode(-69);
        ListNode llB = new ListNode(-69);




        System.out.println();
        ListNode ptr = llA.next;
//        while (ptr.next != null) {
//            System.out.println(ptr.val);
//            ptr = ptr.next;
//        }
        Solution_0028 s28 = new Solution_0028();
        String haystack = "Miissippi", needle = "issip";

        System.out.println(s28.strStr(haystack,needle));


    }


}
