import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
public class Max_depth {

    public static int maxDepth(TreeNode root){
        if(root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;

    }
    public static void main(String[] args) {
        //  root = [3,9,20,null,null,15,7] 
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Max_depth tree = new Max_depth();
        int depth = tree.maxDepth(root);
        System.out.println("Maximum depth of binary tree is: " + depth);    
    }
}