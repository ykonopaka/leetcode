package com.ekonopaka.leetcode.challenges.p04;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void findMedianSortedArrays1() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        Solution solution = new Solution();
        double actual = solution.findMedianSortedArrays(nums1, nums2);

        Assert.assertEquals(2.0, actual, 0);

    }

    @Test
    public void findMedianSortedArrays2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        Solution solution = new Solution();
        double actual = solution.findMedianSortedArrays(nums1, nums2);

        Assert.assertEquals(2.5, actual, 0);

    }
}