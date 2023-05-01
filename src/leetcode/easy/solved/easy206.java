package leetcode.easy.solved;

import leetcode.util.ListNode;

public class easy206 {
    public static void main(String[] args) {
        System.out.println(reverseList(ListNode.of(new int[]{1,2,3,4,5})));
    }

    public static ListNode reverseList(ListNode head) {
        return rev(head, null);
    }

    private static ListNode rev(ListNode node, ListNode pre){
        if(node == null){
            return pre;
        }

        ListNode temp = node.next;
        node.next = pre;
        return rev(temp, node);
    }

}
