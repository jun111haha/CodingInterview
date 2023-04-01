package leetcode.easy.unresolved;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class problem94 {
    public static void main(String[] args) {
        System.out.println(inorderTraversal(TreeNode.makeTree(new Integer[]{1,2,3})));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        func(root, list);

        return list;
    }

    public static void func(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }

        func(root.left, list);
        list.add(root.val);
        func(root.right, list);
    }
}