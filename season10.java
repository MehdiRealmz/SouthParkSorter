package SouthPark;

import java.util.HashMap;
import java.util.*;
import java.util.List;

import javax.swing.*;
import java.awt.*;

public class Season10Printer {
    JFrame frame= new JFrame();
    JLabel label = new JLabel("Season 10 Ratings");
    public Season10Printer(){
    HashMap<String, Double> Season10episodes = new HashMap<String, Double>();
        Season10episodes.put("Episode 1: The Return of Chef", 8.0);
        Season10episodes.put("Episode 2: Smug Alert!", 8.5);
        Season10episodes.put("Episode 3: Cartoon Wars: Part 1", 8.8);
        Season10episodes.put("Episode 4: Cartoon Wars: Part 2", 9.1);
        Season10episodes.put("Episode 5: A Million Little Fibers", 7.0);
        Season10episodes.put("Episode 6: ManBearPig", 8.4);
        Season10episodes.put("Episode 7: Tsst", 8.6);
        Season10episodes.put("Episode 8: Make Love, Not Warcraft", 9.5);
        Season10episodes.put("Episode 9: Mystery of the Urinal Deuce", 8.3);
        Season10episodes.put("Episode 10: Miss Teacher Bangs a Boy", 8.4);
        Season10episodes.put("Episode 11: Hell on Earth 2006", 8.3);
        Season10episodes.put("Episode 12: Go God Go", 8.7);
        Season10episodes.put("Episode 13: Go God Go XII", 8.7);
        Season10episodes.put("Episode 14: Stanley's Cup", 7.6);

    List<Map.Entry<String, Double>> episodeList = new ArrayList<>(Season10episodes.entrySet());
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
        sb.append("<h1>  Season 10 Ratings</h1>");  // Title with HTML heading tag
        for (Map.Entry<String, Double> entry : sortedEpisodes.entrySet()) {
            sb.append("<li>")
                    .append(entry.getKey())
                    .append(" - Rating: ")
                    .append(entry.getValue())
                    .append("</li>");

        }
        sb.append("</ul></body></html>");


        // Create the frame
        JFrame frame = new JFrame("Season 10 Episodes Ranked ");
        JLabel label = new JLabel(sb.toString()); // No need to prepend <html> again here
        label.setFont(new Font("Arial", Font.PLAIN, 29)); // Set a font that fits well
        label.setPreferredSize(new Dimension(800, 600)); // Set a preferred size to accommodate the text


        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(label), BorderLayout.CENTER); // Add a JScrollPane for scrolling if necessary

        frame.setSize(1000, 800); // Set an appropriate size for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        PrintSeason10();
    }

public void PrintSeason10() {
    Season episode1 = new Season("S10.E1 The Return of Chef", "Chef returns to South Park, but the boys notice something strange about him.", 8.0);
    Season episode2 = new Season("S10.E2 Smug Alert!", "Kyle's father buys a hybrid car, leading to an environmental disaster in South Park.", 8.5);
    Season episode3 = new Season("S10.E3 Cartoon Wars: Part 1", "Cartman attempts to get Family Guy off the air after they announce a controversial episode.", 8.8);
    Season episode4 = new Season("S10.E4 Cartoon Wars: Part 2", "Cartman's plan to get Family Guy canceled hits a snag when he meets a new ally.", 9.1);
    Season episode5 = new Season("S10.E5 A Million Little Fibers", "Towelie writes a memoir, but his drug addiction gets in the way.", 7.0);
    Season episode6 = new Season("S10.E6 ManBearPig", "Al Gore comes to South Park to warn everyone about the mythical ManBearPig.", 8.4);
    Season episode7 = new Season("S10.E7 Tsst", "Cartman's mom hires a dog whisperer to control his behavior.", 8.6);
    Season episode8 = new Season("S10.E8 Make Love, Not Warcraft", "The boys dedicate themselves to defeating a high-level player killing everyone in World of Warcraft.", 9.5);
    Season episode9 = new Season("S10.E9 Mystery of the Urinal Deuce", "Cartman investigates who defecated in a school urinal.", 8.3);
    Season episode10 = new Season("S10.E10 Miss Teacher Bangs a Boy", "Kyle discovers his little brother Ike is having an affair with his kindergarten teacher.", 8.4);
    Season episode11 = new Season("S10.E11 Hell on Earth 2006", "Satan throws a Halloween party in the style of 'My Super Sweet 16'.", 8.3);
    Season episode12 = new Season("S10.E12 Go God Go", "Cartman is desperate for the release of the new Nintendo Wii.", 8.7);
    Season episode13 = new Season("S10.E13 Go God Go XII", "Cartman is stuck in the future where atheism rules the world.", 8.7);
    Season episode14 = new Season("S10.E14 Stanley's Cup", "Stan becomes the coach of a Pee Wee hockey team.", 7.6);

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


