package org.jrue.dsalgo.btree;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class TestBinaryTreeCheckIfIdentical {


    private BinaryTreeImpl tree1;
    private BinaryTreeImpl tree2;
    private BinaryTreeCheckIfIdentical treeCheckIfIdentical;

    @Before
    public void setup() {
        tree1 = new BinaryTreeImpl(50);
        tree1.add(60);
        tree1.add(55);
        tree1.add(65);
        tree1.add(40);
        tree1.add(30);
        tree1.add(45);

        tree2 = new BinaryTreeImpl(50);
        tree2.add(60);
        tree2.add(55);
        tree2.add(65);
        tree2.add(40);
        tree2.add(30);
        tree2.add(45);

        treeCheckIfIdentical = new BinaryTreeCheckIfIdentical(tree1.getRoot(), tree2.getRoot());
    }

    @Test
    public void testIsIdentical() {
        assertTrue(treeCheckIfIdentical.isIdentical());
    }

    @Test
    public void testIsNotIdentical() {
        tree2.getRoot().getRight().getRight().setValue(66);
        assertFalse(treeCheckIfIdentical.isIdentical());
    }

    @Test
    public void testNullTree() {
        treeCheckIfIdentical = new BinaryTreeCheckIfIdentical(tree1.getRoot(), null);
        assertFalse(treeCheckIfIdentical.isIdentical());
    }

}
