// Statically --- Without Recursion --- Queue Used

import java.util.*;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
        this.left = this.right = null;
    }
}

public class mirrorTree {

    private static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root.left);
        q.offer(root.right);

        while (!q.isEmpty()) {
            TreeNode n1 = q.poll();
            TreeNode n2 = q.poll();

            if (n1 == null && n2 == null) {
                continue;
            }
            if (n1 == null || n2 == null) {
                return false;
            }
            if (n1.value != n2.value) {
                return false;
            }

            q.offer(n1.left);
            q.offer(n2.right);
            q.offer(n1.right);
            q.offer(n2.left);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 2, 3, 4, 4, 3 };
        TreeNode root = new TreeNode(arr[0]);
        root.left = new TreeNode(arr[1]);
        root.right = new TreeNode(arr[2]);
        root.left.left = new TreeNode(arr[3]);
        root.left.right = new TreeNode(arr[4]);
        root.right.left = new TreeNode(arr[5]);
        root.right.right = new TreeNode(arr[6]);

        System.out.println("Tree is symmetric to itself : " + isSymmetric(root));

        sc.close();
    }
}