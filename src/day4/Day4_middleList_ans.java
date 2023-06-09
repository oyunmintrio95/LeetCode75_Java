package day4;

import day3.ListNode;

public class Day4_middleList_ans {
    public ListNode middleNode(ListNode head) {
        ListNode t1 = head;
        ListNode t2 = head;
        while(t2!=null && t2.next!=null){
            t1 = t1.next;
            t2 = t2.next.next;
        }
        return t1;
    }
}
