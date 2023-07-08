package leetcode.easy.solved;

import leetcode.util.TreeNode;

public class easy2236 {
    public static void main(String[] args) {
        System.out.println(checkTree(TreeNode.makeTree(new Integer[]{10, 4, 6})));
    }

    public static boolean checkTree(TreeNode root) {
        boolean isCheck = false;
        if(root.left.val + root.right.val == root.val){
            isCheck = true;
        }

        return isCheck;
    }

}
