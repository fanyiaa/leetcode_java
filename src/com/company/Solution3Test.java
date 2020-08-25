package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution3Test {

    @Test
    void lengthOfLongestSubstring() {
        Solution3 solution = new Solution3();
        int pwwkew = solution.lengthOfLongestSubstring("pwwkew");
        assertEquals(pwwkew, 3);
    }
}