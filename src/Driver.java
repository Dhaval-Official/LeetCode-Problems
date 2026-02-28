import Problems.All.Solution_3560;
import Problems.Problems_NEXT.*;
//import Problems.Problems_NEXT.*;
import common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        ListNode ll0 = new ListNode(1);
        ListNode ll1 = new ListNode(2);
        ListNode ll2 = new ListNode(7);
        ListNode ll3 = new ListNode(2);
        ListNode ll4 = new ListNode(1);
        ListNode ll5 = new ListNode(1);
        ListNode ll6 = new ListNode(6);
        ListNode ll7 = new ListNode(7);
        ListNode ll8 = new ListNode(8);

        ll0.next = ll1;
        ll1.next = ll2;
        ll2.next = ll3;
        ll3.next = ll4;
//        ll4.next = ll5;
//        ll5.next = ll6;
//        ll6.next = ll7;
        ll7.next = ll8;

        System.out.println();
//        ListNode ptr = llA.next;
//        while (ptr.next != null) {
//            System.out.println(ptr.val);
//            ptr = ptr.next;
//        }
        ArrayList<Integer> al = new ArrayList<>(List.of(2,5,7,8,9,2,3,4,3,1));
        int[] arr = {2,5,7,8,9,2,3,4,3,1};
        String[] strArr = {"abc","car","ada","racecar","cool"};
        int[] target = {3,7,11,9};
        int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
        String str = "PAHNAPLSIIGYIR";

        Solution_3560 s =
                new Solution_3560();

        System.out.println();
        System.out.println("\nANS: "+
                s.minCuttingCost(6,5,5)
        );
//        System.out.println(res[0]);
//        for (int i = 0; i < res.length; i++) {
//            System.out.print(res[i]+", ");
//        }

        Solution_9999 s9 = new Solution_9999();

    }

}
//