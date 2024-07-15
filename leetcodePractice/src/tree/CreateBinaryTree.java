package tree;

import java.util.HashMap;
import java.util.Map;

public class CreateBinaryTree {

    public static TreeNode createBinaryTreeEff(int[][] descriptions) {
        TreeNode[] nodes = new TreeNode[100001];
        boolean[] children = new boolean[100001];
        for (int[] node : descriptions) {
            if (nodes[node[0]] == null)
                nodes[node[0]] = new TreeNode(node[0]);

            if (nodes[node[1]] == null)
                nodes[node[1]] = new TreeNode(node[1]);

            if (node[2] == 1)
                nodes[node[0]].left = nodes[node[1]];
            else
                nodes[node[0]].right = nodes[node[1]];

            children[node[1]] = true;
        }
        for (int[] node : descriptions) {
            if (!children[node[0]])
                return nodes[node[0]];
        }
        return null;
    }

    public static TreeNode createBinaryTree(int[][] descriptions) {
        int parentVal = 0;
        int childVal = 0;
        Map<Integer, TreeNode> treeMap = new HashMap<>();
        for (int[] nodes : descriptions) {
            TreeNode parentNode = treeMap.getOrDefault(nodes[0], new TreeNode(nodes[0]));
            TreeNode childNode = treeMap.getOrDefault(nodes[1], new TreeNode(nodes[1]));
            if (nodes[2] == 1) {
                parentNode.left = childNode;
            } else {
                parentNode.right = childNode;
            }
            treeMap.put(nodes[0], parentNode);
            treeMap.put(nodes[1], childNode);
        }
        Map<Integer, Integer> childNodes = new HashMap<>();
        TreeNode parent = null;
        for (int[] nodes : descriptions) {
            childNodes.put(nodes[1], 1);
        }
        for (int[] nodes : descriptions) {
            if (!childNodes.containsKey(nodes[0])) {
                parent = treeMap.get(nodes[0]);
            }
        }
        return parent;
    }

    public static void main(String[] args) {
        int[][] desc = {{20, 15, 1}, {20, 17, 0}, {50, 20, 1}, {50, 80, 0}, {80, 19, 1}};
        long start1 = System.nanoTime();
        System.out.println(createBinaryTree(desc));
        double duration1 = (double) (System.nanoTime() - start1) / 100_000_000;
        long start2 = System.nanoTime();
        System.out.println(createBinaryTreeEff(desc));
        double duration2 = (double) (System.nanoTime() - start2) / 100_000_000;
        System.out.println(duration1 + "s " + duration2 + "s");

    }
}
