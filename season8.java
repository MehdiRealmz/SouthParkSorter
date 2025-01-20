package SouthPark;
import java.util.*;
import java.util.List;

import javax.swing.*;
import java.awt.*;

public class Season8Printer {
    JFrame frame= new JFrame();
    JLabel label = new JLabel("Season 8 Ratings");
    public Season8Printer(){
    HashMap<String, Double> Season8episodes = new HashMap<String, Double>();
        Season8episodes.put("Episode 1: Good Times with Weapons", 9.3);
        Season8episodes.put("Episode 2: Up the Down Steroid", 8.6);
        Season8episodes.put("Episode 3: The Passion of the Jew", 8.4);
        Season8episodes.put("Episode 4: You Got F'd in the A", 8.1);
        Season8episodes.put("Episode 5: AWESOM-O", 9.1);
        Season8episodes.put("Episode 6: The Jeffersons", 8.7);
        Season8episodes.put("Episode 7: Goobacks", 8.8);
        Season8episodes.put("Episode 8: Douche and Turd", 8.3);
        Season8episodes.put("Episode 9: Something Wall-Mart This Way Comes", 8.5);
        Season8episodes.put("Episode 10: Pre-School", 8.7);
        Season8episodes.put("Episode 11: Quest for Ratings", 8.1);
        Season8episodes.put("Episode 12: Stupid Spoiled Whore Video Playset", 8.1);
        Season8episodes.put("Episode 13: Cartman's Incredible Gift", 8.3);
        Season8episodes.put("Episode 14: Woodland Critter Christmas", 8.8);

    List<Map.Entry<String, Double>> episodeList = new ArrayList<>(Season8episodes.entrySet());
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
        sb.append("<h1>  Season 8 Ratings</h1>");  // Title with HTML heading tag
        for (Map.Entry<String, Double> entry : sortedEpisodes.entrySet()) {
            sb.append("<li>")
                    .append(entry.getKey())
                    .append(" - Rating: ")
                    .append(entry.getValue())
                    .append("</li>");

        }
        sb.append("</ul></body></html>");


        // Create the frame
        JFrame frame = new JFrame("Season 8 Episodes Ranked ");
        JLabel label = new JLabel(sb.toString()); // No need to prepend <html> again here
        label.setFont(new Font("Arial", Font.PLAIN, 29)); // Set a font that fits well
        label.setPreferredSize(new Dimension(800, 600)); // Set a preferred size to accommodate the text


        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(label), BorderLayout.CENTER); // Add a JScrollPane for scrolling if necessary

        frame.setSize(1000, 800); // Set an appropriate size for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        PrintSeason8();


}

public void PrintSeason8() {
    Season episode1 = new Season("S8.E1 Good Times with Weapons", "The boys get ninja weapons from a vendor at the local fair.", 9.3);
    Season episode2 = new Season("S8.E2 Up the Down Steroid", "Jimmy competes in the Special Olympics and takes steroids to improve his performance.", 8.6);
    Season episode3 = new Season("S8.E3 The Passion of the Jew", "Cartman tries to get Kyle to see 'The Passion of the Christ'.", 8.4);
    Season episode4 = new Season("S8.E4 You Got F'd in the A", "Stan puts together a dance troupe to compete against a rival group.", 8.1);
    Season episode5 = new Season("S8.E5 AWESOM-O", "Cartman pretends to be a robot to learn secrets from Butters.", 9.1);
    Season episode6 = new Season("S8.E6 The Jeffersons", "The boys meet Michael Jackson, who has moved to South Park.", 8.7);
    Season episode7 = new Season("S8.E7 Goobacks", "People from the future come to South Park looking for work.", 8.8);
    Season episode8 = new Season("S8.E8 Douche and Turd", "The boys have to choose between a giant douche and a turd sandwich in a school mascot election.", 8.3);
    Season episode9 = new Season("S8.E9 Something Wall-Mart This Way Comes", "A new Wall-Mart store opens in South Park, causing economic trouble.", 8.5);
    Season episode10 = new Season("S8.E10 Pre-School", "The boys' past comes back to haunt them when a bully they sent to juvenile hall is released.", 8.7);
    Season episode11 = new Season("S8.E11 Quest for Ratings", "The boys create a news show at the school and compete for ratings.", 8.1);
    Season episode12 = new Season("S8.E12 Stupid Spoiled Whore Video Playset", "Paris Hilton opens a store in South Park, corrupting the girls.", 8.1);
    Season episode13 = new Season("S8.E13 Cartman's Incredible Gift", "Cartman believes he has psychic abilities after a fall.", 8.3);
    Season episode14 = new Season("S8.E14 Woodland Critter Christmas", "Stan is tricked by woodland critters into helping them summon the Antichrist.", 8.8);
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


