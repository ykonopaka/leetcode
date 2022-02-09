package leetcode.arrays.p01;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int maxResult = 0;
        int currentResult = 0;

        boolean entered = false;
        for (int num : nums) {
            if (!entered && num == 1) {
                entered = true;
                currentResult++;
            } else if (entered && num == 1) {
                currentResult++;
            } else if (entered && num == 0) {
                if (currentResult > maxResult) {
                    maxResult = currentResult;
                }
                entered = false;
                currentResult = 0;
            }
        }

        if (currentResult > maxResult) {
            maxResult = currentResult;
        }
        return maxResult;
    }

}
