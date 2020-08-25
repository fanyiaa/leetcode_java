package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution459Test {
    @Test
    void repeatedSubstringPattern() {
        Solution459 solution = new Solution459();
        boolean abaaba = solution.repeatedSubstringPattern("abaaba");
        assertEquals(abaaba, true);
    }

    @Test
    void repeatedSubstringPattern1() {
        Solution459 solution = new Solution459();
        boolean abaaba = solution.repeatedSubstringPattern("ababab");
        assertEquals(abaaba, true);
    }
}