package leetcode;

/**
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 */
public class Solution13 {

    public void deleteNode(ListNode node) {
        node.setVal(node.getNext().getVal());
        node.setNext(node.getNext().getNext());
    }

    class ListNode {

        private int val;
        private ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }
}