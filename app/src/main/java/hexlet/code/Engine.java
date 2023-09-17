package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void run(String description, String[][] roundsData) {

        Scanner scanner = new Scanner(System.in);

        Cli.greet();

        System.out.println(description);

        for (String[] roundData : roundsData) {

            Cli.askQuestion(roundData);

            String userAnswer = scanner.next();
            String rightAnswer = Cli.getRightAnswer(roundData);

            if (!userAnswer.equalsIgnoreCase(rightAnswer)) {

                System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + rightAnswer + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
}
