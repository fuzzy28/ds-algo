package org.jrue.dsalgo.btree;

public class BinaryTreeCheckIfIdentical {

    private Node<Integer> tree1;
    private Node<Integer> tree2;

    public BinaryTreeCheckIfIdentical(Node<Integer> tree1, Node<Integer> tree2) {
        this.tree1 = tree1;
        this.tree2 = tree2;
    }

    public boolean isIdentical() {
        return isIdentical(tree1,tree2);
    }

    private boolean isIdentical(Node<Integer> tree1, Node<Integer> tree2) {
        boolean tree1Null = tree1 == null;
        boolean tree2Null = tree2 == null;

        if(tree1Null && tree2Null)
            return true;

        if(tree1Null ^ tree2Null)
            return false;

        return (tree1.getValue() == tree2.getValue()) &&
                isIdentical(tree1.getLeft(), tree2.getLeft()) &&
                isIdentical(tree1.getRight(), tree2.getRight());
    }

}
