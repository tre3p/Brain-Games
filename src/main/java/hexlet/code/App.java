package hexlet.code;

import java.util.Scanner;

public class App {
    private static final int FIRST_GAME = 2;
    private static final int SECOND_GAME = 3;
    private static final int THIRD_GAME = 4;
    private static final int FOURTH_GAME = 5;
    private static final int SIXTH_GAME = 6;
    public static void main(String[] args) {
        System.out.println("1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" + "4 - GCD\n" + "5 - Progression\n"
                           + "6 - Prime\n" + "0 - Exit\n" + "Please enter the game number and press Enter.");
        Scanner chooseGame = new Scanner(System.in);
        int result = chooseGame.nextInt();
        switch (result) {
            case 1:
                Cli.greeting();
                break;
            case FIRST_GAME:
                Cli.greeting();
                Engine.getEvenGameRules();
                Engine.evenGameEngine();
                break;
            case SECOND_GAME:
                Cli.greeting();
                Engine.getCalcGameRules();
                Engine.calcGameEngine();
                break;
            case THIRD_GAME:
                Cli.greeting();
                Engine.getGcdGameRules();
                Engine.gcdGameEngine();
                break;
            case FOURTH_GAME:
                Cli.greeting();
                Engine.getProgressionGameRules();
                Engine.progressionGameEngine();
                break;
            case SIXTH_GAME:
                Cli.greeting();
                Engine.getPrimeGameRules();
                Engine.primeGameEngine();
                break;
            default:
                break;
        }
    }
}
