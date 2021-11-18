import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PlayerManagement playerManagement = new PlayerManagement(input);
        Spielfeld spielfeld = new Spielfeld(input, playerManagement);
        Menue menu = new Menue(input, spielfeld, playerManagement);
        menu.run();    
    }
}