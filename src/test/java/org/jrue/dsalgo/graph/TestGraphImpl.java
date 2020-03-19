package org.jrue.dsalgo.graph;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class TestGraphImpl {

    private GraphImpl<String> graph;

    @Before
    public void setup() {
        graph = new GraphImpl<>();
        graph.addVertex("Joel");
        graph.addVertex("Angel");
        graph.addVertex("Michael");
        graph.addVertex("Lee");
        graph.addVertex("Rose");
    }

    @Test
    public void testAddVertex() {
        assertEquals(5, graph.getAdjacentVertices().size());
    }

    @Test
    public void testAddEdge() {
        graph.addEdge("Joel", "Angel");
        graph.addEdge("Joel", "Michael");
        graph.addEdge("Angel", "Lee");
        graph.addEdge("Angel", "Rose");
        assertEquals(3, graph.getAdjacentVertices("Angel").size());
    }
}
