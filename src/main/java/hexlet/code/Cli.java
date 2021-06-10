package hexlet.code;
import java.util.Scanner;

public class Cli {
    private static String name;

    public static void greeting() {
        Scanner getName = new Scanner(System.in);
        System.out.println("May I have your name?");
        name = getName.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static String getName() {
        return name;
    }
}
