package SouthPark;
import java.util.*;
import java.util.List;


import javax.swing.*;
import java.awt.*;
public class Season2Printer {

    JFrame frame= new JFrame("Season 2 Ratings");


    JTextArea textArea = new JTextArea();
    JScrollPane scrollPane = new JScrollPane(textArea);

    public Season2Printer() {
        HashMap<String, Double> Season2episodes = new HashMap<String, Double>();
        Season2episodes.put("Episode 1: Terrance and Phillip in Not Without My Anus", 6.2);
        Season2episodes.put("Episode 2: Cartman's Mom is Still a Dirty Slut", 8.2);
        Season2episodes.put("Episode 3: Chickenlover", 8.0);
        Season2episodes.put("Episode 4: Ike's Wee Wee", 8.0);
        Season2episodes.put("Episode 5: Conjoined Fetus Lady", 7.6);
        Season2episodes.put("Episode 6: The Mexican Staring Frog of Southern Sri Lanka", 7.5);
        Season2episodes.put("Episode 7: City on the Edge of Forever", 7.3);
        Season2episodes.put("Episode 8: Summer Sucks", 7.4);
        Season2episodes.put("Episode 9: Chef's Chocolate Salty Balls", 7.5);
        Season2episodes.put("Episode 10: Chickenpox", 7.9);
        Season2episodes.put("Episode 11: Roger Ebert Should Lay Off the Fatty Foods", 7.5);
        Season2episodes.put("Episode 12: Clubhouses", 7.9);
        Season2episodes.put("Episode 13: Cow Days", 7.5);
        Season2episodes.put("Episode 14: Chef Aid", 7.8);
        Season2episodes.put("Episode 15: Spookyfish", 8.4);
        Season2episodes.put("Episode 16: Merry Christmas Charlie Manson!", 8.1);
        Season2episodes.put("Episode 17: Gnomes", 8.3);
        Season2episodes.put("Episode 18: Prehistoric Ice Man", 7.8);

        List<Map.Entry<String, Double>> episodeList = new ArrayList<>(Season2episodes.entrySet());
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
        sb.append("<h1>  Season 2 Ratings</h1>");  // Title with HTML heading tag
        for (Map.Entry<String, Double> entry : sortedEpisodes.entrySet()) {
            sb.append("<li>")
                    .append(entry.getKey())
                    .append(" - Rating: ")
                    .append(entry.getValue())
                    .append("</li>");

        }
        sb.append("</ul></body></html>");


        // Create the frame
        JFrame frame = new JFrame("Season 2 Episodes Ranked ");
        JLabel label = new JLabel(sb.toString()); // No need to prepend <html> again here
        label.setFont(new Font("Arial", Font.PLAIN, 29)); // Set a font that fits well
        label.setPreferredSize(new Dimension(800, 600)); // Set a preferred size to accommodate the text


        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(label), BorderLayout.CENTER); // Add a JScrollPane for scrolling if necessary

        frame.setSize(1000, 800); // Set an appropriate size for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        PrintSeason2();

    }
    public void PrintSeason2() {


        Season episode1 = new Season("S2.E1 Terrance and Phillip in Not Without My Anus",
                "Terrance and Phillip must go to Iran to rescue Terrance's kidnapped daughter. Meanwhile Saddam Hussein takes over Canada.", 6.2);
        Season episode2 = new Season("S2.E2 Cartman's Mom is Still a Dirty Slut",
                "The boys get snowed in at the hospital while waiting to learn the identity of Cartman's father. Meanwhile, the townspeople resort to cannibalism when they get snowed in.", 8.2);
        Season episode3 = new Season("S2.E3 Chickenlover",
                "Mr. Barbrady goes back to school after it is discovered that he is illiterate. As he learns to read, a criminal is on the loose molesting all the chickens in South Park.", 8.0);
        Season episode4 = new Season("S2.E4 Ike's Wee Wee",
                "Mr. Mackey is fired from school after losing a marijuana sample in class and winds up becoming a druggie, and Kyle tries to keep his brother Ike from having his bris after he finds out what will take place during the ceremony.", 8.0);
        Season episode5 = new Season("S2.E5 Conjoined Fetus Lady",
                "The people of South Park attempt to raise awareness of the school nurse's disability. Meanwhile, the boys travel to China to compete in a dodge ball championship.", 7.6);
        Season episode6 = new Season("S2.E6 The Mexican Staring Frog of Southern Sri Lanka",
                "The kids get revenge on Jimbo and Ned after they fail their report on Vietnam. However, their practical joke sparks a fierce ratings war between 'Jesus and Pals' and Jimbo and Ned's hunting program.", 7.5);
        Season episode7 = new Season("S2.E7 City on the Edge of Forever",
                "As their school bus teeters over the edge of a cliff, the boys recall past memories.", 7.3);
        Season episode8 = new Season("S2.E8 Summer Sucks",
                "Summer at South park is not going well: fireworks are banned, and a giant ash snake is ravaging the countryside.", 7.4);
        Season episode9 = new Season("S2.E9 Chef's Chocolate Salty Balls",
                "Hollywood big-shots try to turn South Park into another Sundance. However, they wreak havoc on the town's eco-system, which could cause Mr. Hankey to die.", 7.5);
        Season episode10 = new Season("S2.E10 Chickenpox",
                "The boys get angry and seek revenge when they discover that their parents orchestrated a sleepover at Kenny's house so they could all get chickenpox.", 7.9);
        Season episode11 = new Season("S2.E11 Roger Ebert Should Lay Off the Fatty Foods",
                "The boys investigate a mysterious conspiracy centered around the South Park Planetarium. Meanwhile, Cartman auditions for a TV commercial.", 7.5);
        Season episode12 = new Season("S2.E12 Clubhouses",
                "Stan builds a clubhouse so he can play truth or dare with Wendy. Meanwhile, he deals with his parents' unexpected divorce.", 7.9);
        Season episode13 = new Season("S2.E13 Cow Days",
                "All of South Park's cows become mesmerized by the town's new Wooden Cow Memorial. Meanwhile, the kids' plan to win a Terence and Philip doll from a carney at the Cow Days festival becomes complicated and dangerous.", 7.5);
        Season episode14 = new Season("S2.E14 Chef Aid",
                "The boys organize a music festival to raise money when Chef is sued by a record company.", 7.8);
        Season episode15 = new Season("S2.E15 Spookyfish",
                "Stan thinks his new pet fish is evil after it kills two people in his bedroom. Also, the parallel-universe version of Cartman shows up in South Park, and everyone likes him more than the real Cartman.", 8.4);
        Season episode16 = new Season("S2.E16 Merry Christmas Charlie Manson!",
                "Stan, Kyle and Kenny go to Nebraska to spend Christmas with Eric's family. Meanwhile, Charlie Manson escapes from prison with Eric's uncle, and the boys help teach him the true meaning of Christmas.", 8.1);
        Season episode17 = new Season("S2.E17 Gnomes",
                "A school assignment pairs the boys up with Tweek, a neurotic boy who claims that gnomes are stealing his underwear. Meanwhile, Tweek's father fights against a corporation that is stealing his business.", 8.3);
        Season episode18 = new Season("S2.E18 Prehistoric Ice Man",
                "Kyle and Stan fight over what to name a man they found frozen in ice from 1996. Meanwhile, the government attempts to steal the frozen man.", 7.8);
        // Print episodes
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
        System.out.println(episode18);

    }



        }


