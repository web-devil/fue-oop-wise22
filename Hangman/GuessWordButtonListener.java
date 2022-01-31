import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class GuessWordButtonListener implements ActionListener {

    public GuessWordButtonListener() {
        // label + textfield hinzufügen   
    }

    public void actionPerformed(ActionEvent arg0) {
        // textfield.getValue()
        // label.setValue()

        System.out.println("Der Button Wort RATEN wurde geclickt!");
    }
}