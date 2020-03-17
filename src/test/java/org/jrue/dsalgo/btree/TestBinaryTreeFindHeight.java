package org.jrue.dsalgo.btree;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class TestBinaryTreeFindHeight {

    private BinaryTreeImpl tree;
    private BinaryTreeFindHeight findHeight;

    @Before
    public void setup() {
        tree = new BinaryTreeImpl(50);
        tree.add(60);
        tree.add(55);
        tree.add(65);
        tree.add(40);
        tree.add(30);
        tree.add(45);
        findHeight = new BinaryTreeFindHeight(tree.getRoot());
    }

    @Test
    public void testHeight1() {
        assertEquals(3, findHeight.getHeight());
    }


    @Test
    public void testHeight2() {
        assertEquals(3, findHeight.getHeight());
    }

}
