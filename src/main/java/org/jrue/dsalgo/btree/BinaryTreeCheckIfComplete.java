package org.jrue.dsalgo.btree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeCheckIfComplete {

    private Node<?> root;

    public BinaryTreeCheckIfComplete(Node<?> root) {
        this.root = root;
    }

    public boolean isComplete() {
        boolean end = false;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            Node cur = queue.poll();
            if(cur == null) end = true;
            else{
                if(end) return false;
                queue.add(cur.getLeft());
                queue.add(cur.getRight());
            }
        }
        return true;
    }



}
