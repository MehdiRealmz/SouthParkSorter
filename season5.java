package SouthPark;
import java.util.*;
import java.util.List;


import javax.swing.*;
import java.awt.*;
public class Season5Printer {
    JFrame frame= new JFrame();
    JLabel label = new JLabel("Season 5 Ratings");
    public Season5Printer(){
        HashMap<String, Double> Season5episodes = new HashMap<String, Double>();
        Season5episodes.put("Episode 1: It Hits the Fan", 8.3);
        Season5episodes.put("Episode 2: Cripple Fight", 8.3);
        Season5episodes.put("Episode 3: Super Best Friends", 8.8);
        Season5episodes.put("Episode 4: Scott Tenorman Must Die", 9.6);
        Season5episodes.put("Episode 5: Terrance and Phillip: Behind the Blow", 7.7);
        Season5episodes.put("Episode 6: Cartmanland", 8.8);
        Season5episodes.put("Episode 7: Proper Condom Use", 8.4);
        Season5episodes.put("Episode 8: Towelie", 8.0);
        Season5episodes.put("Episode 9: Osama bin Laden Has Farty Pants", 8.6);
        Season5episodes.put("Episode 10: How to Eat with Your Butt", 8.0);
        Season5episodes.put("Episode 11: The Entity", 8.3);
        Season5episodes.put("Episode 12: Here Comes the Neighborhood", 8.2);
        Season5episodes.put("Episode 13: Kenny Dies", 9.0);
        Season5episodes.put("Episode 14: Butters' Very Own Episode", 8.8);

        List<Map.Entry<String, Double>> episodeList = new ArrayList<>(Season5episodes.entrySet());
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
        sb.append("<h1>  Season 5 Ratings</h1>");  // Title with HTML heading tag
        for (Map.Entry<String, Double> entry : sortedEpisodes.entrySet()) {
            sb.append("<li>")
                    .append(entry.getKey())
                    .append(" - Rating: ")
                    .append(entry.getValue())
                    .append("</li>");

        }
        sb.append("</ul></body></html>");


        // Create the frame
        JFrame frame = new JFrame("Season 5 Episodes Ranked ");
        JLabel label = new JLabel(sb.toString()); // No need to prepend <html> again here
        label.setFont(new Font("Arial", Font.PLAIN, 29)); // Set a font that fits well
        label.setPreferredSize(new Dimension(800, 600)); // Set a preferred size to accommodate the text


        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(label), BorderLayout.CENTER); // Add a JScrollPane for scrolling if necessary

        frame.setSize(1000, 800); // Set an appropriate size for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        PrintSeason5();
    }
    public void PrintSeason5(){
        Season episode1 = new Season("S5.E1 It Hits the Fan", "The town of South Park suffers from mass hysteria when a popular TV show uses the word 'shit' on air.", 8.3);
        Season episode2 = new Season("S5.E2 Cripple Fight", "Big Gay Al returns as Scoutmaster and fights with Timmy's new friend Jimmy.", 8.3);
        Season episode3 = new Season("S5.E3 Super Best Friends", "Stan, Kyle, Cartman, and Kenny join forces with Jesus and other religious figures to battle a cult.", 8.8);
        Season episode4 = new Season("S5.E4 Scott Tenorman Must Die", "Cartman seeks revenge on an older boy who tricked him into buying pubic hair.", 9.6);
        Season episode5 = new Season("S5.E5 Terrance and Phillip: Behind the Blow", "The boys try to reunite Terrance and Phillip after their TV show is canceled.", 7.7);
        Season episode6 = new Season("S5.E6 Cartmanland", "Cartman inherits a million dollars and buys his own amusement park.", 8.8);
        Season episode7 = new Season("S5.E7 Proper Condom Use", "The kids in South Park get a crash course in sex education.", 8.4);
        Season episode8 = new Season("S5.E8 Towelie", "The boys get a new friend who is a genetically engineered towel.", 8.0);
        Season episode9 = new Season("S5.E9 Osama bin Laden Has Farty Pants", "The boys take on Osama bin Laden after being sent to Afghanistan.", 8.6);
        Season episode10 = new Season("S5.E10 How to Eat with Your Butt", "Cartman makes a prank involving Butters' buttocks, leading to unforeseen consequences.", 8.0);
        Season episode11 = new Season("S5.E11 The Entity", "Mr. Garrison invents a new mode of transportation to replace airline travel.", 8.3);
        Season episode12 = new Season("S5.E12 Here Comes the Neighborhood", "Rich people move to South Park, causing problems for the locals.", 8.2);
        Season episode13 = new Season("S5.E13 Kenny Dies", "Kenny is diagnosed with a terminal illness, and the boys must cope with the reality.", 9.0);
        Season episode14 = new Season("S5.E14 Butters' Very Own Episode", "Butters' family secrets are revealed in this episode focused entirely on him.", 8.8);
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

