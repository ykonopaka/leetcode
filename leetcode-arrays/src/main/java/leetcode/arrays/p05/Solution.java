package leetcode.arrays.p05;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            for (int mIndex = 0; mIndex < n; mIndex++) {
                nums1[mIndex] = nums2[mIndex];
            }
            return;
        }

        int resultIndex = nums1.length - 1;
        int mIndex = m - 1;
        int nIndex = n - 1;

        while (resultIndex >= 0) {
            int mElement = takeSafe(nums1, mIndex);
            int nElement = takeSafe(nums2, nIndex);

            if (mElement >= nElement) {
                System.out.println(String.format("Taking element from m (%s)", mElement));
                nums1[resultIndex] = mElement;
                mIndex--;
                resultIndex--;
            } else {
                System.out.println(String.format("Taking element from n (%s)", nElement));
                nums1[resultIndex] = nElement;
                nIndex--;
                resultIndex--;
            }
        }
    }

    public static int takeSafe(int[] array, int index) {
        if (index < 0) {
            return Integer.MIN_VALUE;
        } else {
            return array[index];
        }
    }
}
