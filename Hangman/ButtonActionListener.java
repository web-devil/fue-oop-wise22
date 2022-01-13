import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ButtonActionListener implements ActionListener {
    private JTextField textfield;
    private GuessingFrame guessingFrame;

    public ButtonActionListener(JTextField textfield, GuessingFrame guessingFrame) {
        this.textfield = textfield;
        this.guessingFrame = guessingFrame;
    }

    public void actionPerformed(ActionEvent arg0) {
        this.guessingFrame.setWord2Guess(
            this.textfield.getText()
        );
    }
}