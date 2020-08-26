package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution17 {
    //17. 电话号码的字母组合
//https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
    public List<String> letterCombinations(String digits) {
        Map<Character, Character[]> d2cMap = new HashMap<>();
        d2cMap.put('2', new Character[]{'a', 'b', 'c'});
        d2cMap.put('3', new Character[]{'d', 'e', 'f'});
        d2cMap.put('4', new Character[]{'g', 'h', 'i'});
        d2cMap.put('5', new Character[]{'j', 'k', 'l'});
        d2cMap.put('6', new Character[]{'m', 'n', 'o'});
        d2cMap.put('7', new Character[]{'p', 'q', 'r', 's'});
        d2cMap.put('8', new Character[]{'t', 'u', 'v'});
        d2cMap.put('9', new Character[]{'w', 'x', 'y', 'z'});
        List<String> outPut = new ArrayList<>();
        outPut.add("");
        for (int i = 0; i < digits.length(); i++) {
            Character c = digits.charAt(i);
            Character[] characters = d2cMap.get(c);
            List<String> b = new ArrayList<>();
            for (String a : outPut) {
                for (int j = 0; j < characters.length; j++) {
                    b.add(a + characters[j]);
                }
            }
            outPut = b;
        }
        outPut.remove("");
        return outPut;
    }

    //官方
    public List<String> letterCombinations1(String digits) {
        List<String> combinations = new ArrayList<String>();
        if (digits.length() == 0) {
            return combinations;
        }
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        backtrack(combinations, phoneMap, digits, 0, new StringBuffer());
        return combinations;
    }

    public void backtrack(List<String> combinations, Map<Character, String> phoneMap, String digits, int index, StringBuffer combination) {
        if (index == digits.length()) {
            combinations.add(combination.toString());
        } else {
            char digit = digits.charAt(index);
            String letters = phoneMap.get(digit);
            int lettersCount = letters.length();
            for (int i = 0; i < lettersCount; i++) {
                combination.append(letters.charAt(i));
                backtrack(combinations, phoneMap, digits, index + 1, combination);
                combination.deleteCharAt(index);
            }
        }
    }
}
