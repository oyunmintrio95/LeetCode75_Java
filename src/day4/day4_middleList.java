package day4;

import day3.ListNode;
public class day4_middleList {
    public ListNode middleNode(ListNode head) {

        // count how many index is in the head
        int count = 0;

        // set variable for middle index
        double midIdx = 0;

        // current is for counting length of the head
        ListNode current = head;
        // middle is for finding middleNode
        ListNode middle = head;

        //counting the length of the head
        while(current != null){
            count ++;
            // move the pointer until the end.
            current = current.next;
        }

        // find the middle index
        if(count %2 == 0){
            midIdx = (count/2.0)+0.5;
        }else{
            midIdx = (count/2) + 1;
        }

        // return the middle node
        for(int i = 1; i<midIdx; i++){
            middle = middle.next;
        }

        return middle;
    }
}
