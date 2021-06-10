package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner getName = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = getName.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
