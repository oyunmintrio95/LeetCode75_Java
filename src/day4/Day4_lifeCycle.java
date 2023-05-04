package day4;

import day3.ListNode;

public class Day4_lifeCycle {

    public ListNode detectCycle(ListNode head) {
        // Initialize two pointers, slow and fast, to the head of the linked list.
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {

                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return null;
    }
}
