import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Leaf_nodes {
    public static int leafNodes(TreeNode root){
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        int leftLeaves = leafNodes(root.left);
        int rightLeaves = leafNodes(root.right);
        return leftLeaves + rightLeaves;
    }
    public static void main(String[] args) {
        //  root = [3,9,20,null,null,15,7] 
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Leaf_nodes tree = new Leaf_nodes();
        int leaves = tree.leafNodes(root);
        System.out.println("No. of leaf nodes in binary tree is: " + leaves);
    }
}