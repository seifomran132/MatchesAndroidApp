package com.example.matchesproject;

import java.util.ArrayList;

public class OurUtilities {

    public static ArrayList<Match> filterMatches(String champ, ArrayList<Match> matches) {

        ArrayList<Match> filteredArray = new ArrayList<>();

        for(int i = 0; i < matches.size(); i++) {
            if(matches.get(i).getChamp().equals(champ)) {
                filteredArray.add(matches.get(i));
            }
        }

        return filteredArray;

    }

}
