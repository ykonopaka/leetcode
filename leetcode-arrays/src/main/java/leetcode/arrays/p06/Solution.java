package leetcode.arrays.p06;

/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The relative order of the elements may be changed.
 *
 * Since it is impossible to change the length of the array in some languages,
 * you must instead have the result be placed in the first part of the array nums.
 * More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
 *
 * Return k after placing the final result in the first k slots of nums.
 *
 * Do not allocate extra space for another array. You must do
 * this by modifying the input array in-place with O(1) extra memory.
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int found = 0;
        int index = 0;

        while (index < (nums.length - found)) {
            int element = nums[index];
            if (element == val) {
                shift(nums, index);
                nums[nums.length - 1] = element;
                found++;
            } else {
                index++;
            }
        }

        return nums.length - found;
    }

    private void shift(int[] nums, int index) {
        if (nums.length - 1 - index >= 0)
            System.arraycopy(nums, index + 1, nums, index, nums.length - 1 - index);
    }
}
