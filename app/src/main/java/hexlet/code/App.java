package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        String[] points = {"0", "1", "2", "3", "4", "5", "6"};
        System.out.println(points[1] + " - Greet");
        System.out.println(points[2] + " - Even");
        System.out.println(points[3] + " - Calc");
        System.out.println(points[4] + " - GCD");
        System.out.println(points[5] + " - Progression");
        System.out.println(points[6] + " - Prime");
        System.out.println(points[0] + " - Exit");
        System.out.println("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

        if (choice.equals(points[1])) {
            System.out.println(Games.greet());

        } else if (choice.equals(points[2])) {
            System.out.println(Games.greet());
            Games.evenGame();

        } else {
            System.out.println("Incorrect command input. Goodbye.");
        }
    }
}
