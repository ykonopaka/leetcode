package leetcode.arrays.p01;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void findMaxConsecutiveOnes() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
    }
}