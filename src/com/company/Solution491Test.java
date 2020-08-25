package com.company;

import org.junit.jupiter.api.Test;

import java.util.List;

class Solution491Test {

    @Test
    void findSubsequences() {
        Solution491 solution = new Solution491();
        List<List<Integer>> subsequences = solution.findSubsequences(new int[]{4, 6, 7, 7});
        System.out.println(subsequences);
//        assertEquals(abaaba, true);
    }
}