package leetcode.arrays.p05;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void merge1() {
        Solution solution = new Solution();
        int[] m = new int[]{2, 0};
        int[] n = new int[]{1};

        solution.merge(m, 1, n, 1);

        int[] expected = new int[]{1, 2};
        Assert.assertArrayEquals(expected, m);
    }

    @Test
    public void merge2() {
        Solution solution = new Solution();
        int[] m = new int[]{1, 2, 3, 0, 0, 0};
        int[] n = new int[]{2, 5, 6};

        solution.merge(m, 3, n, 3);

        int[] expected = new int[]{1, 2, 2, 3, 5, 6};
        Assert.assertArrayEquals(expected, m);
    }
}