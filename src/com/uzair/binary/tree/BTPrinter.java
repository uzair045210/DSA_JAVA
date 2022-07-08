package com.uzair.binary.tree;

import com.uzair.binary.BNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BTPrinter {

    public static <T extends Comparable<?>> void printNode(BNode node) {
        int maxLevel = BTPrinter.maxLevel(node);

        printNodeInternal(Collections.singletonList(node), 1, maxLevel);
    }

    private static <T extends Comparable<?>> void printNodeInternal(List<BNode> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || BTPrinter.isAllElementsNull(nodes))
            return;

        int floor = maxLevel - level;
        int edgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        BTPrinter.printWhitespaces(firstSpaces);

        List<BNode> newNodes = new ArrayList<BNode>();
        for (BNode node : nodes) {
            if (node != null) {
                System.out.print(node.value);
                newNodes.add(node.left);
                newNodes.add(node.right);
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }

            BTPrinter.printWhitespaces(betweenSpaces);
        }
        System.out.println("");

        for (int i = 1; i <= edgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                BTPrinter.printWhitespaces(firstSpaces - i);
                if (nodes.get(j) == null) {
                    BTPrinter.printWhitespaces(edgeLines + edgeLines + i + 1);
                    continue;
                }

                if (nodes.get(j).left != null)
                    System.out.print("/");
                else
                    BTPrinter.printWhitespaces(1);

                BTPrinter.printWhitespaces(i + i - 1);

                if (nodes.get(j).right != null)
                    System.out.print("\\");
                else
                    BTPrinter.printWhitespaces(1);

                BTPrinter.printWhitespaces(edgeLines + edgeLines - i);
            }

            System.out.println("");
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    private static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++)
            System.out.print(" ");
    }

    private static <T extends Comparable<?>> int maxLevel(BNode node) {
        if (node == null)
            return 0;

        return Math.max(BTPrinter.maxLevel(node.left), BTPrinter.maxLevel(node.right)) + 1;
    }

    private static <T> boolean isAllElementsNull(List<BNode> list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }

}
