package org.jrue.dsalgo.btree;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class TestBinaryTreeVerticalSum {

    private BinaryTreeVerticalSum verticalSum;
    private BinaryTreeImpl tree;

    @Before
    public void setup() {
        this.tree = new BinaryTreeImpl(50);
        tree.add(60);
        tree.add(55);
        tree.add(65);
        tree.add(40);
        tree.add(30);
        tree.add(45);
        this.verticalSum = new BinaryTreeVerticalSum(tree);
    }

    @Test
    public void test() {
        assertEquals(150, verticalSum.sumOf(0).intValue());
    }
}
