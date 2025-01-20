package SouthPark;
import java.util.*;
import java.util.List;

import javax.swing.*;
import java.awt.*;


public class Season14Printer {
    JFrame frame= new JFrame();
    JLabel label = new JLabel("Season 14 Ratings");
    public Season14Printer(){
    HashMap<String, Double> Season14episodes = new HashMap<String, Double>();
        Season14episodes.put("Episode 1: Sex Ed", 8.0);
        Season14episodes.put("Episode 2: Taste Test", 8.0);
        Season14episodes.put("Episode 3: The Coon 2: Hindsight", 8.1);
        Season14episodes.put("Episode 4: Coon vs. Coon & Friends", 8.3);
        Season14episodes.put("Episode 5: The Tale of Scrotie McBoogerballs", 8.1);
        Season14episodes.put("Episode 6: Poor and Stupid", 8.2);
        Season14episodes.put("Episode 7: Medicinal Fried Chicken", 8.2);
        Season14episodes.put("Episode 8: You Have 0 Friends", 7.9);
        Season14episodes.put("Episode 9: Clownfish Center", 8.2);
        Season14episodes.put("Episode 10: Creme Fraiche", 8.0);
        Season14episodes.put("Episode 11: The Pandemic Special", 8.3);
        Season14episodes.put("Episode 12: The F Word", 8.4);
        Season14episodes.put("Episode 13: Dances with Smurfs", 8.2);
        Season14episodes.put("Episode 14: Pee", 7.8);

    List<Map.Entry<String, Double>> episodeList = new ArrayList<>(Season14episodes.entrySet());
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
        sb.append("<h1>  Season 14 Ratings</h1>");  // Title with HTML heading tag
        for (Map.Entry<String, Double> entry : sortedEpisodes.entrySet()) {
            sb.append("<li>")
                    .append(entry.getKey())
                    .append(" - Rating: ")
                    .append(entry.getValue())
                    .append("</li>");

        }
        sb.append("</ul></body></html>");


        // Create the frame
        JFrame frame = new JFrame("Season 14 Episodes Ranked ");
        JLabel label = new JLabel(sb.toString()); // No need to prepend <html> again here
        label.setFont(new Font("Arial", Font.PLAIN, 29)); // Set a font that fits well
        label.setPreferredSize(new Dimension(800, 600)); // Set a preferred size to accommodate the text


        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(label), BorderLayout.CENTER); // Add a JScrollPane for scrolling if necessary

        frame.setSize(1000, 800); // Set an appropriate size for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        PrintSeason14();

    }

public void PrintSeason14() {
    Season episode1 = new Season("S14.E1 Sex Ed", "Mr. Mackey has to get the kids in the school excited about sex education.", 8.0);
    Season episode2 = new Season("S14.E2 Taste Test", "The boys get involved in the town's new flavor of ice cream.", 8.0);
    Season episode3 = new Season("S14.E3 The Coon 2: Hindsight", "The Coon returns with a new plan to take down the Coon.", 8.1);
    Season episode4 = new Season("S14.E4 Coon vs. Coon & Friends", "The battle between the Coon and his team vs. the Coon's former allies.", 8.3);
    Season episode5 = new Season("S14.E5 The Tale of Scrotie McBoogerballs", "The boys write a gross book to rebel against censorship.", 8.1);
    Season episode6 = new Season("S14.E6 Poor and Stupid", "The boys try to become famous for their stupidity.", 8.2);
    Season episode7 = new Season("S14.E7 Medicinal Fried Chicken", "Randy opens a medicinal fried chicken restaurant.", 8.2);
    Season episode8 = new Season("S14.E8 You Have 0 Friends", "Stan is upset with the decline in social media friends.", 7.9);
    Season episode9 = new Season("S14.E9 Clownfish Center", "The boys investigate a new aquarium in town.", 8.2);
    Season episode10 = new Season("S14.E10 Creme Fraiche", "Randy's obsession with cooking causes a rift in the family.", 8.0);
    Season episode11 = new Season("S14.E11 The Pandemic Special", "The town deals with the COVID-19 pandemic in their own way.", 8.3);
    Season episode12 = new Season("S14.E12 The F Word", "The town tries to redefine the word 'fag' after its use in a new context.", 8.4);
    Season episode13 = new Season("S14.E13 Dances with Smurfs", "Cartman has an encounter with the Smurfs.", 8.2);
    Season episode14 = new Season("S14.E14 Pee", "The boys' quest to avoid a disaster at a water park.", 7.8);

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


