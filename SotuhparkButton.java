package SouthPark;
import javax. swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
public class MyFrame extends JFrame implements ActionListener {
        JButton button;
        JLabel label2;
        JButton button2;
        JButton button3;
        JButton button4;
        JButton button5;
        JButton button6;
        JButton button7;
        JButton button8;
        JButton button9;
        JButton button10;
        JButton button11;
        JButton button12;
        JButton button13;
        JButton button14;
JButton button15;
JButton button16;
JButton button17;
JButton button18;
JButton button19;
JButton button20;
JButton button21;
JButton button22;
JButton button23;
JButton button24;
JButton button25;
JButton button26;


        JLabel buttonLabel;

        MyFrame() {
                // Initialize the frame
                this.setTitle("South Park Sorter");
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setResizable(false);
                this.setSize(700, 700);
                this.setLayout(null);
                this.getContentPane().setBackground(Color.yellow);

                // Load image icons
                ImageIcon Icon = new ImageIcon("C:\\Users\\smarv\\Downloads\\Season1.png");
                ImageIcon worldOfWarcraftImage = new ImageIcon("C:\\Users\\smarv\\IdeaProjects\\DailyMoneyMaker\\src\\OIP.jpg");

                // Initialize and configure label2
                label2 = new JLabel();
                label2.setText("Click to Display Season Ratings");
                label2.setIcon(worldOfWarcraftImage);
                label2.setVerticalTextPosition(JLabel.TOP);
                label2.setHorizontalTextPosition(JLabel.CENTER);
                label2.setIconTextGap(20);
                label2.setForeground(Color.black);
                label2.setFont(new Font("Times New Roman", Font.BOLD, 20));
                label2.setBorder(BorderFactory.createLineBorder(Color.red, 6));
                label2.setBounds(325, 350, 340, 400);
                this.add(label2);

                // Initialize and configure buttonLabel
                buttonLabel = new JLabel();
                buttonLabel.setIcon(Icon);
                buttonLabel.setBounds(150, 250, 150, 150);
                this.add(buttonLabel);

                buttonLabel.setIcon(Icon);
                buttonLabel.setBounds(150, 250, 150, 150);


                button = new JButton("Season 1");
                button.setBounds(290, 50, 100, 50);
                button.addActionListener(this); // Add action listener to the button
                button.setFocusable(false);
                button.setIcon(Icon);
                button.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button.setIconTextGap(-15);
                button.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button);

                button2 = new JButton("Season 2");
                button2.setBounds(400, 50, 100, 50);
                button2.addActionListener(this); // Add action listener to the button
                button2.setFocusable(false);
                button2.setIcon(Icon);
                button2.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button2.setIconTextGap(-15);
                button2.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button2);

                button3 = new JButton("Season 3");
                button3.setBounds(510, 50, 100, 50);
                button3.addActionListener(this); // Add action listener to the button
                button3.setFocusable(false);
                button3.setIcon(Icon);
                button3.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button3.setIconTextGap(-15);
                button3.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button3);

                button4 = new JButton("Season 4");
                button4.setBounds(510, 125, 100, 50);
                button4.addActionListener(this); // Add action listener to the button
                button4.setFocusable(false);
                button4.setIcon(Icon);
                button4.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button4.setIconTextGap(-15);
                button4.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button4);

              button5 = new JButton("Season 5");
                button5.setBounds(400, 125, 100, 50);
                button5.addActionListener(this); // Add action listener to the button
                button5.setFocusable(false);
                button5.setIcon(Icon);
                button5.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button5.setIconTextGap(-15);
                button5.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button5);

               button6 = new JButton("Season 6");
                button6.setBounds(290, 125, 100, 50);
                button6.addActionListener(this); // Add action listener to the button
                button6.setFocusable(false);
                button6.setIcon(Icon);
                button6.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button6.setIconTextGap(-15);
                button6.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button6);

               button7 = new JButton("Season 7");
                button7.setBounds(290, 195, 100, 50);
                button7.addActionListener(this); // Add action listener to the button
                button7.setFocusable(false);
                button7.setIcon(Icon);
                button7.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button7.setIconTextGap(-15);
                button7.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button7);

               button8 = new JButton("Season 8");
                button8.setBounds(400, 195, 100, 50);
                button8.addActionListener(this); // Add action listener to the button
                button8.setFocusable(false);
                button8.setIcon(Icon);
                button8.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button8.setIconTextGap(-15);
                button8.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button8);

                button9 = new JButton("Season 9");
                button9.setBounds(510, 195, 100, 50);
                button9.addActionListener(this); // Add action listener to the button
                button9.setFocusable(false);
                button9.setIcon(Icon);
                button9.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button9.setIconTextGap(-15);
                button9.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button9);

               button10 = new JButton("Season 10");
                button10.setBounds(290, 265, 100, 50);
                button10.addActionListener(this); // Add action listener to the button
                button10.setFocusable(false);
                button10.setIcon(Icon);
                button10.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button10.setIconTextGap(-15);
                button10.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button10);

                button11 = new JButton("Season 11");
                button11.setBounds(400, 265, 100, 50);
                button11.addActionListener(this); // Add action listener to the button
                button11.setFocusable(false);
                button11.setIcon(Icon);
                button11.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button11.setIconTextGap(-15);
                button11.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button11);

             button12 = new JButton("Season 12");
                button12.setBounds(510, 265, 100, 50);
                button12.addActionListener(this); // Add action listener to the button
                button12.setFocusable(false);
                button12.setIcon(Icon);
                button12.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button12.setIconTextGap(-15);
                button12.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button12);

                button13 = new JButton("Season 13");
                button13.setBounds(15, 290, 90, 50);
                button13.addActionListener(this); // Add action listener to the button
                button13.setFocusable(false);
                button13.setIcon(Icon);
                button13.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button13.setIconTextGap(-15);
                button13.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button13);

              button14 = new JButton("Season 14");
                button14.setBounds(125, 290, 90, 50);
                button14.addActionListener(this); // Add action listener to the button
                button14.setFocusable(false);
                button14.setIcon(Icon);
                button14.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button14.setIconTextGap(-15);
                button14.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button14);

                button15 = new JButton("Season 15");
                button15.setBounds(15, 350, 90, 50);
                button15.addActionListener(this); // Add action listener to the button
                button15.setFocusable(false);
                button15.setIcon(Icon);
                button15.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button15.setIconTextGap(-15);
                button15.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button15);

                 button16 = new JButton("Season 16");
                button16.setBounds(125, 350, 90, 50);
                button16.addActionListener(this); // Add action listener to the button
                button16.setFocusable(false);
                button16.setIcon(Icon);
                button16.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button16.setIconTextGap(-15);
                button16.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button16);

               button17 = new JButton("Season 17");
                button17.setBounds(225, 350, 90, 50);
                button17.addActionListener(this); // Add action listener to the button
                button17.setFocusable(false);
                button17.setIcon(Icon);
                button17.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button17.setIconTextGap(-15);
                button17.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button17);

                button18 = new JButton("Season 18");
                button18.setBounds(15, 410, 90, 50);
                button18.addActionListener(this);
                button18.setFocusable(false);
                button18.setIcon(Icon);
                button18.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button18.setIconTextGap(-15);
                button18.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button18);

                button19 = new JButton("Season 19");
                button19.setBounds(125, 410, 90, 50);
                button19.addActionListener(this);
                button19.setFocusable(false);
                button19.setIcon(Icon);
                button19.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button19.setIconTextGap(-15);
                button19.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button19);

                button20 = new JButton("Season 20");
                button20.setBounds(225, 410, 90, 50);
                button20.addActionListener(this);
                button20.setFocusable(false);
                button20.setIcon(Icon);
                button20.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button20.setIconTextGap(-15);
                button20.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button20);

                 button21 = new JButton("Season 21");
                button21.setBounds(15, 470, 90, 50);
                button21.addActionListener(this);
                button21.setFocusable(false);
                button21.setIcon(Icon);
                button21.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button21.setIconTextGap(-15);
                button21.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button21);

            button22 = new JButton("Season 22");
                button22.setBounds(125, 470, 90, 50);
                button22.addActionListener(this);
                button22.setFocusable(false);
                button22.setIcon(Icon);
                button22.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button22.setIconTextGap(-15);
                button22.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button22);

               button23 = new JButton("Season 23");
                button23.setBounds(225, 470, 90, 50);
                button23.addActionListener(this);
                button23.setFocusable(false);
                button23.setIcon(Icon);
                button23.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button23.setIconTextGap(-15);
                button23.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button23);

           button24 = new JButton("Season 24");
                button24.setBounds(15, 530, 90, 50);
                button24.addActionListener(this);
                button24.setFocusable(false);
                button24.setIcon(Icon);
                button24.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button24.setIconTextGap(-15);
                button24.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button24);

                 button25 = new JButton("Season 25");
                button25.setBounds(125, 530, 90, 50);
                button25.addActionListener(this);
                button25.setFocusable(false);
                button25.setIcon(Icon);
                button25.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button25.setIconTextGap(-15);
                button25.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button25);

                 button26 = new JButton("Season 26");
                button26.setBounds(225, 530, 90, 50);
                button26.addActionListener(this);
                button26.setFocusable(false);
                button26.setIcon(Icon);
                button26.setFont(new Font("Comic Sans", Font.BOLD, 12));
                button26.setIconTextGap(-15);
                button26.setBorder(BorderFactory.createEtchedBorder());
                this.getContentPane().add(button26);
                setVisible(true);


        }

        @Override
        public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button) {
                        // Handle button1
                        Season1Printer season1Window = new Season1Printer();
                } else if (e.getSource() == button2) {
                        // Handle button2
                        Season2Printer season2Window = new Season2Printer();
                } else if (e.getSource() == button3) {
                        // Handle button3
                        Season3Printer season3Window = new Season3Printer();
                } else if (e.getSource() == button4) {
                        // Handle button4
                        Season4Printer season4Window = new Season4Printer();
                } else if (e.getSource() == button5) {
                        // Handle button5
                        Season5Printer season5Window = new Season5Printer();
                }else if (e.getSource() == button6) {
                        // Handle button6
                        Season6Printer season6Window = new Season6Printer();
                } else if (e.getSource() == button7) {
                        // Handle button7
                        Season7Printer season7Window = new Season7Printer();
                } else if (e.getSource() == button8) {
                        // Handle button8
                        Season8Printer season8Window = new Season8Printer();
                } else if (e.getSource() == button9) {
                        // Handle button9
                        Season9Printer season9Window = new Season9Printer();
                } else if (e.getSource() == button10) {
                        // Handle button10
                        Season10Printer season10Window = new Season10Printer();
                } else if (e.getSource() == button11) {
                        // Handle button11
                        Season11Printer season11Window = new Season11Printer();
                } else if (e.getSource() == button12) {
                        // Handle button12
                        Season12Printer season12Window = new Season12Printer();
                } else if (e.getSource() == button13) {
                        // Handle button13
                        Season13Printer season13Window = new Season13Printer();
                } else if (e.getSource() == button14) {
                        // Handle button14
                        Season14Printer season14Window = new Season14Printer();
                } else if (e.getSource() == button15) {
                        // Handle button15
                        Season15Printer season15Window = new Season15Printer();
                } else if (e.getSource() == button16) {
                        // Handle button16
                        Season16Printer season16Window = new Season16Printer();
                } else if (e.getSource() == button17) {
                        // Handle button17
                        Season17Printer season17Window = new Season17Printer();
                } else if (e.getSource() == button18) {
                        // Handle button18
                        Season18Printer season18Window = new Season18Printer();
                } else if (e.getSource() == button19) {
                        // Handle button19
                        Season19Printer season19Window = new Season19Printer();
                } else if (e.getSource() == button20) {
                        // Handle button20
                        Season20Printer season20Window = new Season20Printer();
                } else if (e.getSource() == button21) {
                        // Handle button21
                        Season21Printer season21Window = new Season21Printer();
                } else if (e.getSource() == button22) {
                        // Handle button22
                        Season22Printer season22Window = new Season22Printer();
                } else if (e.getSource() == button23) {
                        // Handle button23
                        Season23Printer season23Window = new Season23Printer();
                } else if (e.getSource() == button24) {
                        // Handle button24
                        Season24Printer season24Window = new Season24Printer();
                } else if (e.getSource() == button25) {
                        // Handle button25
                        Season25Printer season25Window = new Season25Printer();
                } else if (e.getSource() == button26) {
                        // Handle button26
                        Season26Printer season26Window = new Season26Printer();
                }

        }
        public static void main(String[] args) {
                SwingUtilities.invokeLater(() -> new MyFrame());
        }
}

