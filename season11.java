package SouthPark;
import java.util.*;
import java.util.List;

import javax.swing.*;
import java.awt.*;

public class Season11Printer {
    JFrame frame= new JFrame();
    JLabel label = new JLabel("Season 11 Ratings");
    public Season11Printer(){
    HashMap<String, Double> Season11episodes = new HashMap<String, Double>();
        Season11episodes.put("Episode 1: With Apologies to Jesse Jackson", 8.8);
        Season11episodes.put("Episode 2: Cartman Sucks", 8.5);
        Season11episodes.put("Episode 3: Lice Capades", 8.2);
        Season11episodes.put("Episode 4: The Snuke", 8.7);
        Season11episodes.put("Episode 5: Fantastic Easter Special", 8.2);
        Season11episodes.put("Episode 6: D-Yikes!", 8.3);
        Season11episodes.put("Episode 7: Night of the Living Homeless", 8.6);
        Season11episodes.put("Episode 8: Le Petit Tourette", 8.6);
        Season11episodes.put("Episode 9: More Crap", 8.1);
        Season11episodes.put("Episode 10: Imaginationland Episode I", 9.2);
        Season11episodes.put("Episode 11: Imaginationland Episode II", 9.0);
        Season11episodes.put("Episode 12: Imaginationland Episode III", 9.1);
        Season11episodes.put("Episode 13: Guitar Queer-o", 8.2);
        Season11episodes.put("Episode 14: The List", 8.4);

    List<Map.Entry<String, Double>> episodeList = new ArrayList<>(Season11episodes.entrySet());
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
        sb.append("<h1>  Season 11 Ratings</h1>");  // Title with HTML heading tag
        for (Map.Entry<String, Double> entry : sortedEpisodes.entrySet()) {
            sb.append("<li>")
                    .append(entry.getKey())
                    .append(" - Rating: ")
                    .append(entry.getValue())
                    .append("</li>");

        }
        sb.append("</ul></body></html>");


        // Create the frame
        JFrame frame = new JFrame("Season 11 Episodes Ranked ");
        JLabel label = new JLabel(sb.toString()); // No need to prepend <html> again here
        label.setFont(new Font("Arial", Font.PLAIN, 29)); // Set a font that fits well
        label.setPreferredSize(new Dimension(800, 600)); // Set a preferred size to accommodate the text


        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(label), BorderLayout.CENTER); // Add a JScrollPane for scrolling if necessary

        frame.setSize(1000, 800); // Set an appropriate size for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        PrintSeason11();
}

public void PrintSeason11() {
    Season episode1 = new Season("S11.E1 With Apologies to Jesse Jackson", "Randy uses a racial slur on live TV, leading to unintended consequences.", 8.8);
    Season episode2 = new Season("S11.E2 Cartman Sucks", "Butters is sent to a conversion camp while Cartman deals with an embarrassing photo.", 8.5);
    Season episode3 = new Season("S11.E3 Lice Capades", "The boys search for the kid with head lice, leading to a lice epidemic.", 8.2);
    Season episode4 = new Season("S11.E4 The Snuke", "The boys discover a terrorist plot involving Hillary Clinton's campaign.", 8.7);
    Season episode5 = new Season("S11.E5 Fantastic Easter Special", "Stan and Kyle uncover the truth behind Easter and the Catholic Church.", 8.2);
    Season episode6 = new Season("S11.E6 D-Yikes!", "Ms. Garrison leads a battle against Persians who want to take over a lesbian bar.", 8.3);
    Season episode7 = new Season("S11.E7 Night of the Living Homeless", "South Park is overrun by homeless people in a parody of zombie films.", 8.6);
    Season episode8 = new Season("S11.E8 Le Petit Tourette", "Cartman feigns having Tourette's syndrome to say whatever he wants.", 8.6);
    Season episode9 = new Season("S11.E9 More Crap", "Randy competes to produce the world's biggest bowel movement.", 8.1);
    Season episode10 = new Season("S11.E10 Imaginationland Episode I", "The boys are transported to a fantastical world where good and evil imaginary creatures wage war.", 9.2);
    Season episode11 = new Season("S11.E11 Imaginationland Episode II", "The war in Imaginationland continues as the government intervenes.", 9.0);
    Season episode12 = new Season("S11.E12 Imaginationland Episode III", "The final battle for Imaginationland ensues as the boys try to restore order.", 9.1);
    Season episode13 = new Season("S11.E13 Guitar Queer-o", "Stan and Kyle become rock stars playing Guitar Hero.", 8.2);
    Season episode14 = new Season("S11.E14 The List", "The girls' list ranking the boys' looks leads to chaos at South Park Elementary.", 8.4);

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


