import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ButtonActionListener implements ActionListener {
    private JLabel label;

    public ButtonActionListener(JLabel changeableLabel) {
        this.label = changeableLabel;
    }

    public void actionPerformed(ActionEvent arg0) {
        if (this.label.getText().equals("Hello World!")) {
            this.label.setText("changed!");
        } else {
            this.label.setText("Hello World!");
        }
    }
}