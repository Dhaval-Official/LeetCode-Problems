import Problems.All.Solution_0003;
import Problems.Problems_NEXT.Solution_1695;
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
        int[] arr = {187,470,25,436,538,809,441,167,477,110,275,133,666,345,411,459,490,266,987,965,429,166,809,340,467,318,125,165,809,610,31,585,970,306,42,189,169,743,78,810,70,382,367,490,787,670,476,278,775,673,299,19,893,817,971,458,409,886,434};
        int[] target = {3,7,11,9};
        int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};

        Solution_1695 s =
                new Solution_1695();

        int res = s
                .maximumUniqueSubarray(arr)
                ;
        System.out.println();
        System.out.println(res);
//        System.out.println(res[0]);
//        for (int i = 0; i < res.length; i++) {
//            System.out.print(res[i]+", ");
//        }

    }

}
