import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Spielfeld spielfeld = new Spielfeld(input);
        Menue menu = new Menue(input, spielfeld);
        menu.run();    
    }
}