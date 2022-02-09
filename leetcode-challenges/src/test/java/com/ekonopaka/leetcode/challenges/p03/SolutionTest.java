package com.ekonopaka.leetcode.challenges.p03;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void lengthOfLongestSubstring() {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("abcabcbb");

        Assert.assertEquals(3, result);
    }

    @Test
    public void lengthOfLongestSubstring2() {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("bbb");

        Assert.assertEquals(1, result);
    }

    @Test
    public void lengthOfLongestSubstring3() {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("aa");

        Assert.assertEquals(1, result);
    }

    @Test
    public void lengthOfLongestSubstring4() {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("au");

        Assert.assertEquals(2, result);
    }
}