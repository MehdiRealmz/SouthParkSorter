package SouthPark;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Season1Ratings {
    public Season1Ratings() {
        HashMap<String, Double> Season1episodes = new HashMap<String, Double>();
        Season1episodes.put("Episode 1: Unaired Pilot", 7.5);
        Season1episodes.put("Episode 2: Cartman Gets an Anal Probe", 7.9);
        Season1episodes.put("Episode 3: Weight Gain 4000", 7.5);
        Season1episodes.put("Episode 4: Volcano", 7.6);
        Season1episodes.put("Episode 5: Big Gay Al's Big Gay Boat Ride", 7.6);
        Season1episodes.put("Episode 6: An Elephant Makes Love to a Pig", 7.4);
        Season1episodes.put("Episode 7: Death", 8.0);
        Season1episodes.put("Episode 8: Pinkeye", 8.3);
        Season1episodes.put("Episode 9: Starvin' Marvin", 8.0);
        Season1episodes.put("Episode 10: Mr. Hankey, the Christmas Poo", 8.1);
        Season1episodes.put("Episode 11: Damien", 7.6);
        Season1episodes.put("Episode 12: Tom's Rhinoplasty", 7.9);
        Season1episodes.put("Episode 13: Mecha-Streisand", 7.5);
        Season1episodes.put("Episode 14: Cartman's Mom Is a Dirty Slut", 8.6);
        List<Map.Entry<String, Double>> episodeList = new ArrayList<>(Season1episodes.entrySet());

        episodeList.sort(new Comparator<Map.Entry<String, Double>>() {
            @Override
            public int compare(Map.Entry<String, Double> e1, Map.Entry<String, Double> e2) {
                return e1.getValue().compareTo(e2.getValue());
            }
        });
        LinkedHashMap<String, Double> sortedEpisodes = new LinkedHashMap<>();
        for (Map.Entry<String, Double> entry : episodeList) {
            sortedEpisodes.put(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<String, Double> entry : sortedEpisodes.entrySet()) {
            System.out.println("Title: " + entry.getKey() + ", Rating: " + entry.getValue());
        }
    }
}
