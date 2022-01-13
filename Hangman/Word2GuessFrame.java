import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Word2GuessFrame {
    private static final int WINDOW_WIDTH = 200;
    private static final int WINDOW_HEIGHT = 200;

    private GuessingFrame guessingFrame;

    public Word2GuessFrame(GuessingFrame guessingFrame) {
        this.guessingFrame = guessingFrame;
    }

    public void draw() {
        JFrame frame = new JFrame("Hangman: Wort setzen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setLayout(new BorderLayout());  

        JLabel label = new JLabel("Bitte Wort eingeben:", SwingConstants.CENTER);
        label.setFont(new Font("Serif", Font.BOLD, 22));
        label.setOpaque(true);
        label.setPreferredSize(new Dimension(100, 80));

        JTextField wort2GuessTextfield = new JTextField();

        JButton button = new JButton("Wort festlegen");
        button.addActionListener(new ButtonActionListener(label, guessingFrame));

        frame.add(label, BorderLayout.NORTH);
        frame.add(wort2GuessTextfield, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}