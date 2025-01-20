package SouthPark;
import java.util.*;
import java.util.List;

import javax.swing.*;
import java.awt.*;

public class Season13Printer {
    JFrame frame= new JFrame();
    JLabel label = new JLabel("Season 13 Ratings");

    public Season13Printer() {
        HashMap<String, Double> Season13episodes = new HashMap<String, Double>();
        Season13episodes.put("Episode 1: The Ring", 8.1);
        Season13episodes.put("Episode 2: The Coon", 8.7);
        Season13episodes.put("Episode 3: Margaritaville", 8.5);
        Season13episodes.put("Episode 4: Eat, Pray, Queef", 7.4);
        Season13episodes.put("Episode 5: Fishsticks", 8.7);
        Season13episodes.put("Episode 6: Pinewood Derby", 7.5);
        Season13episodes.put("Episode 7: Fatbeard", 7.7);
        Season13episodes.put("Episode 8: Dead Celebrities", 8.2);
        Season13episodes.put("Episode 9: Butters' Bottom Bitch", 8.4);
        Season13episodes.put("Episode 10: W.T.F.", 7.9);
        Season13episodes.put("Episode 11: Whale Whores", 8.1);
        Season13episodes.put("Episode 12: The F Word", 8.4);
        Season13episodes.put("Episode 13: Dances with Smurfs", 8.3);
        Season13episodes.put("Episode 14: Pee", 7.4);

        List<Map.Entry<String, Double>> episodeList = new ArrayList<>(Season13episodes.entrySet());
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
        sb.append("<h1>  Season 13 Ratings</h1>");  // Title with HTML heading tag
        for (Map.Entry<String, Double> entry : sortedEpisodes.entrySet()) {
            sb.append("<li>")
                    .append(entry.getKey())
                    .append(" - Rating: ")
                    .append(entry.getValue())
                    .append("</li>");

        }
        sb.append("</ul></body></html>");


        // Create the frame
        JFrame frame = new JFrame("Season 13 Episodes Ranked ");
        JLabel label = new JLabel(sb.toString()); // No need to prepend <html> again here
        label.setFont(new Font("Arial", Font.PLAIN, 29)); // Set a font that fits well
        label.setPreferredSize(new Dimension(800, 600)); // Set a preferred size to accommodate the text


        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(label), BorderLayout.CENTER); // Add a JScrollPane for scrolling if necessary

        frame.setSize(1000, 800); // Set an appropriate size for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        PrintSeason13();
    }
    public void PrintSeason13() {
        Season episode1 = new Season("S13.E1 The Ring", "Kenny's new girlfriend makes him promise to stay pure.", 8.1);
        Season episode2 = new Season("S13.E2 The Coon", "Cartman becomes a masked vigilante known as The Coon.", 8.7);
        Season episode3 = new Season("S13.E3 Margaritaville", "Stan tries to solve the economic crisis in South Park.", 8.5);
        Season episode4 = new Season("S13.E4 Eat, Pray, Queef", "The girls of South Park begin a revolution against the boys.", 7.4);
        Season episode5 = new Season("S13.E5 Fishsticks", "Cartman and Jimmy come up with a joke that becomes an Internet sensation.", 8.7);
        Season episode6 = new Season("S13.E6 Pinewood Derby", "Randy and Stan cheat in the annual Pinewood Derby race.", 7.5);
        Season episode7 = new Season("S13.E7 Fatbeard", "Cartman dreams of living the life of a pirate.", 7.7);
        Season episode8 = new Season("S13.E8 Dead Celebrities", "Ike is haunted by the ghost of Michael Jackson.", 8.2);
        Season episode9 = new Season("S13.E9 Butters' Bottom Bitch", "Butters becomes a pimp.", 8.4);
        Season episode10 = new Season("S13.E10 W.T.F.", "The boys join the wrestling team.", 7.9);
        Season episode11 = new Season("S13.E11 Whale Whores", "Stan takes on Japanese whalers.", 8.1);
        Season episode12 = new Season("S13.E12 The F Word", "The town tries to change the definition of the word 'fag'.", 8.4);
        Season episode13 = new Season("S13.E13 Dances with Smurfs", "Cartman becomes the morning announcer.", 8.3);
        Season episode14 = new Season("S13.E14 Pee", "The boys try to escape a water park disaster.", 7.4);

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
    }
}
