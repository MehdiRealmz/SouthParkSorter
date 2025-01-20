package SouthPark;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.JButton;

import java.awt.*;
import java.util.Scanner;


public class SouthParkEpisodeSorter {
    public static void main(String[] args) {


        MyFrame MyFrame =new MyFrame();
        MyFrame WoWFrame =new MyFrame();
        Border border=BorderFactory.createLineBorder(Color.red,6);
        JLabel label=new JLabel();
        JLabel label2=new JLabel();


        MyFrame.add(label);
        WoWFrame.add(label2);
        ImageIcon image=new ImageIcon("C:\\Users\\smarv\\IdeaProjects\\DailyMoneyMaker\\src\\SouthPark\\SouthPark.jpg");
        label.setText(" South Park Episode " +
                "sorter");
        label.setIcon(image);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setIconTextGap(25);
        label.setForeground(Color.black);
        label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        label.setBorder(border);
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setVerticalAlignment(JLabel.TOP);
        label.setBounds(0,0,270,270);
        MyFrame.setVisible(true);







        Scanner in= new Scanner(System.in);
        System.out.println("Select South Park Season to view:  1 - 26 ");

        int UserSeason;  //Store user Input
        UserSeason=in.nextInt();

        switch(UserSeason){
            case 1:
                Season1Printer printS1 = new Season1Printer(); //printS1 to print season 1
                printS1.PrintSeason1();

                Season1Ratings ratingsS1=new Season1Ratings();
                break;
            case 2:
                Season2Printer printS2=new Season2Printer();
                printS2.PrintSeason2();
                Season2Printer ratingsS2=new Season2Printer();
                break;
            case 3:
                Season3Printer printS3=new Season3Printer();
                printS3.PrintSeason3();
                Season3Printer ratingsS3=new Season3Printer();
                break;
            case 4:
                Season4Printer printS4=new Season4Printer();
                printS4.PrintSeason4();
                Season4Printer ratingsS4=new Season4Printer();
                break;
            case 6:
                Season6Printer printS6=new Season6Printer();
                printS6.PrintSeason6();
                Season6Printer ratingsS6=new Season6Printer();
                break;
            case 7:
                Season7Printer printS7=new Season7Printer();
                printS7.PrintSeason7();
                Season7Printer ratingsS7=new Season7Printer();
                break;
            case 8:
                Season8Printer printS8=new Season8Printer();
                printS8.PrintSeason8();
                Season8Printer ratingsS8=new Season8Printer();
                break;
            case 9:
                Season9Printer printS9=new Season9Printer();
                printS9.PrintSeason9();
                Season9Printer ratingsS9=new Season9Printer();
                break;
            case 10:
                Season10Printer printS10=new Season10Printer();
                printS10.PrintSeason10();
                Season10Printer ratingsS10=new Season10Printer();
                break;
            case 11:
                Season11Printer printS11=new Season11Printer();
                printS11.PrintSeason11();
                Season11Printer ratingsS11=new Season11Printer();
                break;
            case 12:
                Season12Printer printS12=new Season12Printer();
                printS12.PrintSeason12();
                Season12Printer ratingsS12=new Season12Printer();
                break;
            case 13:
                Season13Printer printS13=new Season13Printer();
                printS13.PrintSeason13();
                Season13Printer ratingsS13=new Season13Printer();
                break;
            case 14:
                Season14Printer printS14=new Season14Printer();
                printS14.PrintSeason14();
                Season14Printer ratingsS14=new Season14Printer();
                break;
            case 15:
                Season15Printer printS15=new Season15Printer();
                printS15.PrintSeason15();
                Season15Printer ratingsS15=new Season15Printer();
                break;
            case 16:
                Season16Printer printS16=new Season16Printer();
                printS16.PrintSeason16();
                Season16Printer ratingsS16=new Season16Printer();
                break;
            case 17:
                Season17Printer printS17=new Season17Printer();
                printS17.PrintSeason17();
                Season17Printer ratingsS17=new Season17Printer();
                break;




        }


    }


}


