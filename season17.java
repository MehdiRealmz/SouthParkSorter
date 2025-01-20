package SouthPark;

import java.util.*;
import java.util.List;

import javax.swing.*;
import java.awt.*;

public class Season17Printer {
    JFrame frame= new JFrame();
    JLabel label = new JLabel("Season 17 Ratings");
    public Season17Printer() {
        HashMap<String, Double> Season17episodes = new HashMap<String, Double>();
        Season17episodes.put("Episode 1: Let Go, Let Gov", 8.2);
        Season17episodes.put("Episode 2: Taming Strange", 8.0);
        Season17episodes.put("Episode 3:World War Zimmerman", 8.1);
        Season17episodes.put("Episode 4: Goth Kids 3: Dawn of the Posers", 8.0);
        Season17episodes.put("Episode 5: The Hobbit", 8.2);
        Season17episodes.put("Episode 6: The Cissy", 8.3);
        Season17episodes.put("Episode 7: A Song of Ass and Fire", 8.1);
        Season17episodes.put("Episode 8: Handicar", 8.2);
        Season17episodes.put("Episode 9: The Magic Bush", 8.0);
        Season17episodes.put("Episode 10: Taming Strange", 8.2);
        Season17episodes.put("Episode 11: The Coon 3: The Cooning", 8.1);
        Season17episodes.put("Episode 12: The Poor Kid", 8.2);
        Season17episodes.put("Episode 13: The End of Serialization as We Know It", 8.4);

        List<Map.Entry<String, Double>> episodeList = new ArrayList<>(Season17episodes.entrySet());
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
        sb.append("<h1>  Season 17 Ratings</h1>");  // Title with HTML heading tag
        for (Map.Entry<String, Double> entry : sortedEpisodes.entrySet()) {
            sb.append("<li>")
                    .append(entry.getKey())
                    .append(" - Rating: ")
                    .append(entry.getValue())
                    .append("</li>");

        }
        sb.append("</ul></body></html>");


        // Create the frame
        JFrame frame = new JFrame("Season 17" +
                " Episodes Ranked ");
        JLabel label = new JLabel(sb.toString()); // No need to prepend <html> again here
        label.setFont(new Font("Arial", Font.PLAIN, 29)); // Set a font that fits well
        label.setPreferredSize(new Dimension(800, 600)); // Set a preferred size to accommodate the text


        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(label), BorderLayout.CENTER); // Add a JScrollPane for scrolling if necessary

        frame.setSize(1000, 800); // Set an appropriate size for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        PrintSeason17();

    }

    public void PrintSeason17() {
        Season episode1 = new Season("S17.E1 Let Go, Let Gov", "The boys find themselves in trouble with the government.", 8.2);
        Season episode2 = new Season("S17.E2 Taming Strange", "Stan and his friends try to navigate the challenges of adolescence.", 8.0);
        Season episode3 = new Season("S17.E3 World War Zimmerman", "The town gets caught up in a dramatic reenactment.", 8.1);
        Season episode4 = new Season("S17.E4 Goth Kids 3: Dawn of the Posers", "The Goth Kids face a new threat from posers.", 8.0);
        Season episode5 = new Season("S17.E5 The Hobbit", "The boys are caught up in a fantasy adventure.", 8.2);
        Season episode6 = new Season("S17.E6 The Cissy", "Stan’s dad faces a personal crisis.", 8.3);
        Season episode7 = new Season("S17.E7 A Song of Ass and Fire", "The boys deal with the fallout from a new song trend.", 8.1);
        Season episode8 = new Season("S17.E8 Handicar", "The town’s new transportation service creates chaos.", 8.2);
        Season episode9 = new Season("S17.E9 The Magic Bush", "The boys discover a mysterious new bush in town.", 8.0);
        Season episode10 = new Season("S17.E10 Taming Strange", "The boys continue to grapple with their changing lives.", 8.2);
        Season episode11 = new Season("S17.E11 The Coon 3: The Cooning", "The Coon returns with a new plan for domination.", 8.1);
        Season episode12 = new Season("S17.E12 The Poor Kid", "The boys learn about the challenges faced by poorer families.", 8.2);
        Season episode13 = new Season("S17.E13 The End of Serialization as We Know It", "The boys face the end of their serialized adventures.", 8.4);

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
    }
}
