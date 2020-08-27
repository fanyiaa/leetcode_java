package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution332 {
    //    332. 重新安排行程 todo 未完成
//    https://leetcode-cn.com/problems/reconstruct-itinerary/
    public List<String> findItinerary(List<List<String>> tickets) {
        List<String> outPut = new ArrayList<>();
        Map<String, List<String>> ticketsMap = new HashMap<>();
        for (List<String> p : tickets) {
            List<String> strings = ticketsMap.get(p.get(0));
            if (strings == null) {
                strings = new ArrayList<>();
            }
            strings.add(p.get(1));
        }
        List<String> a = ticketsMap.get("JFK");
        if (a != null && a.size() > 0) {
            String s = a.get(0);
            for (String b : a) {

            }

        }

        return outPut;
    }
}
