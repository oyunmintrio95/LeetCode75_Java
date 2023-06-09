package from1_to_10;

import day3.ListNode;

public class AddTwoNumber2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while(l1!=null || l2 != null || carry ==1){
            int sum = 0;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum %10);
            curr.next = node;// curr will point to the new node if we get
            curr = curr.next; // update current every time

        }
        return dummy.next;

    }
}
