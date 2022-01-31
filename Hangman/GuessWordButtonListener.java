import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class GuessWordButtonListener implements ActionListener {
    private HangmanLabel label;
    private JTextField textfield;

    public GuessWordButtonListener(HangmanLabel label, JTextField textfield) {
        this.label = label;
        this.textfield = textfield;
    }

    public void actionPerformed(ActionEvent arg0) {
        label.guessCharacter(textfield.getText());
    }
}