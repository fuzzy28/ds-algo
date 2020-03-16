package org.jrue.dsalgo.btree;

import org.jrue.dsalgo.btree.BinarySearchTreeChecker;
import org.jrue.dsalgo.btree.Node;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class TestBinarySearchTreeChecker {

    private BinarySearchTreeChecker checker;
    private Node<Integer> root;

    @Before
    public void setup() {
        root = new Node<>(8);
        checker = new BinarySearchTreeChecker(root);
        root.setLeft(new Node(5));
        root.setRight(new Node(20));
        root.getLeft().setLeft(new Node(3));
        root.getLeft().setRight(new Node(7));
        root.getRight().setLeft(new Node(15));
        root.getRight().setRight(new Node(21));
        root.getLeft().getLeft().setLeft(new Node(2));
        root.getLeft().getLeft().setRight(new Node(4));
    }

    @Test
    public void testIsValidBST() {
        assertTrue(checker.isValidBST());
    }

    @Test
    public void testIsNotValidBST() {
        root.getLeft().getLeft().setRight(new Node(6));
        assertFalse(checker.isValidBST());
    }

}
