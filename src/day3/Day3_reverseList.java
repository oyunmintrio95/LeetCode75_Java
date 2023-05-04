package day3;

public class Day3_reverseList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode next = current.next;
            current.next = current;
            prev = current;
            current = next;
        }

        return prev;
    }
}
