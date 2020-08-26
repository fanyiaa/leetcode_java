package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution111Test {

    @Test
    void minDepth() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        root.left = left;
        Solution111 solution111 = new Solution111();
        int i = solution111.minDepth(root);
        assertEquals(2, i);
    }
}