package org.jrue.dsalgo.btree;

import org.jrue.dsalgo.IslandCounting;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;


@RunWith(JUnit4.class)
public class TestIslandCounting {

    private IslandCounting islandCounting;

    @Before
    public void setup() {
        islandCounting = new IslandCounting();
    }

    @Test
    public void testIslandCounting1() {
        int[][] matrix = {
                {1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}};
        assertEquals(6, islandCounting.countIsland(matrix));
    }

    @Test
    public void testIslandCounting2() {
        int[][] matrix = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1}};
        assertEquals(5, islandCounting.countIsland(matrix));
    }
}
