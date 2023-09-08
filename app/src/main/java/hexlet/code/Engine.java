package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAXROUND = 3;
    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String user = Cli.name();
        System.out.println("Hello, " + user + "!");
    }

    public static void interact(String[][] roundArr) {
        Scanner scanner = new Scanner(System.in);

        for (int round = 0; round < MAXROUND; round++) {
            System.out.println("Question: " + roundArr[round][0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (Engine.checkAnswer(userAnswer.equals(roundArr[round][1]), roundArr[round][1], userAnswer)) {
                break;
            }
            if (round == (MAXROUND - 1)) {
                System.out.println("Congratulations, " + Cli.getName() + "!");
            }

        }
    }

    public static boolean checkAnswer(boolean condition, Object rightAnswer, Object userAnswer) {

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
}
