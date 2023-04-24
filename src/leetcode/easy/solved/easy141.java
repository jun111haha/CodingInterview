package leetcode.easy.solved;

import leetcode.util.ListNode;

public class easy141 {
    public static void main(String[] args) {
        System.out.println(hasCycle(ListNode.of(new int[]{3,2,0,-4})));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}
