package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String user = Cli.name();
        System.out.println("Hello, " + user + "!");
    }

    public static void userInteraction(String[][] roundArr) {
        Scanner scanner = new Scanner(System.in);

        final int maxRound = 3;

        int round = 0;

        while (round < maxRound) {
            System.out.println("Question: " + roundArr[round][0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (Engine.checkingAnswer(userAnswer.equals(roundArr[round][1]), roundArr[round][1], userAnswer)) {
                break;
            }
            round += 1;
            Engine.congratulations(round == maxRound);
        }
    }

    public static boolean checkingAnswer(boolean condition, Object rightAnswer, Object userAnswer) {

        if (condition) {
            System.out.println("Correct!");
        } else {
            System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
            System.out.println("Correct answer was '" + rightAnswer + "'.");
            System.out.println("Let's try again, " + Cli.getName() + "!");
            return true;
        }
        return false;
    }

    public static void congratulations(boolean condition) {
        if (condition) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
}
