package SouthPark;
import java.util.*;
import java.util.List;

import javax.swing.*;
import java.awt.*;


public class Season6Printer {
    JFrame frame= new JFrame();
    JLabel label = new JLabel("Season 6 Ratings");
    public Season6Printer(){
    HashMap<String, Double> Season6episodes = new HashMap<String, Double>();
        Season6episodes.put("Episode 1: Jared Has Aides", 8.3);
        Season6episodes.put("Episode 2: Asspen", 8.2);
        Season6episodes.put("Episode 3: Freak Strike", 8.1);
        Season6episodes.put("Episode 4: Fun with Veal", 8.3);
        Season6episodes.put("Episode 5: The New Terrance and Phillip Movie Trailer", 8.0);
        Season6episodes.put("Episode 6: Professor Chaos", 8.4);
        Season6episodes.put("Episode 7: The Simpsons Already Did It", 9.0);
        Season6episodes.put("Episode 8: Red Hot Catholic Love", 8.8);
        Season6episodes.put("Episode 9: Free Hat", 8.2);
        Season6episodes.put("Episode 10: Bebe's Boobs Destroy Society", 8.3);
        Season6episodes.put("Episode 11: Child Abduction is Not Funny", 8.4);
        Season6episodes.put("Episode 12: A Ladder to Heaven", 8.6);
        Season6episodes.put("Episode 13: The Return of the Fellowship of the Ring to the Two Towers", 9.3);
        Season6episodes.put("Episode 14: The Death Camp of Tolerance", 8.7);
        Season6episodes.put("Episode 15: The Biggest Douche in the Universe", 8.3);
        Season6episodes.put("Episode 16: My Future Self 'n' Me", 8.0);
        Season6episodes.put("Episode 17: Red Sleigh Down", 8.3);

    List<Map.Entry<String, Double>> episodeList = new ArrayList<>(Season6episodes.entrySet());
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
        // Build the HTML string as an unordered list
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body><ul>");
        sb.append("<h1>  Season 6 Ratings</h1>");  // Title with HTML heading tag
        for (Map.Entry<String, Double> entry : sortedEpisodes.entrySet()) {
            sb.append("<li>")
                    .append(entry.getKey())
                    .append(" - Rating: ")
                    .append(entry.getValue())
                    .append("</li>");

        }
        sb.append("</ul></body></html>");


        // Create the frame
        JFrame frame = new JFrame("Season 6 Episodes Ranked ");
        JLabel label = new JLabel(sb.toString()); // No need to prepend <html> again here
        label.setFont(new Font("Arial", Font.PLAIN, 29)); // Set a font that fits well
        label.setPreferredSize(new Dimension(800, 600)); // Set a preferred size to accommodate the text


        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(label), BorderLayout.CENTER); // Add a JScrollPane for scrolling if necessary

        frame.setSize(1000, 800); // Set an appropriate size for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        PrintSeason6();
}

public void PrintSeason6() {
    Season episode1 = new Season("S6.E1 Jared Has Aides", "The boys learn that Jared from the Subway commercials has aides, which leads to a misunderstanding.", 8.3);
    Season episode2 = new Season("S6.E2 Asspen", "The boys go on a ski trip to Aspen and encounter a bully.", 8.2);
    Season episode3 = new Season("S6.E3 Freak Strike", "The boys go on a talk show to win prizes but end up causing chaos.", 8.1);
    Season episode4 = new Season("S6.E4 Fun with Veal", "The boys try to save baby cows from being turned into veal.", 8.3);
    Season episode5 = new Season("S6.E5 The New Terrance and Phillip Movie Trailer", "The boys eagerly await the new Terrance and Phillip movie trailer.", 8.0);
    Season episode6 = new Season("S6.E6 Professor Chaos", "Butters becomes Professor Chaos and wreaks havoc in South Park.", 8.4);
    Season episode7 = new Season("S6.E7 The Simpsons Already Did It", "Butters discovers that everything he tries to do has already been done by The Simpsons.", 9.0);
    Season episode8 = new Season("S6.E8 Red Hot Catholic Love", "Father Maxi travels to the Vatican to confront the growing issue of child molestation within the church.", 8.8);
    Season episode9 = new Season("S6.E9 Free Hat", "The boys fight against the re-release of movies with added scenes and CGI.", 8.2);
    Season episode10 = new Season("S6.E10 Bebe's Boobs Destroy Society", "Bebe's newly developed breasts cause chaos among the boys at school.", 8.3);
    Season episode11 = new Season("S6.E11 Child Abduction is Not Funny", "South Park parents go to extremes to protect their children from kidnappers.", 8.4);
    Season episode12 = new Season("S6.E12 A Ladder to Heaven", "The boys build a ladder to heaven to find out what happened to Kenny.", 8.6);
    Season episode13 = new Season("S6.E13 The Return of the Fellowship of the Ring to the Two Towers", "The boys embark on an epic quest to return a copy of 'The Lord of the Rings' to the video store.", 9.3);
    Season episode14 = new Season("S6.E14 The Death Camp of Tolerance", "Mr. Garrison tries to get fired for being gay so he can sue the school for discrimination.", 8.7);
    Season episode15 = new Season("S6.E15 The Biggest Douche in the Universe", "Stan tries to convince the world that John Edward is a fraud.", 8.3);
    Season episode16 = new Season("S6.E16 My Future Self 'n' Me", "Stan's future self shows up to warn him about the dangers of drugs and alcohol.", 8.0);
    Season episode17 = new Season("S6.E17 Red Sleigh Down", "Cartman tries to bring Christmas to Iraq in order to get on Santa's nice list.", 8.3);
    System.out.println(episode1);
    System.out.println(episode2);
    System.out.println(episode3);
    System.out.println(episode4);
    System.out.println(episode5);
    System.out.println(episode6);
    System.out.println(episode7);
    System.out.println(episode8);
    System.out.println(episode9);
    System.out.println(episode10);
    System.out.println(episode11);
    System.out.println(episode12);
    System.out.println(episode13);
    System.out.println(episode14);
    System.out.println(episode15);
    System.out.println(episode16);
    System.out.println(episode17);
}
}


