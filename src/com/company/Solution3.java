package com.company;

import java.util.HashSet;

public class Solution3 {
    //    3. 无重复字符的最长子串
//    https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
    public int lengthOfLongestSubstring(String s) {
        if (s == null || "".equals(s)) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int max = 1;
        int a = 0;
        int b = 1;
        HashSet hashSet = new HashSet<Character>();
        while (b <= s.length() - 1) {
            for (int i = a; i <= b; i++) {
                Character character = s.charAt(i);
                if (!hashSet.contains(character)) {
                    hashSet.add(character);
                } else {
                    max = hashSet.size() > max ? hashSet.size() : max;
                    hashSet = new HashSet<Character>();
                    a = b + 1;
                    continue;
                }
            }
            b++;
        }
        return max;
    }
}
