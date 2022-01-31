import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class HangmanLabel extends JLabel {
    private String word2Guess;

    public HangmanLabel() {
        super("noch kein Wort\nzum Raten gesetzt", SwingConstants.CENTER);
    }

    public void setText(String text) {
        this.word2Guess = text;

        String newLabelValue = "";

        for (int i = 1; i <= text.length(); i++) {
            newLabelValue += "_ ";
        }

        super.setText(newLabelValue);
    }

    public void guessCharacter(String text) {
        String newLabelValue = "";

        for (int i = 0; i < word2Guess.length(); i++) {
            if (word2Guess.charAt(i) == text.charAt(0)) {
                newLabelValue += text.charAt(0) + " ";
            } else {
                newLabelValue += this.getText().charAt(i*2) + this.getText().charAt(i*2+1);
            }
        }

        super.setText(newLabelValue);
    }
}
