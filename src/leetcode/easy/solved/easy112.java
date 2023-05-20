package leetcode.easy.solved;

import leetcode.util.TreeNode;

public class easy112 {
    public static void main(String[] args) {
        System.out.println(hasPathSum(TreeNode.makeTree(new Integer[]{1,2,3})
                ,5));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }

        targetSum -= root.val;
        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }

        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}
