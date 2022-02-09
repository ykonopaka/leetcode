package com.ekonopaka.leetcode.p02;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode workingNode1 = l1;
        ListNode workingNode2 = l2;
        boolean overflow = false;

        ListNode first = null;
        ListNode prev = null;
        ListNode current = null;

        do {
            int val1 = workingNode1 == null ? 0 : workingNode1.val;
            int val2 = workingNode2 == null ? 0 : workingNode2.val;

            int sum = val1 + val2 + (overflow ? 1 : 0);
            if (sum >= 10) {
                sum = sum - 10;
                overflow = true;
            } else {
                overflow = false;
            }

            if (first == null) {
                first = new ListNode(sum, null);
                prev = first;
            } else {
                current = new ListNode(sum, null);
                prev.next = current;
                prev = current;
            }

            workingNode1 = workingNode1 == null ? null : workingNode1.next;
            workingNode2 = workingNode2 == null ? null : workingNode2.next;
        } while (workingNode1 != null || workingNode2 != null);


        if (overflow) {
            prev.next = new ListNode(1);
        }

        return first;
    }
}
