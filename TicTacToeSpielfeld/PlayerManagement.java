import java.util.Scanner;

public class PlayerManagement {
    private String player1Name = "Player 1";
    private String player2Name = "Player 2";
    private Scanner input;

    public PlayerManagement(Scanner scanner) {
        this.input = scanner;
    }

    public void changeName(int playerId) {
        System.out.println("Player " + playerId + " Namen eingeben:");
        System.out.println("============================");
        System.out.println("Bisheriger Name: " + (playerId == 1 ? player1Name: player2Name));
        System.out.println("Neuer Name:");
        String newName = input.next();

        if (playerId == 1) {
            this.player1Name = newName;
        } else {
            this.player2Name = newName;
        }

        System.out.println();
        System.out.println("Der Name von Player " + playerId + " wurde in " + newName + " geändert!");
        System.out.println();
    }

    public String getPlayer1Name() {
        return this.player1Name;
    }

    public String getPlayer2Name() {
        return this.player2Name;
    }
}
