package leetcode;

/**
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * 返回删除后的链表的头节点。
 */
public class Solution12 {

    public ListNode deleteNode(ListNode head, int val) {
        // 定义一个虚拟头结点指向head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        // 指针
        ListNode pre = dummy;
        while (pre.next != null && pre.next.val != val) {
            pre = pre.next;
        }
        pre.next = pre.next == null ? null : pre.next.next;
        return dummy.next;
    }

    class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}