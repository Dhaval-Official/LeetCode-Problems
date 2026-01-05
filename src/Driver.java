import Problems.Problems_0000.*;
import Problems.Problems_0400.Solution_0485;
import Problems.Problems_1300.Solution_1394;
import Problems.Problems_1400.Solution_1460;
import Problems.Problems_1400.Solution_1470;
import Problems.Problems_1500.Solution_1502;
import Problems.Problems_1600.Solution_1668;
import Problems.Problems_1700.Solution_1725;
import Problems.Problems_1900.Solution_1929;
import Problems.Problems_2200.Solution_2259;
import Problems.Problems_2300.Solution_2315;
import Problems.Problems_2400.Solution_2402;
import Problems.Problems_2400.Solution_2465;
import Problems.Problems_2500.Solution_2500;
import Problems.Problems_3400.Solution_3492;
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
        int[] arr = {1,2,2,3,3,2};
        int[] target = {3,7,11,9};
        int[][] arr2 = {{1,2,4},{3,3,1}};

        Solution_2500 s = new
                Solution_2500();

        int res = s
                .deleteGreatestValue(arr2);

        System.out.println(res);
//        System.out.println(res[0]);
//        System.out.println(res[1]);
//        for (int i = 0; i < res.length; i++) {
//            System.out.print(res[i]+", ");
//        }

    }


}
