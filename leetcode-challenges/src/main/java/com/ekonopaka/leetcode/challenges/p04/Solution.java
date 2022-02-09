package com.ekonopaka.leetcode.challenges.p04;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0) return median(nums2);
        if (nums2.length == 0) return median(nums1);

        int totalLength = nums1.length + nums2.length;

        boolean isOdd = totalLength % 2 == 1;
        int oddIndex1 = totalLength / 2 - 1;
        int oddIndex2 = totalLength / 2;

        int evenIndex = totalLength / 2;
        double median = 0;

        int longerArrayIndex = 0;
        int shorterArrayIndex = 0;

        int[] longerArray;
        int[] shorterArray;

        if (nums1.length > nums2.length) {
            longerArray = nums1;
            shorterArray = nums2;
        } else {
            longerArray = nums2;
            shorterArray = nums1;
        }

        if (isOdd) {
            System.out.println("Median should consist of two elements with indices " + oddIndex1 + ", " + oddIndex2);
        } else {
            System.out.println("Median should consist of 1 element with index " + evenIndex);
        }

        for (int currentIndex = 0; currentIndex < totalLength; currentIndex++) {
            int el;

            if (longerArrayIndex >= longerArray.length) {
                el = shorterArray[shorterArrayIndex];
                shorterArrayIndex++;
            } else if (shorterArrayIndex >= shorterArray.length) {
                el = longerArray[longerArrayIndex];
                longerArrayIndex++;
            } else if (longerArray[longerArrayIndex] <= shorterArray[shorterArrayIndex]) {
                el = longerArray[longerArrayIndex];
                longerArrayIndex++;
            } else {
                el = shorterArray[shorterArrayIndex];
                shorterArrayIndex++;
            }

            System.out.println("Calculated element[" + currentIndex + "] = " + el);

            if (isOdd) {
                if (currentIndex == evenIndex) {
                    System.out.println("Reached first median value = " + el);
                    return el;
                }
            } else {
                if (currentIndex == oddIndex1) {
                    median = (double) el;
                    System.out.println("Reached first median value = " + el);
                } else if (currentIndex == oddIndex2) {
                    median = (median + (double) el) / 2;
                    System.out.println("Reached second median value = " + el);
                    return median;
                }
            }
        }

        throw new RuntimeException("Something went wrong");
    }

    static double median(int[] array) {
        if (array.length % 2 == 1) {
            int index = array.length / 2;
            return (double) array[index];
        } else {
            int index = array.length / 2;
            return ((double) array[index - 1] + (double) array[index]) / 2;
        }
    }
}
