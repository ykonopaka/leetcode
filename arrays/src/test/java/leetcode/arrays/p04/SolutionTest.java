package leetcode.arrays.p04;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void duplicateZeros() {
        Solution solution = new Solution();
        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        solution.duplicateZeros(arr);

        int[] expected = new int[]{1, 0, 0, 2, 3, 0, 0, 4};
        Assert.assertArrayEquals(expected, arr);
    }

    @Test
    public void duplicateZeros2() {
        Solution solution = new Solution();
        int[] arr = new int[]{8, 4, 5, 0, 0, 0, 0, 7};
        solution.duplicateZeros(arr);

        int[] expected = new int[]{8, 4, 5, 0, 0, 0, 0, 0};
        Assert.assertArrayEquals(expected, arr);
    }

    @Test
    public void duplicateZeros3() {
        Solution solution = new Solution();
        int[] arr = new int[]{0, 4, 1, 0, 0, 8, 0, 0, 3};
        solution.duplicateZeros(arr);

        int[] expected = new int[]{0, 0, 4, 1, 0, 0, 0, 0, 8};
        Assert.assertArrayEquals(expected, arr);
    }

}