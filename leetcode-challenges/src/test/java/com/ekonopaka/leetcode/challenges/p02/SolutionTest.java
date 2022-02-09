package com.ekonopaka.leetcode.challenges.p02;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void addTwoNumbers() {
        ListNode list1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode list2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        Solution solution = new Solution();

        ListNode listNode = solution.addTwoNumbers(list1, list2);

        System.out.println();
    }

    @Test
    public void addTwoNumbers2() {
        ListNode list1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode list2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        Solution solution = new Solution();

        ListNode listNode = solution.addTwoNumbers(list1, list2);

        System.out.println();
    }


}