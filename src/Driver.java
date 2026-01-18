import Problems.All.Solution_2379;
import Problems.Problems_NEXT.Solution_0441;
import Problems.Problems_NEXT.Solution_3417;
import common.ListNode;

import java.util.List;

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



        ll0.next = ll1;
        ll1.next = ll2;
        ll2.next = ll3;
        ll3.next = ll4;
        ll4.next = ll5;
        ll5.next = ll6;
        ll6.next = ll7;
        ll7.next = ll8;


        System.out.println();
        ListNode ptr = llA.next;
//        while (ptr.next != null) {
//            System.out.println(ptr.val);
//            ptr = ptr.next;
//        }
        int[] arr = {1,1,2,2,3,4,2,3};
        int[] target = {3,7,11,9};
        int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};

        Solution_0441 s = new
                Solution_0441();

        int res = s
                .arrangeCoins(9);

        System.out.println(res);
//        System.out.println(res[0]);
//        for (int i = 0; i < res.length; i++) {
//            System.out.print(res[i]+", ");
//        }

    }

}
