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
        teams.add("Medvedev");
        teams.add("Zverev");
        teams.add("Nadal");
        teams.add("Alcaraz");
        teams.add("Tsitsipas");
        teams.add("Djokovic");
        teams.add("Ruud");
        teams.add("Auger-Aliassime");
        teams.add("Norrie");

        System.out.println(teams);

        List<Match<String>> matches = matchGenerator.generateMatches(teams);

        matches.forEach(
                match -> System.out.println("Round " + match.getRound() + ": " +
                        match.getTeam1() + " vs " + match.getTeam2())
        );

        Assertions.assertEquals(1, matches.get(0).getRound());
        Assertions.assertEquals("Tsitsipas", matches.get(0).getTeam1());
        Assertions.assertEquals("Medvedev", matches.get(0).getTeam2());
    }
}