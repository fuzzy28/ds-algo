package org.jrue.dsalgo.btree;

import org.jrue.dsalgo.btree.BinaryTreeImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class TestBinaryTreeImpl {

    private BinaryTreeImpl tree;

    @Before
    public void setup() {
        tree = new BinaryTreeImpl(8);
    }

    @Test
    public void testAddNewNodeOnTheRight() {
        tree.add(60);
        tree.add(30);
        tree.add(35);
        tree.add(65);
        assertNull(tree.getRoot().getLeft());
        assertEquals(60,tree.getRoot().getRight().getValue());
        assertEquals(30,tree.getRoot().getRight().getLeft().getValue());
        assertEquals(35,tree.getRoot().getRight().getLeft().getRight().getValue());
        assertEquals(65, tree.getRoot().getRight().getRight().getValue());
    }

}
