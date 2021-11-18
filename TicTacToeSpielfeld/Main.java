import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Willkommen bei TicTacToe");
        System.out.println();

        Scanner input = new Scanner(System.in);
        Spielfeld spielfeld = new Spielfeld(input);
        spielfeld.play();

        System.out.println("Goodbye!");
        System.out.println();
    }
}