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


public class GuessingFrame {
    private static final int WINDOW_WIDTH = 200;
    private static final int WINDOW_HEIGHT = 200;

    private HangmanLabel label;
    
    public GuessingFrame() {
        this.label = new HangmanLabel();
    }

    public void draw() {
        JFrame frame = new JFrame("Hangman: Raten");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setLayout(new BorderLayout());  

        label.setFont(new Font("Serif", Font.BOLD, 22));
        label.setOpaque(true);
        label.setPreferredSize(new Dimension(100, 80));

        JTextField wort2GuessTextfield = new JTextField();

        JButton button = new JButton("Wort RATEN");
        button.addActionListener(new GuessWordButtonListener(label, wort2GuessTextfield));

        frame.add(label, BorderLayout.NORTH);
        frame.add(wort2GuessTextfield, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void setWord2Guess(String word) {
        this.label.setText(word);
    }
}