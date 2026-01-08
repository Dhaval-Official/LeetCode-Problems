import Problems.All.Solution_1716;
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

        Solution_1716 s = new
                Solution_1716();

        int res = s
                .totalMoney(4);

        System.out.println(res);
//        System.out.println(res[0]);
//        System.out.println(res[1]);
//        for (int i = 0; i < res.length; i++) {
//            System.out.print(res[i]+", ");
//        }

    }


}
