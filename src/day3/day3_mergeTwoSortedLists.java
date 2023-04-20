package day3;

import java.util.List;

public class day3_mergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //check if any of the lists are null
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        //Declare head of the result list
        ListNode head;
        //Pointer for the resultant list
        ListNode result;
        if(list1.val < list2.val){
            result = head = new ListNode(list1.val);
            list1 = list1.next;
        }else{
            result = head = new ListNode(list2.val);
            list2 = list2.next;
        }
        //Loop until any of the list become null(traversing)
        while (list1 != null && list2 !=null){
            if(list1.val<list2.val){
                //set new value to the result node.
                result.next = new ListNode(list1.val);
                //move the pointer to the next value
                list1 = list1.next;
            }else{
                result.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            result = result.next;

        }

        //just in case there is leftover in each listnode
        while(list1 != null){
            result.next = new ListNode(list1.val);
            list1 = list1.next;
            result = result.next;
        }
        while(list2 != null){
            result.next = new ListNode(list2.val);
            list2 = list2.next;
            result = result.next;
        }


        return head;


    }

}
