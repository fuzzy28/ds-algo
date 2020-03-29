package org.jrue.dsalgo.linkedlist;

public class SinglyLinkedListNode {

    private int value;
    private SinglyLinkedListNode next;

    public SinglyLinkedListNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SinglyLinkedListNode getNext() {
        return next;
    }

    public void setNext(SinglyLinkedListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        SinglyLinkedListNode n = next;
        while(n != null) {
            sb.append(" -> " + n.value);
            n = n.next;
        }
        return "SinglyLinkedListNode{ " + value + sb.toString() + " }";
    }
}
