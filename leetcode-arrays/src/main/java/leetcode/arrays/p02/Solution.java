package leetcode.arrays.p02;

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */
class Solution {
    public int findNumbers(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int result = 0;
        for (int el : nums) {
            String str = String.valueOf(el);
            if (str.length() % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}
