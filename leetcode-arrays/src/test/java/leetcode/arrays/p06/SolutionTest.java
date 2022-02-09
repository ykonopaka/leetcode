package leetcode.arrays.p06;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};

        Assert.assertEquals(5, solution.removeElement(nums, 2));
    }
}