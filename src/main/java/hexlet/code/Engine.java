package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class Engine {
    public static void gameChooser() {
        final int firstGame = 2;
        final int secondGame = 3;

        Scanner chooseGame = new Scanner(System.in);
        chooseGame();
        int result = chooseGame.nextInt();

        if (result == 1) {
            System.out.println("Welcome to the Brain Games!");
            Cli.greeting();
        }

        if (result == firstGame) {
            Even.greetingsEvenGame();
        }

        if (result == secondGame) {
            Calc.greetingCalc();
        }
    }

    public static void chooseGame() {
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.println("Please enter the game number and press Enter.");
    }
}
