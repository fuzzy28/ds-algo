package org.jrue.dsalgo.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphImpl<E> {

    private final Map<E, List<E>> adjacentVertices;
    private final boolean biDirectional;

    public GraphImpl() {
        this.adjacentVertices = new HashMap<>();
        this.biDirectional = false;
    }

    public GraphImpl(boolean biDirectional) {
        this.adjacentVertices = new HashMap<>();
        this.biDirectional = biDirectional;
    }

    public GraphImpl(Map<E, List<E>> adjacentVertices) {
        this.adjacentVertices = new HashMap<>(adjacentVertices);
        this.biDirectional = false;
    }

    public GraphImpl(Map<E, List<E>> adjacentVertices, boolean biDirectional) {
        this.adjacentVertices = new HashMap<>(adjacentVertices);
        this.biDirectional = biDirectional;
    }

    public void addVertex(E e) {
        adjacentVertices.putIfAbsent(e, new ArrayList<>());
    }

    public void addEdge(E vertexFrom, E vertexTo) {
        adjacentVertices.get(vertexFrom).add(vertexTo);
        if(biDirectional)
            adjacentVertices.get(vertexTo).add(vertexFrom);
    }

    public void removeVertex(E e) {
        adjacentVertices.values().stream().forEach(l -> l.remove(e));
        adjacentVertices.remove(e);
    }

    public void removeEdge(E vertexFrom, E vertexTo) {
        adjacentVertices.get(vertexFrom).remove(vertexTo);
        if(biDirectional)
            adjacentVertices.get(vertexTo).remove(vertexFrom);
    }

    public List<E> getAdjacentVertices(E vertex) {
        return adjacentVertices.getOrDefault(vertex, new ArrayList<>());
    }

    public Map<E, List<E>> getAdjacentVertices() {
        return new HashMap<>(adjacentVertices);
    }

    public boolean isBiDirectional() {
        return biDirectional;
    }
}
