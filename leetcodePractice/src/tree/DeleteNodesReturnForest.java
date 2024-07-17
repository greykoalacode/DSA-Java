package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteNodesReturnForest {
    public static List<TreeNode> delNodes(TreeNode root, int[] to_delete){
        List<TreeNode> tree = new ArrayList<>();
        if(root.left == null && root.right == null){
            return tree;
        }
        TreeNode currentNode = root;
        while(currentNode.right != null && currentNode.left != null){
            if(Arrays.stream(to_delete).filter(nodeVal -> nodeVal == currentNode.val).count() != 0){
//                tree.
            }
        }
        return tree;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int[] to_delete = {3,5};
        List<TreeNode> nodes = delNodes(root, to_delete);
        for(TreeNode eachNode: nodes){
            System.out.println(eachNode.val);
        }
    }
}
