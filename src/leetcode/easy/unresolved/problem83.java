package leetcode.easy.unresolved;

import leetcode.util.ListNode;

public class problem83 {
    public static void main(String[] args) {
        System.out.println(deleteDuplicates(ListNode.of(new int[]{1,1,2})));
    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;

        while (temp != null && temp.next != null){
            if(temp.next.val == temp.val){
                temp.next = temp.next.next;
                continue;
            }

            temp = temp.next;
        }

        return head;
    }
}
