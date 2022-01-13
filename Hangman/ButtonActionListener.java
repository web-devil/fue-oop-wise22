import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ButtonActionListener implements ActionListener {
    private JLabel label;
    private GuessingFrame guessingFrame;

    public ButtonActionListener(JLabel changeableLabel, GuessingFrame guessingFrame) {
        this.label = changeableLabel;
        this.guessingFrame = guessingFrame;
    }

    public void actionPerformed(ActionEvent arg0) {
        this.guessingFrame.setWord2Guess(
            this.label.getText()
        );
    }
}