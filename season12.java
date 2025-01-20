package SouthPark;
import java.util.*;
import java.util.List;

import javax.swing.*;
import java.awt.*;

public class Season12Printer {
    JFrame frame= new JFrame();
    JLabel label = new JLabel("Season 12 Ratings");


    public Season12Printer(){

    HashMap<String, Double> Season12episodes = new HashMap<String, Double>();
        Season12episodes.put("Episode 1: Tonsil Trouble", 7.8);
        Season12episodes.put("Episode 2: Britney's New Look", 7.6);
        Season12episodes.put("Episode 3: Major Boobage", 8.7);
        Season12episodes.put("Episode 4: Canada on Strike", 8.2);
        Season12episodes.put("Episode 5: Eek, a Penis!", 8.0);
        Season12episodes.put("Episode 6: Over Logging", 8.4);
        Season12episodes.put("Episode 7: Super Fun Time", 7.9);
        Season12episodes.put("Episode 8: The China Probrem", 7.2);
        Season12episodes.put("Episode 9: Breast Cancer Show Ever", 8.3);
        Season12episodes.put("Episode 10: Pandemic", 8.1);
        Season12episodes.put("Episode 11: Pandemic 2: The Startling", 8.2);
        Season12episodes.put("Episode 12: About Last Night...", 8.6);
        Season12episodes.put("Episode 13: Elementary School Musical", 7.5);
        Season12episodes.put("Episode 14: The Ungroundable", 8.1);

    List<Map.Entry<String, Double>> episodeList = new ArrayList<>(Season12episodes.entrySet());
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
        sb.append("<h1>  Season 12 Ratings</h1>");  // Title with HTML heading tag
        for (Map.Entry<String, Double> entry : sortedEpisodes.entrySet()) {
            sb.append("<li>")
                    .append(entry.getKey())
                    .append(" - Rating: ")
                    .append(entry.getValue())
                    .append("</li>");

        }
        sb.append("</ul></body></html>");


        // Create the frame
        JFrame frame = new JFrame("Season 12 Episodes Ranked ");
        JLabel label = new JLabel(sb.toString()); // No need to prepend <html> again here
        label.setFont(new Font("Arial", Font.PLAIN, 29)); // Set a font that fits well
        label.setPreferredSize(new Dimension(800, 600)); // Set a preferred size to accommodate the text


        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(label), BorderLayout.CENTER); // Add a JScrollPane for scrolling if necessary

        frame.setSize(1000, 800); // Set an appropriate size for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        PrintSeason12();

}

public void PrintSeason12() {
    Season episode1 = new Season("S12.E1 Tonsil Trouble", "Cartman contracts an incurable disease and makes Kyle his target.", 7.8);
    Season episode2 = new Season("S12.E2 Britney's New Look", "The boys try to save Britney Spears from the public eye.", 7.6);
    Season episode3 = new Season("S12.E3 Major Boobage", "The boys experience the latest drug craze: cheesing.", 8.7);
    Season episode4 = new Season("S12.E4 Canada on Strike", "The boys try to help Canada during a strike.", 8.2);
    Season episode5 = new Season("S12.E5 Eek, a Penis!", "Mrs. Garrison undergoes surgery while Cartman teaches inner-city kids.", 8.0);
    Season episode6 = new Season("S12.E6 Over Logging", "South Park faces a crisis when the internet goes down.", 8.4);
    Season episode7 = new Season("S12.E7 Super Fun Time", "The boys go on a field trip to a living history museum.", 7.9);
    Season episode8 = new Season("S12.E8 The China Probrem", "Kyle and Stan try to help Cartman with his fear of Chinese people.", 7.2);
    Season episode9 = new Season("S12.E9 Breast Cancer Show Ever", "Wendy gets into a fight with Cartman.", 8.3);
    Season episode10 = new Season("S12.E10 Pandemic", "The boys try to make money from a global crisis involving guinea pigs.", 8.1);
    Season episode11 = new Season("S12.E11 Pandemic 2: The Startling", "The crisis worsens as the boys struggle to survive.", 8.2);
    Season episode12 = new Season("S12.E12 About Last Night...", "The town reacts to the 2008 presidential election results.", 8.6);
    Season episode13 = new Season("S12.E13 Elementary School Musical", "The boys struggle to cope with the craze of High School Musical.", 7.5);
    Season episode14 = new Season("S12.E14 The Ungroundable", "Butters becomes a vampire while the Goth kids revolt.", 8.1);

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

