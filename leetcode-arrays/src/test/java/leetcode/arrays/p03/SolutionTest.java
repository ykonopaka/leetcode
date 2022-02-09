package leetcode.arrays.p03;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void sortedSquares() {
        Solution solution = new Solution();

        int[] expected = new int[]{0, 1, 9, 16, 100};
        int[] actual = solution.sortedSquares(new int[]{-4, -1, 0, 3, 10});

        Assert.assertArrayEquals(expected, actual);
    }
}