package com.example.matchesproject;

public class PlayersDetails {
    private String PlayerName;
    private int Assists,Goals;

    public PlayersDetails(String playerName, int goals, int assists) {
        PlayerName = playerName;
        Goals = goals;
        Assists = assists;
    }

    public PlayersDetails() {
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

    public int getAssists() {
        return Assists;
    }

    public void setAssists(int assists) {
        Assists = assists;
    }

    public int getGoals() {
        return Goals;
    }

    public void setGoals(int goals) {
        Goals = goals;
    }
}

