package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class Solution332Test {

    @Test
    void findItinerary() {
        Solution332 solution332 = new Solution332();
        List<List<String>> tickets = new ArrayList<>();
        // @formatter:off
        tickets.add(new ArrayList<String>(){{add("MUC");add("LHR");}});
        tickets.add(new ArrayList<String>(){{add("JFK");add("MUC");}});
        tickets.add(new ArrayList<String>(){{add("SFO");add("SJC");}});
        tickets.add(new ArrayList<String>(){{add("LHR");add("SFO");}});
        // @formatter:on
        solution332.findItinerary(tickets);
    }

    @Test
    void findItinerary1() {
        Solution332 solution332 = new Solution332();
        List<List<String>> tickets = new ArrayList<>();
        //        @formatter:off
        tickets.add(new ArrayList<String>(){{add("JFK");add("SFO");}});
        tickets.add(new ArrayList<String>(){{add("JFK");add("ATL");}});
        tickets.add(new ArrayList<String>(){{add("SFO");add("ATL");}});
        tickets.add(new ArrayList<String>(){{add("ATL");add("JFK");}});
        tickets.add(new ArrayList<String>(){{add("ATL");add("SFO");}});
        //        @formatter:on
        solution332.findItinerary(tickets);
    }
}