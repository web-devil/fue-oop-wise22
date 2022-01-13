public class Main {
    public static void main(String[] args) {
        GuessingFrame guessingFrame = new GuessingFrame();
        Word2GuessFrame word2GuessFrame = new Word2GuessFrame(guessingFrame);

        guessingFrame.draw();
        word2GuessFrame.draw();
    }
}
