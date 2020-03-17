package org.jrue.dsalgo.btree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTraversal {

    private Node<Integer> root;

    public BinaryTreeTraversal(Node<Integer> root) {
        this.root = root;
    }

    public String inOrder() {
        return inOrderRecursive(root, new StringBuilder()).toString();
    }

    public String preOrder()  {
        return preOrderRecursive(root, new StringBuilder()).toString();
    }

    public String postOrder() {
        return postOrderRecursive(root, new StringBuilder()).toString();
    }

    private StringBuilder inOrderRecursive(Node<?> node, StringBuilder result) {
        if(node == null) {
            return result;
        }

        inOrderRecursive(node.getLeft(), result);
        result.append(node.getValue() + " ");
        inOrderRecursive(node.getRight(), result);
        return result;
    }

    private StringBuilder preOrderRecursive(Node<?> node, StringBuilder result) {
        if(node == null) {
            return result;
        }

        result.append(node.getValue() + " ");
        preOrderRecursive(node.getLeft(), result);
        preOrderRecursive(node.getRight(), result);
        return result;
    }

    private StringBuilder postOrderRecursive(Node<?> node, StringBuilder result) {
        if(node == null) {
            return result;
        }

        postOrderRecursive(node.getLeft(), result);
        postOrderRecursive(node.getRight(), result);
        result.append(node.getValue() + " ");
        return result;
    }

    public String levelOrder() {
        StringBuilder sb = new StringBuilder();
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        while(nodes.peek() != null) {

            Node node = nodes.poll();
            if(node.getLeft() != null) {
                nodes.add(node.getLeft());
            }

            if(node.getRight() != null) {
                nodes.add(node.getRight());
            }

            sb.append(node.getValue() + " ");

        }

        return sb.toString();
    }
}
