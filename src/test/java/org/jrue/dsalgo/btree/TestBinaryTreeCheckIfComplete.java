package org.jrue.dsalgo.btree;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class TestBinaryTreeCheckIfComplete {


    private BinaryTreeImpl tree;
    private BinaryTreeCheckIfComplete checkIfComplete;

    @Before
    public void setup() {
        tree = new BinaryTreeImpl(50);
        checkIfComplete = new BinaryTreeCheckIfComplete(tree.getRoot());
    }

    @Test
    public void testIsComplete() {
        tree.add(60);
        tree.add(55);
        tree.add(65);
        tree.add(40);
        tree.add(30);
        tree.add(45);
        assertTrue(checkIfComplete.isComplete());
    }

    @Test
    public void testIsInComplete() {
        tree.add(60);
        tree.add(55);
        tree.add(65);
        tree.add(40);
        tree.add(45);
        assertFalse(checkIfComplete.isComplete());
    }



}
