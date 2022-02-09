package com.ekonopaka.leetcode.challenges.p01;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testTwoInts() {
        Solution solution = new Solution();
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);

        Assert.assertArrayEquals(new int[]{0, 1}, result);
    }
}