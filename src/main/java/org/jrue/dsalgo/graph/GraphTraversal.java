package org.jrue.dsalgo.graph;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.Set;

public class GraphTraversal<E> {

    private GraphImpl<E> graph;

    public GraphTraversal(GraphImpl<E> graph) {
        this.graph = graph;
    }

    public Set<E> depthFirstSearch(GraphImpl<E> graph, E root) {
        this.graph = graph;
        return depthFirstSearch(root);
    }

    public Set<E> depthFirstSearch(E root) {
        Set<E> visited = new LinkedHashSet<>();
        Deque<E> stack = new ArrayDeque<>();

        stack.push(root);
        while(!stack.isEmpty()) {
            E current = stack.pop();
            if(visited.add(current)) {
                graph.getAdjacentVertices(current).forEach(stack::push);
            }
        }

        return visited;
    }
}
