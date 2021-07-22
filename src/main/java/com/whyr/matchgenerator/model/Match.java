package com.whyr.matchgenerator.model;

public class Match<T> {

    private int round;
    private T team1;
    private T team2;

    public Match(int round, T team1, T team2) {

        this.round = round;
        this.team1 = team1;
        this.team2 = team2;
    }

    public int getRound() {

        return round;
    }

    public void setRound(int round) {

        this.round = round;
    }

    public T getTeam1() {

        return team1;
    }

    public void setTeam1(T team1) {

        this.team1 = team1;
    }

    public T getTeam2() {

        return team2;
    }

    public void setTeam2(T team2) {

        this.team2 = team2;
    }
}
