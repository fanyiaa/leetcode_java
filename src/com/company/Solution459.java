package com.company;

public class Solution459 {

    //    459. 重复的子字符串
//     https://leetcode-cn.com/problems/repeated-substring-pattern/
    public boolean repeatedSubstringPattern(String s) {
        String substr = "";
        for (int i = 0; i < s.length(); i++) {
            substr = s.substring(0, i);
            if (i == 0 || s.length() % i != 0) {
                continue;
            }
            for (int j = i; j < s.length(); ) {
                String substr1 = s.substring(j, j + i);
                j = j + i;
                if (substr1.equals(substr)) {
                    if (j >= s.length()) {
                        return true;
                    }
                    continue;
                } else {
                    break;
                }
            }
        }
        return false;
    }
}
