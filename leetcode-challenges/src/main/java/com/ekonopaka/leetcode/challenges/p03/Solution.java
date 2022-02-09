package com.ekonopaka.leetcode.challenges.p03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] array = s.toCharArray();

        if (array.length == 0) {
            return 0;
        }

        if (array.length == 1) {
            return 1;
        }

        int result = 1;
        for (int len = 1; len <= array.length; len++) {
            System.out.println("Examining length " + len);
            if(hasUnique(array, len)) {
                result = len;
            } else {
                break;
            }
        }

        return result;
    }

    private static boolean hasUnique(char[] array, int lengthOfPart) {
        for (int i = 0; i <= array.length - lengthOfPart; i++) {
            char[] part = Arrays.copyOfRange(array, i, i + lengthOfPart);
            Set<Character> chars = new HashSet<>();
            System.out.println("Examining " + Arrays.toString(part));
            for (char c : part) {
                chars.add(c);
            }

            if (chars.size() == lengthOfPart) {
                return true;
            }
        }
        return false;
    }
}
