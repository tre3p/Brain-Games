package hexlet.code;

import hexlet.code.games.Progression;
import hexlet.code.games.Gcd;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class Engine {
    public static void gameChooser() {
        final int firstGame = 2;
        final int secondGame = 3;
        final int thirdGame = 4;
        final int fourthGame = 5;
        final int sixthGame = 6;

        System.out.println("Please enter the game number and press Enter.");
        Scanner chooseGame = new Scanner(System.in);
        chooseGame();
        int result = chooseGame.nextInt();

        if (result == 1) {
            System.out.println("Welcome to the Brain Games!");
            Cli.greeting();
        } else if (result == firstGame) {
            Even.greetingsEvenGame();
        } else if (result == secondGame) {
            Calc.greetingCalc();
        } else if (result == thirdGame) {
            Gcd.greetingGcd();
        } else if (result == fourthGame) {
            Progression.greetingProgression();
        } else if (result == sixthGame) {
            Prime.greetingsPrime();
        }
    }

    public static void chooseGame() {
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.println("Please enter the game number and press Enter.");
    }
}
