import java.util.Scanner;

public class Spielfeld {
    char[] fields = new char[9];
    char nextPlayer = 'x';
    Scanner input;

    // Variablennamen dienen NUR der Lesbarkeit!
    // (Sind aber deswegen umso wichtiger)
    Spielfeld(Scanner erhuifheriuhbirew) {
        this.input = erhuifheriuhbirew;

        for(int i = 0; i <= 8; i++) {
            this.fields[i] = ' ';
        }
    }

    public void play() {
        for(int i = 1; i <= 9; i++) {
            System.out.println("Welches Feld soll's denn sein?");
            int selectedField = this.input.nextInt() - 1;
            char currentPlayer = this.nextPlayer;
            
            if (!this.setField(selectedField, currentPlayer)) {
                i--;
            }
            
            if (this.hasWon(currentPlayer)) {
                System.out.println("Spieler " + currentPlayer + " hat gewonnen!");
                break; // continue NICHT, aber return, i=10
            }
            
            this.setNextPlayer();
            this.print();
        }
    }

    public boolean setField(int selectedField, char currentPlayer) {
        if (this.fields[selectedField] != ' ') {
            System.out.println();
            System.out.println("Das Feld ist belegt!");
            System.out.println();
            return false; // Alternative: else
        }

        this.fields[selectedField] = currentPlayer;
        return true;
    }

    private void setNextPlayer() {
        // TERNARY OPERATOR = Kurzschreibweise
        // "Bedingte Zuweisung" (im Kurstext)
        this.nextPlayer = (this.nextPlayer == 'o') ? 'x' : 'o';
        /*if (this.nextPlayer == 'o') {
            this.nextPlayer = 'x';
        } else {
            this.nextPlayer = 'o';
        }*/
    }

    public void print() {
        System.out.println(" " + this.fields[0] + " | " + this.fields[1] + " | " + this.fields[2]);
        System.out.println("---+---+---");
        System.out.println(" " + this.fields[3] + " | " + this.fields[4] + " | " + this.fields[5]);
        System.out.println("---+---+---");
        System.out.println(" " + this.fields[6] + " | " + this.fields[7] + " | " + this.fields[8]);
        System.out.println();
    }

    private boolean hasWon(String playerChar) {
        return (this.fields[0] == playerChar && this.fields[1] == playerChar && this.fields[2] == playerChar)
            || (this.fields[3] == playerChar && this.fields[4] == playerChar && this.fields[5] == playerChar)
            || (this.fields[6] == playerChar && this.fields[7] == playerChar && this.fields[8] == playerChar)
            || (this.fields[0] == playerChar && this.fields[3] == playerChar && this.fields[6] == playerChar)
            || (this.fields[1] == playerChar && this.fields[4] == playerChar && this.fields[7] == playerChar)
            || (this.fields[2] == playerChar && this.fields[5] == playerChar && this.fields[8] == playerChar)
            || (this.fields[0] == playerChar && this.fields[4] == playerChar && this.fields[8] == playerChar)
            || (this.fields[2] == playerChar && this.fields[4] == playerChar && this.fields[6] == playerChar);
    }
}
