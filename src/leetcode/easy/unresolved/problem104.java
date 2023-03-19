package leetcode.easy.unresolved;

import leetcode.util.TreeNode;

public class problem104 {
    public static void main(String[] args) {
        System.out.println(maxDepth(TreeNode.makeTree(new Integer[]{1,2})));
    }

    public static int maxDepth(TreeNode root) {

        return depth(root, 1);
    }

    public static int depth(TreeNode node, int depth) {
        if (node == null){
            return depth - 1;
        }

        return Math.max(depth(node.left, depth + 1), depth(node.right, depth + 1));
    }
}
