package leetcode.arrays.p07;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void removeDuplicates() {
        Solution solution = new Solution();
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int outcome = solution.removeDuplicates(nums);

        int[] expected = new int[]{0, 1, 2, 3, 4, 0, 0, 0, 0, 0};
        Assert.assertArrayEquals(expected, nums);
        Assert.assertEquals(5, outcome);
    }
}