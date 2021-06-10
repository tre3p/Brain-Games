package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        Cli.greeting();
        Scanner chooseGame = new Scanner(System.in);
        chooseGame();
        int result = chooseGame.nextInt();

        if (result == 1) {
            System.out.println("Welcome to the Brain Games!");
            Cli.greeting();
        }

        if (result == 2) {
            Even.greetingsEvenGame();
        }
  }

    public static void chooseGame() {
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.println("Please enter the game number and press Enter.");
    }
}
