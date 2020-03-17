package org.jrue.dsalgo.btree;

public class BinaryTreeFindHeight {

    private Node<?> root;

    public BinaryTreeFindHeight(Node<?> root) {
        this.root = root;
    }

    public int getHeight() {
        if (root == null) return 0;

        return getHeight(root);
    }


    private int getHeight(Node<?> node) {
        if (node == null)
            return 0;

        int leftHeight = getHeight(node.getLeft());
        int rightHeight = getHeight(node.getRight());
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
