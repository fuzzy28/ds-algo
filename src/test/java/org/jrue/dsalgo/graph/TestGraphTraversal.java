package org.jrue.dsalgo.graph;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class TestGraphTraversal {

    private GraphImpl<Integer> graph;
    private GraphTraversal<Integer> graphTraversal;

    @Before
    public void setup() {
        graph = new GraphImpl<>();
        graphTraversal = new GraphTraversal<>(graph);

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addVertex(7);

        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.addEdge(3,6);
        graph.addEdge(6,7);
        graph.addEdge(4,5);

    }

    @Test
    public void testDFS() {
        assertEquals("[1, 3, 6, 7, 4, 5, 2]", graphTraversal.depthFirstSearch(1));
    }

}
