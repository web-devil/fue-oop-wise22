import java.util.Scanner;

public class Spielfeld {
    private char[] fields = new char[9];
    private char currentPlayer = 'x';
    private Scanner input;

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
            
            // nested if/else vermeiden! lieber mehrere kurze ifs hintereinander
            if (!this.setField(selectedField)) {
                i--;
                continue;
            }
            
            this.print();

            if (this.hasWon()) {
                System.out.println("Spieler " + this.currentPlayer + " hat gewonnen!");
                break; // continue NICHT, aber return, i=10
            }

            this.setNextPlayer();
        }
    }

    public boolean setField(int selectedField) {
        if (this.fields[selectedField] != ' ') {
            System.out.println();
            System.out.println("Das Feld ist belegt!");
            System.out.println();
            return false; // Alternative: else
        }

        this.fields[selectedField] = this.currentPlayer;
        return true;
    }

    private void setNextPlayer() {
        // TERNARY OPERATOR = Kurzschreibweise
        // "Bedingte Zuweisung" (im Kurstext)
        this.currentPlayer = (this.currentPlayer == 'o') ? 'x' : 'o';
        /*if (this.currentPlayer == 'o') {
            this.currentPlayer = 'x';
        } else {
            this.currentPlayer = 'o';
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

    private boolean hasWon() { // char --> string TYPE CASTING
        char playerChar = this.currentPlayer;

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
