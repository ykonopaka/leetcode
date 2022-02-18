package leetcode.arrays.p07;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int duplicatesFound = 0;
        int currentIndex = 0;
        int prevElement = Integer.MIN_VALUE;

        while (currentIndex < nums.length - duplicatesFound) {
            int currentElement = nums[currentIndex];
            if (currentElement == prevElement) {
                shift(nums, currentIndex);
                duplicatesFound++;
            } else {
                currentIndex++;
            }
            prevElement = currentElement;
        }
        return nums.length - duplicatesFound;
    }

    private void shift(int[] nums, int index) {
        if (nums.length - 1 - index >= 0)
            System.arraycopy(nums, index + 1, nums, index, nums.length - 1 - index);
        nums[nums.length - 1] = 0;
    }
}
