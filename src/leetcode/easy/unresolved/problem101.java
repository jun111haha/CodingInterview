package leetcode.easy.unresolved;

import leetcode.util.TreeNode;

public class problem101 {
    public static void main(String[] args) {
        System.out.println(isSymmetric(TreeNode.makeTree(new Integer[]{1,2,2,3,4,4,3})));
    }

    public static boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        return isMirror(root.left, root.right);
    }

    public static boolean isMirror(TreeNode node1, TreeNode node2){
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }

        return node1.val == node2.val &&
                isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }
}
