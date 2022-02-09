package leetcode.arrays.p02;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void findNumbers() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.findNumbers(new int[]{12, 345, 2, 6, 7896}));
    }
}