package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Progression;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" + "4 - GCD\n" + "5 - Progression\n"
                           + "6 - Prime\n" + "0 - Exit\n" + "Please enter the game number and press Enter.");
        Scanner chooseGame = new Scanner(System.in);
        String result = chooseGame.nextLine();
        switch (result) {
            case "1":
                Engine.greeting();
                break;
            case "2":
                Even.launchEvenGame();
                break;
            case "3":
                Calc.launchCalcGame();
                break;
            case "4":
                Gcd.launchGcdGame();
                break;
            case "5":
                Progression.launchProgressionGame();
                break;
            case "6":
                Prime.launchPrimeGame();
                break;
            default:
                break;
        }
    }
}
