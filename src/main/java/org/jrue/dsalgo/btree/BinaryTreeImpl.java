package org.jrue.dsalgo.btree;

public class BinaryTreeImpl {

    private Node<Integer> root;

    public BinaryTreeImpl(Integer rootValue) {
        root = new Node<>(rootValue);
    }


    public void add(Integer value) {
        add(root, value);
    }

    private Node<Integer> add(Node<Integer> current, Integer value) {
        if (current == null) {
            return new Node<>(value);
        }

        if(current.getValue().intValue() > value.intValue() ) {
            current.setLeft(add(current.getLeft(), value));
        } else {
            current.setRight(add(current.getRight(), value));
        }

        return current;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> root) {
        this.root = root;
    }
}
