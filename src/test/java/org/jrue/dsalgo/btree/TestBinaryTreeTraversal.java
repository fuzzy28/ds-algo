package org.jrue.dsalgo.btree;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;


@RunWith(JUnit4.class)
public class TestBinaryTreeTraversal {

    private BinaryTreeTraversal traversal;
    private BinaryTreeImpl tree;

    @Before
    public void setup() {
        this.tree = new BinaryTreeImpl(50);
        this.traversal = new BinaryTreeTraversal(tree.getRoot());
        tree.add(60);
        tree.add(55);
        tree.add(65);
        tree.add(40);
        tree.add(30);
        tree.add(45);
    }

    @Test
    public void testInOrderTraversal() {
        assertEquals("30 40 45 50 55 60 65", traversal.inOrder().trim());
    }

    @Test
    public void testPreOrderTraversal() {
        assertEquals("50 40 30 45 60 55 65", traversal.preOrder().trim());
    }

    @Test
    public void testPostOrderTraversal() {
        assertEquals("30 45 40 55 65 60 50", traversal.postOrder().trim());
    }

    @Test
    public void testLevelOrderTraversal() {
        assertEquals("50 40 60 30 45 55 65", traversal.levelOrder().trim());
    }
}
