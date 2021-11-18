import java.util.Scanner;

class Menue {
    private Scanner scanner;
    private Spielfeld spielfeld;
    private PlayerManagement playerManagement;

    public Menue(Scanner scanner, Spielfeld spielfeld, PlayerManagement playerManagement) {
        this.scanner = scanner;
        this.spielfeld = spielfeld;
        this.playerManagement = playerManagement;
    }

    public void run() {
        System.out.println();
        System.out.println("Willkommen bei TicTacToe");
        System.out.println();

        while(true) {
            this.print();
            int menuItem = this.scanner.nextInt();

            switch (menuItem) {
                case 1:
                   this.spielfeld.play(); 
                   break; 
                case 2:
                    this.playerManagement.changeName(1);
                    break;
                case 3: 
                    this.playerManagement.changeName(2);
                    break;
                case 9:
                    System.out.println();    
                    System.out.println("Goodbye!");
                    System.out.println();
                    return;
            }
        }
    }

    private void print() {
        System.out.println("Herzlich Willkommen zu TicTacToe!");
        System.out.println();
        System.out.println("-   Neues Spiel starten (1)");
        System.out.println("-   Player 1 Namen eingeben (2)");
        System.out.println("-   Player 2 Namen eingeben (3)");
        System.out.println("-   Scoreboard anzeigen (4)");
        System.out.println("-   Programm verlassen (9)");
        System.out.println();
    }
}
