package SouthPark;
import java.util.*;
import java.util.List;

import javax.swing.*;
import java.awt.*;
public class Season15Printer {
    JFrame frame= new JFrame();
    JLabel label = new JLabel("Season 15 Ratings");
    public void Season15Printer(){
    HashMap<String, Double> Season15episodes = new HashMap<String, Double>();
        Season15episodes.put("Episode 1: HUMANCENTiPAD", 8.2);
        Season15episodes.put("Episode 2: T.M.I.", 8.2);
        Season15episodes.put("Episode 3: Royal Pudding", 8.1);
        Season15episodes.put("Episode 4: (The) Last of the Meheecans", 8.0);
        Season15episodes.put("Episode 5: Breadsticks", 7.8);
        Season15episodes.put("Episode 6: City Sushi", 8.0);
        Season15episodes.put("Episode 7: You Have 0 Friends", 8.2);
        Season15episodes.put("Episode 8: The Last of the Meheecans", 8.0);
        Season15episodes.put("Episode 9: The Coon 2: Hindsight", 8.1);
        Season15episodes.put("Episode 10: Coon vs. Coon & Friends", 8.3);
        Season15episodes.put("Episode 11: The Tale of Scrotie McBoogerballs", 8.1);
        Season15episodes.put("Episode 12: Poor and Stupid", 8.2);
        Season15episodes.put("Episode 13: Medicinal Fried Chicken", 8.2);
        Season15episodes.put("Episode 14: You Have 0 Friends", 7.9);

    List<Map.Entry<String, Double>> episodeList = new ArrayList<>(Season15episodes.entrySet());
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
        sb.append("<h1>  Season 15 Ratings</h1>");  // Title with HTML heading tag
        for (Map.Entry<String, Double> entry : sortedEpisodes.entrySet()) {
            sb.append("<li>")
                    .append(entry.getKey())
                    .append(" - Rating: ")
                    .append(entry.getValue())
                    .append("</li>");

        }
        sb.append("</ul></body></html>");


        // Create the frame
        JFrame frame = new JFrame("Season 15 Episodes Ranked ");
        JLabel label = new JLabel(sb.toString()); // No need to prepend <html> again here
        label.setFont(new Font("Arial", Font.PLAIN, 29)); // Set a font that fits well
        label.setPreferredSize(new Dimension(800, 600)); // Set a preferred size to accommodate the text


        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(label), BorderLayout.CENTER); // Add a JScrollPane for scrolling if necessary

        frame.setSize(1000, 800); // Set an appropriate size for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        PrintSeason15();

    }

public void PrintSeason15() {
    Season episode1 = new Season("S15.E1 HUMANCENTiPAD", "The boys become addicted to the latest Apple gadget.", 8.2);
    Season episode2 = new Season("S15.E2 T.M.I.", "The boys experience issues with their social media profiles.", 8.2);
    Season episode3 = new Season("S15.E3 Royal Pudding", "Canada celebrates its royal family in a special way.", 8.1);
    Season episode4 = new Season("S15.E4 (The) Last of the Meheecans", "The boys help a Mexican family get back to their homeland.", 8.0);
    Season episode5 = new Season("S15.E5 Breadsticks", "A new restaurant opens in town and causes chaos.", 7.8);
    Season episode6 = new Season("S15.E6 City Sushi", "Stan and his friends discover the hidden dangers of a new sushi restaurant.", 8.0);
    Season episode7 = new Season("S15.E7 You Have 0 Friends", "The boys try to boost their social media popularity.", 8.2);
    Season episode8 = new Season("S15.E8 The Last of the Meheecans", "The boys get involved in a battle between rival Mexican gangs.", 8.0);
    Season episode9 = new Season("S15.E9 The Coon 2: Hindsight", "The Coon tries to make up for past mistakes.", 8.1);
    Season episode10 = new Season("S15.E10 Coon vs. Coon & Friends", "The battle between the Coon and his former allies intensifies.", 8.3);
    Season episode11 = new Season("S15.E11 The Tale of Scrotie McBoogerballs", "The boys' new book becomes a controversy.", 8.1);
    Season episode12 = new Season("S15.E12 Poor and Stupid", "The boys aim for fame by acting foolishly.", 8.2);
    Season episode13 = new Season("S15.E13 Medicinal Fried Chicken", "Randy's new business venture causes trouble.", 8.2);
    Season episode14 = new Season("S15.E14 You Have 0 Friends", "Stan deals with his dwindling social media presence.", 7.9);

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


