package leetcode.arrays.p03;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 */
public class Solution {
    public int[] sortedSquares(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }

        int forwardIndex = 0;
        int backwardIndex = nums.length - 1;
        int[] results = new int[nums.length];
        int resultIndex = nums.length - 1;

        while (forwardIndex < backwardIndex) {
            int valueForward = Math.abs(nums[forwardIndex]);
            int valueBackward = Math.abs(nums[backwardIndex]);
            if (valueForward < valueBackward) {
                results[resultIndex] = valueBackward * valueBackward;

                backwardIndex--;
                resultIndex--;
            } else {
                results[resultIndex] = valueForward * valueForward;
                forwardIndex++;
                resultIndex--;
            }
        }

        if (forwardIndex == backwardIndex) {
            results[resultIndex] = nums[forwardIndex] * nums[forwardIndex];
        }

        return results;
    }
}
