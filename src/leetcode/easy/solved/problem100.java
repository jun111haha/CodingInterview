package leetcode.easy.solved;

import leetcode.util.TreeNode;

public class problem100 {
    public static void main(String[] args) {
        System.out.println(isSameTree(TreeNode.makeTree(new Integer[]{1,2,3})
                , TreeNode.makeTree(new Integer[]{1,2,3})));

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        boolean isCheck = false;
        if(p == null || q == null){
            return p == q;
        }

        if(p.val != q.val){
            return false;
        }

        if(isSameTree(p.right, q.right) && isSameTree(p.left, q.left)){
            isCheck = true;
        }

        return isCheck;
    }
}
