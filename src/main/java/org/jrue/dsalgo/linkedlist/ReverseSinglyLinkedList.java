package org.jrue.dsalgo.linkedlist;

public class ReverseSinglyLinkedList {

    public SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if (head == null) return null;

        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode curr = head;
        SinglyLinkedListNode next;

        while(curr != null) {
           next = curr.getNext();
           curr.setNext(prev);
           prev = curr;
           curr = next;
        }

        return prev;
    }

}
