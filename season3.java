ppackage SouthPark;
import javax.swing.*;
import java.util.*;

import java.awt.*;
import java.util.List;
public class Season3Printer {
    JFrame frame= new JFrame();
    JLabel label = new JLabel("Season 3 Ratings");
    public Season3Printer() {
        HashMap<String, Double> Season3episodes = new HashMap<String, Double>();
        Season3episodes.put("Episode 1: Rainforest Shmainforest", 8.4);
        Season3episodes.put("Episode 2: Spontaneous Combustion", 8.1);
        Season3episodes.put("Episode 3: The Succubus", 8.0);
        Season3episodes.put("Episode 4: Jakovasaurs", 6.4);
        Season3episodes.put("Episode 5: Tweek vs. Craig", 7.6);
        Season3episodes.put("Episode 6: Sexual Harassment Panda", 8.2);
        Season3episodes.put("Episode 7: Cat Orgy", 7.9);
        Season3episodes.put("Episode 8: Two Guys Naked in a Hot Tub", 8.0);
        Season3episodes.put("Episode 9: Jewbilee", 7.4);
        Season3episodes.put("Episode 10: Korn's Groovy Pirate Ghost Mystery", 7.8);
        Season3episodes.put("Episode 11: Chinpokomon", 8.7);
        Season3episodes.put("Episode 12: Hooked on Monkey Fonics", 8.0);
        Season3episodes.put("Episode 13: Starvin' Marvin in Space", 8.0);
        Season3episodes.put("Episode 14: The Red Badge of Gayness", 8.3);
        Season3episodes.put("Episode 15: Mr. Hankey's Christmas Classics", 7.3);
        Season3episodes.put("Episode 16: Are You There God? It's Me, Jesus", 7.8);
        Season3episodes.put("Episode 17: World Wide Recorder Concert", 8.1);

        List<Map.Entry<String, Double>> episodeList = new ArrayList<>(Season3episodes.entrySet());
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
        sb.append("<h1>  Season 3 Ratings</h1>");  // Title with HTML heading tag
        for (Map.Entry<String, Double> entry : sortedEpisodes.entrySet()) {
            sb.append("<li>")
                    .append(entry.getKey())
                    .append(" - Rating: ")
                    .append(entry.getValue())
                    .append("</li>");

        }
        sb.append("</ul></body></html>");


        // Create the frame
        JFrame frame = new JFrame("Season 3 Episodes Ranked ");
        JLabel label = new JLabel(sb.toString()); // No need to prepend <html> again here
        label.setFont(new Font("Arial", Font.PLAIN, 29)); // Set a font that fits well
        label.setPreferredSize(new Dimension(800, 600)); // Set a preferred size to accommodate the text


        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(label), BorderLayout.CENTER); // Add a JScrollPane for scrolling if necessary

        frame.setSize(1000, 800); // Set an appropriate size for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        PrintSeason3();

    }

    public void PrintSeason3() {
        Season episode1 = new Season("S3.E1 Rainforest Shmainforest",
                "The gang gets lost in the rain forest after going to Costa Rica with a singing tour.", 8.4);
        Season episode2 = new Season("S3.E2 Spontaneous Combustion",
                "Randy Marsh becomes a national hero after he discovers the reason why South Park residents are spontaneously combusting. Meanwhile, Kyle and Stan have a plan to help Kyle's dad get a res-erection.", 8.1);
        Season episode3 = new Season("S3.E3 The Succubus",
                "The boys try to save Chef from a woman who is stealing him from them. Meanwhile, Cartman gets glasses.", 8.0);
        Season episode4 = new Season("S3.E4 Jakovasaurs",
                "A surviving breed of dinosaur is discovered in South Park, but no one (except Cartman) can stand them.", 6.4);
        Season episode5 = new Season("S3.E5 Tweek vs. Craig",
                "The boys pit two classmates against each other for entertainment. Meanwhile, Kenny takes a home economics class.", 7.6);
        Season episode6 = new Season("S3.E6 Sexual Harassment Panda",
                "South Park Elementary is nearly bankrupt when Cartman sues Stan for sexual harassment.", 8.2);
        Season episode7 = new Season("S3.E7 Cat Orgy",
                "Cartman deals with an abusive babysitter, her boyfriend, and a cat in heat when his mother goes to a party.", 7.9);
        Season episode8 = new Season("S3.E8 Two Guys Naked in a Hot Tub",
                "Stan is stuck playing with Butters and Pip at a party. Meanwhile, Randy and Gerald experiment with their sexuality.", 8.0);
        Season episode9 = new Season("S3.E9 Jewbilee",
                "Kenny comes with Kyle to Jewish Camp and almost witnesses the destruction of the Jewish faith.", 7.4);
        Season episode10 = new Season("S3.E10 Korn's Groovy Pirate Ghost Mystery",
                "The rock band Korn visits South Park during Halloween to solve the mystery of the pirate ghosts that are terrifying the town.", 7.8);
        Season episode11 = new Season("S3.E11 Chinpokomon",
                "The kids get hooked on a brainwashing violent cartoon from Japan which turns them against the American government.", 8.7);
        Season episode12 = new Season("S3.E12 Hooked on Monkey Fonics",
                "The boys have a hard time relating to two new students who have been home schooled.", 8.0);
        Season episode13 = new Season("S3.E13 Starvin' Marvin in Space",
                "The government tries to hunt down Starvin' Marvin after he steals an alien spaceship.", 8.0);
        Season episode14 = new Season("S3.E14 The Red Badge of Gayness",
                "A drunken Civil War re-enactment leads to an actual Civil War breaking out.", 8.3);
        Season episode15 = new Season("S3.E15 Mr. Hankey's Christmas Classics",
                "Mr. Hankey hosts a collection of Christmas songs sung by South Park characters.", 7.3);
        Season episode16 = new Season("S3.E16 Are You There God? It's Me, Jesus",
                "Stan worries that he is maturing more slowly than his friends. Meanwhile, Jesus feels pressured to perform a miracle at the start of the new millennium.", 7.8);
        Season episode17 = new Season("S3.E17 World Wide Recorder Concert",
                "The boys feud with New Yorkers at a gathering of elementary school kids. Meanwhile, Mr. Garrison confronts his father.", 8.1);
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
