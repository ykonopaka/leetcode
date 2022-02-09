package leetcode.arrays.p04;

/**
 * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
 *
 * Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
 */
public class Solution {
    public void duplicateZeros(int[] arr) {
        if (arr.length == 0) {
            return;
        }

        if (arr.length == 1 && arr[0] == 0) {
            return;
        }

        int numberOfConsequentZeros = 0;
        boolean isPrevZero = false;

        int index = 0;

        while (index < arr.length) {
            if (arr[index] == 0) {
                numberOfConsequentZeros++;
                isPrevZero = true;
                index++;
            } else if (isPrevZero) {
                shiftLeft(arr, index - numberOfConsequentZeros, numberOfConsequentZeros);
                turnToZero(arr, index - numberOfConsequentZeros, numberOfConsequentZeros);
                index = index + numberOfConsequentZeros;
                numberOfConsequentZeros = 0;
                isPrevZero = false;
            } else {
                index++;
            }
        }
    }

    private static void shiftLeft(int[] array, int index, int elementsForward) {
        int shiftedArrayLength = array.length - index - elementsForward;

        for (int i = index + shiftedArrayLength - 1; i >= index; i--) {
            array[i + elementsForward] = array[i];
        }
    }

    private static void turnToZero(int[] array, int beginIndex, int endIndex) {
        beginIndex = beginIndex < array.length - 1 ? beginIndex : array.length - 1;
        endIndex = endIndex < array.length - 1 ? endIndex : array.length - 1;
        for (int index = beginIndex; index < endIndex; index++) {
            array[index] = 0;
        }
    }
}
