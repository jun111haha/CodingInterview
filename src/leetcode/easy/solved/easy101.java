package leetcode.easy.solved;

import leetcode.util.TreeNode;

public class easy101 {
    public static void main(String[] args) {
        System.out.println(isSymmetric(TreeNode.makeTree(new Integer[]{1,2,2,3,4,4,3})));

    }

    public static boolean isSymmetric(TreeNode root) {
        return func(root.left, root.right);
    }

    private static boolean func(TreeNode leftRoot, TreeNode rightRoot){
        if(leftRoot == null && rightRoot == null){
            return true;
        }

        if((leftRoot == null && rightRoot != null) && (rightRoot == null && leftRoot != null)){
            return false;
        }

        if(leftRoot.val != rightRoot.val){
            return false;
        }

        return func(leftRoot.left, rightRoot.right) && func(rightRoot.right, leftRoot.left);
    }
}
