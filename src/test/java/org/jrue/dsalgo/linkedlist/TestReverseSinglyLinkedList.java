package org.jrue.dsalgo.linkedlist;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestReverseSinglyLinkedList {


    private ReverseSinglyLinkedList reverseSinglyLinkedList;

    @Before
    public void setup() {
        reverseSinglyLinkedList = new ReverseSinglyLinkedList();
    }


    @Test
    public void testReverseLinkedList() {
        SinglyLinkedListNode head = new SinglyLinkedListNode(1);
        SinglyLinkedListNode two = new SinglyLinkedListNode(2);
        SinglyLinkedListNode three = new SinglyLinkedListNode(3);
        SinglyLinkedListNode four = new SinglyLinkedListNode(4);
        SinglyLinkedListNode five = new SinglyLinkedListNode(5);
        head.setNext(two);
        head.getNext().setNext(three);
        head.getNext().getNext().setNext(four);
        head.getNext().getNext().getNext().setNext(five);
        assertEquals("SinglyLinkedListNode{ 1 -> 2 -> 3 -> 4 -> 5 }", head.toString());
        reverseSinglyLinkedList.reverse(head);
        assertEquals("SinglyLinkedListNode{ 5 -> 4 -> 3 -> 2 -> 1 }", five.toString());
    }

}
