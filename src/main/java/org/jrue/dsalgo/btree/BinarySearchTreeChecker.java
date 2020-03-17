package org.jrue.dsalgo.btree;

public class BinarySearchTreeChecker {

    private Node<Integer> root;

    public BinarySearchTreeChecker(Node<Integer> root) {
        this.root = root;
    }


    public boolean isValidBST() {
        if(root == null) return true;

        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValidBST(Node<Integer> node, int min, int max) {
        if (node == null) {
            return true;
        }

        return (node.getValue() >= min && node.getValue() < max) &&
                isValidBST(node.getLeft(), min, node.getValue()) &&
                isValidBST(node.getRight(), node.getValue(), max);
    }

}

