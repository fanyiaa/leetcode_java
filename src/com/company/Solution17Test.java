package com.company;

import org.junit.jupiter.api.Test;

import java.util.List;

class Solution17Test {

    @Test
    void letterCombinations() {
        Solution17 solution = new Solution17();
        List<String> strings = solution.letterCombinations("23");
        System.out.println(strings);
    }
}