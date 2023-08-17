package hexlet.code;
import java.util.Scanner;

public class Games {
    public static String greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String user = Cli.name();
        return ("Hello, " + user + "!");
    }
    public static void evenGame() {
        String[][] volumes = {{"15", "50", "33"}, {"no", "yes", "no"}};
        var userName = Cli.name();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        System.out.println("Your answer: ");
        Scanner scanner1 = new Scanner(System.in);
        var count = 0;

        for (var i : volumes[0]) {
            for (var j : volumes[1]) {
                System.out.println("Question: " + i);
                String answer = scanner1.next();
                if (answer.equals(j)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + userName + "!");
                    break;
                }
                count++;
                if (count == 2) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            }
        }
    }
}
