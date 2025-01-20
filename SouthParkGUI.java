package SouthPark;
import java.util.*;
import java.util.List;


import javax.swing.*;
import java.awt.*;
public class Season1Printer {
JFrame frame= new JFrame("Season 1 Ratings");


    JTextArea textArea = new JTextArea();
    JScrollPane scrollPane = new JScrollPane(textArea);
    public Season1Printer() {
        HashMap<String, Double> Season1episodes = new HashMap<String, Double>();
        Season1episodes.put("Episode 1: Unaired Pilot", 7.5);
        Season1episodes.put("Episode 2: Cartman Gets an Anal Probe", 7.9);
        Season1episodes.put("Episode 3: Weight Gain 4000", 7.5);
        Season1episodes.put("Episode 4: Volcano", 7.6);
        Season1episodes.put("Episode 5: Big Gay Al's Big Gay Boat Ride", 7.6);
        Season1episodes.put("Episode 6: An Elephant Makes Love to a Pig", 7.4);
        Season1episodes.put("Episode 7: Death", 8.0);
        Season1episodes.put("Episode 8: Pinkeye", 8.3);
        Season1episodes.put("Episode 9: Starvin' Marvin", 8.0);
        Season1episodes.put("Episode 10: Mr. Hankey, the Christmas Poo", 8.1);
        Season1episodes.put("Episode 11: Damien", 7.6);
        Season1episodes.put("Episode 12: Tom's Rhinoplasty", 7.9);
        Season1episodes.put("Episode 13: Mecha-Streisand", 7.5);
        Season1episodes.put("Episode 14: Cartman's Mom Is a Dirty Slut", 8.6);
        List<Map.Entry<String, Double>> episodeList = new ArrayList<>(Season1episodes.entrySet());

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
        sb.append("<h1>  Season 1 Ratings</h1>");  // Title with HTML heading tag
        for (Map.Entry<String, Double> entry : sortedEpisodes.entrySet()) {
            sb.append("<li>")
                    .append(entry.getKey())
                    .append(" - Rating: ")
                    .append(entry.getValue())
                    .append("</li>");

        }
        sb.append("</ul></body></html>");


        // Create the frame
        JFrame frame = new JFrame("Season 1 Episodes Ranked ");
        JLabel label = new JLabel(sb.toString()); // No need to prepend <html> again here
        label.setFont(new Font("Arial", Font.PLAIN, 29)); // Set a font that fits well
        label.setPreferredSize(new Dimension(800, 600)); // Set a preferred size to accommodate the text


        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(label), BorderLayout.CENTER); // Add a JScrollPane for scrolling if necessary

        frame.setSize(1000, 800); // Set an appropriate size for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        PrintSeason1();
    }
    public void PrintSeason1() {

        Season episode1 = new Season(" Episode 1Unaired Pilot", "Cartman wakes up and realizes he was abducted by aliens after hearing it from his friends. He is in major denial at first though, but even Chef is a believer.", 7.5);
        Season episode2 = new Season(" Episode 2 Cartman Gets an Anal Probe", "Cartman's dream about being abducted by aliens turns out to have actually happened, and when the aliens take Kyle's brother, all of them must find a way to bring the aliens back and confront them.", 7.9);
        Season episode3 = new Season(" Episode 3 Weight Gain 4000", "Kathie Lee Gifford comes to South Park to present an award to Cartman, and Mr. Garrison hopes to use the event to assassinate her.", 7.5);
        Season episode4 = new Season(" Episode 4 Volcano", "The kids go hunting with the rather trigger happy Jimbo and Ned. Little do they know that a volcano is on the verge of erupting..", 7.6);
        Season episode5 = new Season("Episode 5  Big Gay Al's Big Gay Boat Ride", "Stan becomes distracted from the upcoming football game because his dog is gay, so he turns to the gayest man in town for advice, Big Gay Al.", 7.6);

        Season episode6 = new Season(" Episode 6 An Elephant Makes Love to a Pig", "Kyle tries to crossbreed an elephant with a pig to win a science contest.", 7.4);
        Season episode7 = new Season(" Episode 7 Death", "Grampa wants Stan to kill him, the parents all want to kill the Terrance and Philip show, and Death just wants to kill someone.", 8.0);
        Season episode8 = new Season(" Episode 8 Pinkeye", "The living dead beset South Park after a bottle of Worcestershire sauce mixes with embalming fluid at the mortuary; Tina Yothers judged a costume contest.", 8.3);
        Season episode9 = new Season(" Episode 9 Starvin' Marvin", "The boys sponsor a starving Ethiopian child, only to have him show up on their doorstep..", 8.0);
        Season episode10 = new Season(" Episode 10 Mr. Hankey, the Christmas Poo", "The town is forced to remove anything that either has anything to do with Christmas or is offensive in the least bit to anyone. And Kyle tries to convince everyone of the existence of //\"Mr. Hankey, the Christmas Poo.\".", 8.1);
        Season episode11 = new Season(" Episode 11  Damien", "The son of Satan called Damien is sent to Earth to find Jesus. Jesus and Satan end up in a fight of good and evil. The only problem is it's the same date as Cartman's birthday.", 7.6);
        Season episode12 = new Season(" Episode 12 Tom's Rhinoplasty", "Stan develops a crush on a substitute teacher, which makes his girlfriend Wendy jealous. Meanwhile, Mr. Garrison has plastic surgery.", 7.9);
        Season episode13 = new Season(" Episode 13 Mecha-Streisand", "Barbra Streisand comes to South Park after she learns that the boys have discovered a mysterious ancient stone. She hopes to unlock the stone's magical powers and transform herself into a deadly robotic giant.", 7.5);
        Season episode14 = new Season(" Episode 14 Cartman's Mom Is a Dirty Slut", "Eric Cartman goes on a quest to find out who his father was. But when he learns who his mother slept with matters get complicated... because she slept with everybody in town.", 8.6);
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
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Season1Printer());
    }
}
