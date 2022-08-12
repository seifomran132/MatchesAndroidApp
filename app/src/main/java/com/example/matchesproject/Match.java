package com.example.matchesproject;

public class Match {
    private String firstTeam;
    private String secondTeam;
    private String matchTime;
    private String champ;

    public Match(String firstTeam, String secondTeam, String matchTime, String champ) {
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.matchTime = matchTime;
        this.champ = champ;
    }

    public String getFirstTeam() {
        return firstTeam;
    }

    public void setFirstTeam(String firstTeam) {
        this.firstTeam = firstTeam;
    }

    public String getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(String secondTeam) {
        this.secondTeam = secondTeam;
    }

    public String getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(String matchTime) {
        this.matchTime = matchTime;
    }

    public String getChamp() {
        return champ;
    }

    public void setChamp(String champ) {
        this.champ = champ;
    }

    @Override
    public String toString() {
        return "Match{" +
                "firstTeam='" + firstTeam + '\'' +
                ", secondTeam='" + secondTeam + '\'' +
                ", matchTime='" + matchTime + '\'' +
                ", champ='" + champ + '\'' +
                '}';
    }
}
