package com.company;

public class Solution111 {
    //111. 二叉树的最小深度
    //https://leetcode-cn.com/problems/minimum-depth-of-binary-tree
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        int leftDep = minDepth(left);
        int rightDep = minDepth(right);
//        int min = leftDep > rightDep ? rightDep : leftDep;
//        return min + 1;
        //1.如果左孩子和右孩子有为空的情况，直接返回m1+m2+1
        //2.如果都不为空，返回较小深度+1
        return root.left == null || root.right == null ? leftDep + rightDep + 1 : Math.min(leftDep, rightDep) + 1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}