package Problems.Problems_0000;

import common.ListNode;

class Solution_0021 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode answer = new ListNode();
        ListNode answerHead = answer;
        int loop = 0;

        while(loop != 10) {

            if(list1 == null) {
                answer.next = list2;
                break;
            }

            if(list2 == null) {
//                System.out.println("it ends here");
                answer.next = list1;
                break;
            }

            if(list1.val <= list2.val) {
                answer.next = list1;
                list1 = list1.next;
            } else {
                answer.next = list2;
                list2 = list2.next;
            }

            answer = answer.next;
//            System.out.print(answer.val+" ");


        }

        return answerHead.next;

    }

}