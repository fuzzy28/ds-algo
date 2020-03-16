package org.jrue.dsalgo.btree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinaryTreeVerticalSum {

    private BinaryTreeImpl tree;

    public BinaryTreeVerticalSum(BinaryTreeImpl tree) {
        this.tree = tree;
    }

    public Integer sumOf(int index) {
        return sumRecursively(tree.getRoot(), 0, new HashMap<Integer, Integer>()).get(index);
    }

    private Map<Integer, Integer> sumRecursively(Node<? extends Number> node, int i, Map<Integer, Integer> sum) {
        if (node == null) {
            return sum;
        }

        int currentTotal = node.getValue().intValue();
        if(sum.containsKey(i)) {
            currentTotal += sum.get(i);
        }

        sum.put(i, currentTotal);

        sumRecursively(node.getLeft(), i - 1, sum);
        sumRecursively(node.getRight(), i + 1, sum);
        return sum;
    }

}
