package com.whyr.matchgenerator.service;

import com.whyr.matchgenerator.model.Match;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MatchGenerator<T> {

    public List<Match<T>> generateMatches(List<T> teamList) {

        List<Match<T>> createdMatches = new ArrayList<>();

        int numberOfRounds = teamList.size() - 1;
        int numberOfMatchesInRound = teamList.size() / 2;

        List<T> teams = new ArrayList<>(teamList.subList(numberOfMatchesInRound, teamList.size()));
        List<T> teamsToReverse = teamList.subList(1, numberOfMatchesInRound);
        Collections.reverse(teamsToReverse);
        teams.addAll(teamsToReverse);

        int numberOfTeams = teams.size();

        for (int roundNumber = 0; roundNumber < numberOfRounds; roundNumber++) {

            int teamIdx = roundNumber % numberOfTeams;

            createdMatches.add(new Match<T>(roundNumber + 1, teams.get(teamIdx), teamList.get(0)));

            for (int idx = 1; idx < numberOfMatchesInRound; idx++) {
                int t1 = (roundNumber + idx) % numberOfTeams;
                int t2 = (roundNumber + numberOfTeams - idx) % numberOfTeams;

                createdMatches.add(new Match<>(roundNumber + 1, teams.get(t1), teams.get(t2)));
            }

        }

        return createdMatches;

    }
}
