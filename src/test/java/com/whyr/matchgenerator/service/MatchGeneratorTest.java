package com.whyr.matchgenerator.service;

import com.whyr.matchgenerator.model.Match;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MatchGeneratorTest {

    private MatchGenerator<String> matchGenerator = new MatchGenerator<>();

    @Test
    void test() {

        List<String> teams = new ArrayList<>();
        for (int t = 1; t < 10; t++) {
            teams.add("Team " + t);
        }

        System.out.println(teams.toString());

        List<Match<String>> matches = matchGenerator.generateMatches(teams);

        matches.forEach(
                match -> System.out.println(match.getRound() + ": " + match.getTeam1() + " vs " + match.getTeam2())
        );

        Assertions.assertEquals(1, matches.get(0).getRound());
        Assertions.assertEquals("Team 5", matches.get(0).getTeam1());
        Assertions.assertEquals("Team 1", matches.get(0).getTeam2());
    }
}