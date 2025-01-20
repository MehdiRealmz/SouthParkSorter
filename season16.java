package SouthPark;
import java.util.*;
import java.util.List;

import javax.swing.*;
import java.awt.*;

public class Season16Printer {
    JFrame frame= new JFrame();
    JLabel label = new JLabel("Season 16 Ratings");

    public Season16Printer() {
        HashMap<String, Double> Season16episodes = new HashMap<String, Double>();
        Season16episodes.put("Episode 1: Ass Burgers", 8.0);
        Season16episodes.put("Episode 2: Given Up", 8.0);
        Season16episodes.put("Episode 3: The Poor Kid", 8.2);
        Season16episodes.put("Episode 4: Cartman Finds Love", 8.1);
        Season16episodes.put("Episode 5: Butterballs", 8.2);
        Season16episodes.put("Episode 6: I Should Have Never Gone Ziplining", 8.1);
        Season16episodes.put("Episode 7: A History Channel Thanksgiving", 8.0);
        Season16episodes.put("Episode 8: Sarcastaball", 8.1);
        Season16episodes.put("Episode 9: Faith Hilling", 8.2);
        Season16episodes.put("Episode 10: The Spirit of Christmas", 8.3);
        Season16episodes.put("Episode 11: The Last of the Meheecans", 8.0);
        Season16episodes.put("Episode 12: The Coon 2: Hindsight", 8.1);
        Season16episodes.put("Episode 13: Coon vs. Coon & Friends", 8.2);
        Season16episodes.put("Episode 14: The Tale of Scrotie McBoogerballs", 8.1);

        List<Map.Entry<String, Double>> episodeList = new ArrayList<>(Season16episodes.entrySet());
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
        sb.append("<h1>  Season 16 Ratings</h1>");  // Title with HTML heading tag
        for (Map.Entry<String, Double> entry : sortedEpisodes.entrySet()) {
            sb.append("<li>")
                    .append(entry.getKey())
                    .append(" - Rating: ")
                    .append(entry.getValue())
                    .append("</li>");

        }
        sb.append("</ul></body></html>");


        // Create the frame
        JFrame frame = new JFrame("Season 16 Episodes Ranked ");
        JLabel label = new JLabel(sb.toString()); // No need to prepend <html> again here
        label.setFont(new Font("Arial", Font.PLAIN, 29)); // Set a font that fits well
        label.setPreferredSize(new Dimension(800, 600)); // Set a preferred size to accommodate the text


        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(label), BorderLayout.CENTER); // Add a JScrollPane for scrolling if necessary

        frame.setSize(1000, 800); // Set an appropriate size for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        PrintSeason16();

    }

    public void PrintSeason16() {
        Season episode1 = new Season("S16.E1 Ass Burgers", "Eric Cartman gets diagnosed with a new condition.", 8.0);
        Season episode2 = new Season("S16.E2 Given Up", "The boys try to raise their spirits after being grounded.", 8.0);
        Season episode3 = new Season("S16.E3 The Poor Kid", "The boys learn about the hardships of being poor.", 8.2);
        Season episode4 = new Season("S16.E4 Cartman Finds Love", "Cartman tries to find love in an unusual way.", 8.1);
        Season episode5 = new Season("S16.E5 Butterballs", "Butters deals with a bullying issue.", 8.2);
        Season episode6 = new Season("S16.E6 I Should Have Never Gone Ziplining", "The boys' ziplining adventure goes awry.", 8.1);
        Season episode7 = new Season("S16.E7 A History Channel Thanksgiving", "The boys get caught up in a Thanksgiving history lesson.", 8.0);
        Season episode8 = new Season("S16.E8 Sarcastaball", "The town gets involved in a new sport called Sarcastaball.", 8.1);
        Season episode9 = new Season("S16.E9 Faith Hilling", "The boys try to become famous through a new internet trend.", 8.2);
        Season episode10 = new Season("S16.E10 The Spirit of Christmas", "The boys celebrate Christmas with a new understanding.", 8.3);
        Season episode11 = new Season("S16.E11 The Last of the Meheecans", "The boys get involved in a controversial new project.", 8.0);
        Season episode12 = new Season("S16.E12 The Coon 2: Hindsight", "The Coon attempts to make a comeback.", 8.1);
        Season episode13 = new Season("S16.E13 Coon vs. Coon & Friends", "The battle between the Coon and his former team heats up.", 8.2);
        Season episode14 = new Season("S16.E14 The Tale of Scrotie McBoogerballs", "The boys' new book causes unexpected trouble.", 8.1);

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

