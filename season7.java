mport java.awt.*;

public class Season7Printer {
    JFrame frame= new JFrame();
    JLabel label = new JLabel("Season 7 Ratings");
    public Season7Printer(){
    HashMap<String, Double> Season7episodes = new HashMap<String, Double>();
        Season7episodes.put("Episode 1: Cancelled", 8.6);
        Season7episodes.put("Episode 2: Krazy Kripples", 8.4);
        Season7episodes.put("Episode 3: Toilet Paper", 8.4);
        Season7episodes.put("Episode 4: I'm a Little Bit Country", 8.1);
        Season7episodes.put("Episode 5: Fat Butt and Pancake Head", 8.3);
        Season7episodes.put("Episode 6: Lil' Crime Stoppers", 8.5);
        Season7episodes.put("Episode 7: Red Man's Greed", 7.9);
        Season7episodes.put("Episode 8: South Park Is Gay", 8.7);
        Season7episodes.put("Episode 9: Christian Rock Hard", 8.6);
        Season7episodes.put("Episode 10: Grey Dawn", 8.1);
        Season7episodes.put("Episode 11: Casa Bonita", 9.1);
        Season7episodes.put("Episode 12: All About Mormons", 9.0);
        Season7episodes.put("Episode 13: Butt Out", 8.1);
        Season7episodes.put("Episode 14: Raisins", 8.6);
        Season7episodes.put("Episode 15: It's Christmas in Canada", 8.1);

    List<Map.Entry<String, Double>> episodeList = new ArrayList<>(Season7episodes.entrySet());
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
        sb.append("<h1>  Season 7 Ratings</h1>");  // Title with HTML heading tag
        for (Map.Entry<String, Double> entry : sortedEpisodes.entrySet()) {
            sb.append("<li>")
                    .append(entry.getKey())
                    .append(" - Rating: ")
                    .append(entry.getValue())
                    .append("</li>");

        }
        sb.append("</ul></body></html>");


        // Create the frame
        JFrame frame = new JFrame("Season 7 Episodes Ranked ");
        JLabel label = new JLabel(sb.toString()); // No need to prepend <html> again here
        label.setFont(new Font("Arial", Font.PLAIN, 29)); // Set a font that fits well
        label.setPreferredSize(new Dimension(800, 600)); // Set a preferred size to accommodate the text


        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(label), BorderLayout.CENTER); // Add a JScrollPane for scrolling if necessary

        frame.setSize(1000, 800); // Set an appropriate size for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        PrintSeason7();
}

public void PrintSeason7() {
    Season episode1 = new Season("S7.E1 Cancelled", "The boys find out Earth is just a reality show for other planets.", 8.6);
    Season episode2 = new Season("S7.E2 Krazy Kripples", "Jimmy and Timmy start a club for handicapped people.", 8.4);
    Season episode3 = new Season("S7.E3 Toilet Paper", "The boys toilet paper their art teacher's house.", 8.4);
    Season episode4 = new Season("S7.E4 I'm a Little Bit Country", "The boys get caught up in a pro-war vs. anti-war debate.", 8.1);
    Season episode5 = new Season("S7.E5 Fat Butt and Pancake Head", "Cartman's hand puppet of Jennifer Lopez gets a recording contract.", 8.3);
    Season episode6 = new Season("S7.E6 Lil' Crime Stoppers", "The boys start their own detective agency.", 8.5);
    Season episode7 = new Season("S7.E7 Red Man's Greed", "The town of South Park is taken over by Native Americans.", 7.9);
    Season episode8 = new Season("S7.E8 South Park Is Gay", "The metrosexual craze hits South Park.", 8.7);
    Season episode9 = new Season("S7.E9 Christian Rock Hard", "Cartman starts a Christian rock band.", 8.6);
    Season episode10 = new Season("S7.E10 Grey Dawn", "The senior citizens of South Park fight to keep their driver's licenses.", 8.1);
    Season episode11 = new Season("S7.E11 Casa Bonita", "Cartman tricks Butters into thinking the world has ended so he can take his place at Kyle's birthday party.", 9.1);
    Season episode12 = new Season("S7.E12 All About Mormons", "A new kid in town introduces Stan to the Mormon faith.", 9.0);
    Season episode13 = new Season("S7.E13 Butt Out", "The boys try to get a smoking ban lifted.", 8.1);
    Season episode14 = new Season("S7.E14 Raisins", "Stan's girlfriend breaks up with him, and the boys discover a restaurant called Raisins.", 8.6);
    Season episode15 = new Season("S7.E15 It's Christmas in Canada", "The boys go to Canada to retrieve Ike, who has been taken back by his birth parents.", 8.1);
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
}
}

