package com.ekonopaka.leetcode.p05;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestPalindrome() {
        String s = "babad";
        Solution solution = new Solution();
        String s1 = solution.longestPalindrome(s);

        System.out.println(s1);
    }

    @Test
    public void longestPalindrome1() {
        String s = "abb";
        Solution solution = new Solution();
        String s1 = solution.longestPalindrome(s);

        System.out.println(s1);
    }
}