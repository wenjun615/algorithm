package leetcode;

/**
 * 输入两个链表，找出它们的第一个公共节点。
 * <p>
 * 解法：先求出两个链表的长度差 len1-len2，之后遍历链表，长的链表先走 len1-len2 步。
 * 接着两个链表同时走，当出现相同的节点时，说明两个链表在此节点相交，返回此节点，否则返回 null。
 */
public class Solution25 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode p = headA, q = headB;
        int len1 = len(p), len2 = len(q);
        // 让 q 指向长链表
        if (len1 > len2) {
            ListNode t = headA;
            headA = headB;
            headB = t;
        }
        p = headA;
        q = headB;
        for (int i = 0; i < Math.abs(len1 - len2); ++i) {
            q = q.next;
        }
        while (p != null && q != null) {
            // 这里是直接判断链表节点对象地址相等即可
            if (p == q) {
                return p;
            }
            p = p.next;
            q = q.next;
        }
        return null;
    }

    private int len(ListNode node) {
        int len = 0;
        while (node != null) {
            node = node.next;
            ++len;
        }
        return len;
    }

    class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}