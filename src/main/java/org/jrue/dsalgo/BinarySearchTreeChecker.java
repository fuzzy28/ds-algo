package org.jrue.dsalgo;

public class BinarySearchTreeChecker {

    private Node<Integer> root;

    public BinarySearchTreeChecker(Node<Integer> root) {
        this.root = root;
    }


    public boolean isValidBST() {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValidBST(Node<Integer> node, int min, int max) {
        if(node == null) {
            return true;
        }

        System.out.println("Checking current node with value :" + node.getValue() + ", min: " + min + ", max:" + max);

        if((node.getValue() >= min && node.getValue() < max) //current value
            && isValidBST(node.getLeft(), min, node.getValue()) //left node
            && isValidBST(node.getRight(), node.getValue(), max)) {
            return true;
        }

        return false;
    }


}

