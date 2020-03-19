package org.jrue.dsalgo.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphImpl<E> {

    private final Map<E, List<E>> adjacentVertices;

    public GraphImpl() {
        adjacentVertices = new HashMap<>();
    }

    public void addVertex(E e) {
        adjacentVertices.putIfAbsent(e, new ArrayList<>());
    }

    public void addEdge(E vertexFrom, E vertextTo) {
        adjacentVertices.get(vertexFrom).add(vertextTo);
        adjacentVertices.get(vertextTo).add(vertexFrom);
    }

    public List<E> getAdjacentVertices(String vertex) {
        return adjacentVertices.get(vertex);
    }

    public Map<E, List<E>> getAdjacentVertices() {
        return new HashMap<>(adjacentVertices);
    }
}
