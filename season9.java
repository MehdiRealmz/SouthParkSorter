package SouthPark;
import java.util.*;
import java.util.List;

import javax.swing.*;
import java.awt.*;


public class Season9Printer {
    JFrame frame= new JFrame();
    JLabel label = new JLabel("Season 9 Ratings");

    public Season9Printer(){
    HashMap<String, Double> Season9episodes = new HashMap<String, Double>();
        Season9episodes.put("Episode 1: Mr. Garrison's Fancy New Vagina", 8.0);
        Season9episodes.put("Episode 2: Die Hippie, Die", 8.6);
        Season9episodes.put("Episode 3: Wing", 8.0);
        Season9episodes.put("Episode 4: Best Friends Forever", 8.8);
        Season9episodes.put("Episode 5: The Losing Edge", 8.6);
        Season9episodes.put("Episode 6: The Death of Eric Cartman", 9.1);
        Season9episodes.put("Episode 7: Erection Day", 7.7);
        Season9episodes.put("Episode 8: Two Days Before the Day After Tomorrow", 8.3);
        Season9episodes.put("Episode 9: Marjorine", 8.6);
        Season9episodes.put("Episode 10: Follow That Egg!", 8.0);
        Season9episodes.put("Episode 11: Ginger Kids", 9.0);
        Season9episodes.put("Episode 12: Trapped in the Closet", 9.1);
        Season9episodes.put("Episode 13: Free Willzyx", 8.4);
        Season9episodes.put("Episode 14: Bloody Mary", 8.2);

    List<Map.Entry<String, Double>> episodeList = new ArrayList<>(Season9episodes.entrySet());
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
        sb.append("<h1>  Season 9 Ratings</h1>");  // Title with HTML heading tag
        for (Map.Entry<String, Double> entry : sortedEpisodes.entrySet()) {
            sb.append("<li>")
                    .append(entry.getKey())
                    .append(" - Rating: ")
                    .append(entry.getValue())
                    .append("</li>");

        }
        sb.append("</ul></body></html>");


        // Create the frame
        JFrame frame = new JFrame("Season 9 Episodes Ranked ");
        JLabel label = new JLabel(sb.toString()); // No need to prepend <html> again here
        label.setFont(new Font("Arial", Font.PLAIN, 29)); // Set a font that fits well
        label.setPreferredSize(new Dimension(800, 600)); // Set a preferred size to accommodate the text


        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(label), BorderLayout.CENTER); // Add a JScrollPane for scrolling if necessary

        frame.setSize(1000, 800); // Set an appropriate size for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        PrintSeason9();

}

public void PrintSeason9() {
    Season episode1 = new Season("S9.E1 Mr. Garrison's Fancy New Vagina", "Mr. Garrison undergoes a sex-change operation.", 8.0);
    Season episode2 = new Season("S9.E2 Die Hippie, Die", "Cartman leads the resistance against an invasion of hippies in South Park.", 8.6);
    Season episode3 = new Season("S9.E3 Wing", "The boys start a talent agency and attempt to represent Wing, a singer from New Zealand.", 8.0);
    Season episode4 = new Season("S9.E4 Best Friends Forever", "Kenny becomes a hero in heaven after a PSP game helps him battle Satan's army.", 8.8);
    Season episode5 = new Season("S9.E5 The Losing Edge", "The boys try to lose their baseball games to avoid playing the sport all summer.", 8.6);
    Season episode6 = new Season("S9.E6 The Death of Eric Cartman", "The boys ignore Cartman, leading him to believe he is dead.", 9.1);
    Season episode7 = new Season("S9.E7 Erection Day", "Jimmy struggles with unwanted erections and competes in a talent show.", 7.7);
    Season episode8 = new Season("S9.E8 Two Days Before the Day After Tomorrow", "The town of South Park is in chaos after global warming panic.", 8.3);
    Season episode9 = new Season("S9.E9 Marjorine", "Butters fakes his death to infiltrate a girls' slumber party.", 8.6);
    Season episode10 = new Season("S9.E10 Follow That Egg!", "Mr. Slave and Big Gay Al's marriage threatens Mrs. Garrison.", 8.0);
    Season episode11 = new Season("S9.E11 Ginger Kids", "Cartman starts a campaign against red-haired, freckled kids.", 9.0);
    Season episode12 = new Season("S9.E12 Trapped in the Closet", "Stan is hailed as the new prophet of Scientology, leading to Tom Cruise hiding in his closet.", 9.1);
    Season episode13 = new Season("S9.E13 Free Willzyx", "The boys try to help a whale escape to the moon.", 8.4);
    Season episode14 = new Season("S9.E14 Bloody Mary", "A statue of the Virgin Mary starts bleeding, causing a religious frenzy.", 8.2);

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

