package SouthPark;
import java.util.*;
import java.util.List;


import javax.swing.*;
import java.awt.*;
public class Season4Printer {
    JFrame frame= new JFrame();
    JLabel label = new JLabel("Season 4 Ratings");
    public Season4Printer(){
        HashMap<String, Double> Season4episodes = new HashMap<String, Double>();
        Season4episodes.put("Episode 1: The Tooth Fairy's Tats 2000", 8.1);
        Season4episodes.put("Episode 2: Cartman's Silly Hate Crime 2000", 7.9);
        Season4episodes.put("Episode 3: Timmy 2000", 8.3);
        Season4episodes.put("Episode 4: Quintuplets 2000", 7.7);
        Season4episodes.put("Episode 5: Cartman Joins NAMBLA", 8.1);
        Season4episodes.put("Episode 6: Cherokee Hair Tampons", 8.2);
        Season4episodes.put("Episode 7: Chef Goes Nanners", 8.0);
        Season4episodes.put("Episode 8: Something You Can Do with Your Finger", 8.3);
        Season4episodes.put("Episode 9: Do the Handicapped Go to Hell?", 8.5);
        Season4episodes.put("Episode 10: Probably", 8.5);
        Season4episodes.put("Episode 11: Fourth Grade", 8.3);
        Season4episodes.put("Episode 12: Trapper Keeper", 8.3);
        Season4episodes.put("Episode 13: Helen Keller! The Musical", 8.1);
        Season4episodes.put("Episode 14: Pip", 6.5);
        Season4episodes.put("Episode 15: Fat Camp", 8.4);
        Season4episodes.put("Episode 16: The Wacky Molestation Adventure", 8.3);
        Season4episodes.put("Episode 17: A Very Crappy Christmas", 8.0);

        List<Map.Entry<String, Double>> episodeList = new ArrayList<>(Season4episodes.entrySet());
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
        sb.append("<h1>  Season 4 Ratings</h1>");  // Title with HTML heading tag
        for (Map.Entry<String, Double> entry : sortedEpisodes.entrySet()) {
            sb.append("<li>")
                    .append(entry.getKey())
                    .append(" - Rating: ")
                    .append(entry.getValue())
                    .append("</li>");

        }
        sb.append("</ul></body></html>");


        // Create the frame
        JFrame frame = new JFrame("Season 4 Episodes Ranked ");
        JLabel label = new JLabel(sb.toString()); // No need to prepend <html> again here
        label.setFont(new Font("Arial", Font.PLAIN, 29)); // Set a font that fits well
        label.setPreferredSize(new Dimension(800, 600)); // Set a preferred size to accommodate the text


        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(label), BorderLayout.CENTER); // Add a JScrollPane for scrolling if necessary

        frame.setSize(1000, 800); // Set an appropriate size for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        PrintSeason4();

    }
public void PrintSeason4(){
    Season episode1 = new Season("S4.E1 The Tooth Fairy's Tats 2000",
            "The boys start a scheme to get rich by tricking the tooth fairy.", 8.1);
    Season episode2 = new Season("S4.E2 Cartman's Silly Hate Crime 2000",
            "Cartman gets sent to juvenile hall for a hate crime.", 7.9);
    Season episode3 = new Season("S4.E3 Timmy 2000",
            "The kids are diagnosed with ADD after Timmy is misdiagnosed, and Timmy joins a rock band.", 8.3);
    Season episode4 = new Season("S4.E4 Quintuplets 2000",
            "Stan's family takes in a Romanian quintuplet family, and Kenny becomes an opera singer.", 7.7);
    Season episode5 = new Season("S4.E5 Cartman Joins NAMBLA",
            "Cartman mistakenly joins NAMBLA while trying to find older friends, and Kenny tries to stop his parents from having another child.", 8.1);
    Season episode6 = new Season("S4.E6 Cherokee Hair Tampons",
            "Stan has to convince Cartman to donate a kidney to save Kyle's life while the town is obsessed with new-age medicine.", 8.2);
    Season episode7 = new Season("S4.E7 Chef Goes Nanners",
            "Chef protests against the South Park flag, and Wendy has a crush on Cartman.", 8.0);
    Season episode8 = new Season("S4.E8 Something You Can Do with Your Finger",
            "The boys form a boy band called 'Fingerbang.'", 8.3);
    Season episode9 = new Season("S4.E9 Do the Handicapped Go to Hell?",
            "The boys question if the handicapped or Jews go to hell, and Satan deals with his relationship issues.", 8.5);
    Season episode10 = new Season("S4.E10 Probably",
            "The boys start their own church, and Satan has to choose between his lovers.", 8.5);
    Season episode11 = new Season("S4.E11 Fourth Grade",
            "The boys build a time machine to go back to the third grade, and Ms. Choksondik seeks help from Mr. Garrison.", 8.3);
    Season episode12 = new Season("S4.E12 Trapper Keeper",
            "A man from the future wants Cartman's Trapper Keeper, and Mr. Garrison's kindergarten class holds an election.", 8.3);
    Season episode13 = new Season("S4.E13 Helen Keller! The Musical",
            "Timmy befriends a turkey for the Thanksgiving play, and the boys compete with the kindergartners' play.", 8.1);
    Season episode14 = new Season("S4.E14 Pip",
            "A retelling of 'Great Expectations' starring Pip.", 6.5);
    Season episode15 = new Season("S4.E15 Fat Camp",
            "Cartman goes to a weight loss camp, and Kenny becomes famous for doing disgusting things for money.", 8.4);
    Season episode16 = new Season("S4.E16 The Wacky Molestation Adventure",
            "The boys send their parents to jail for 'molestation,' leaving the town to the children.", 8.3);
    Season episode17 = new Season("S4.E17 A Very Crappy Christmas",
            "The boys create a Christmas cartoon when Mr. Hankey is too busy with his family.", 8.0);
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
    System.out.println(episode15);
    System.out.println(episode16);
    System.out.println(episode17);
}
}
