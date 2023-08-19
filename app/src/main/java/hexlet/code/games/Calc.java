package hexlet.code.games;
import hexlet.code.Cli;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void calcGame() {
        //greet
        //Engine.greet();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String user = Cli.name();
        System.out.println("Hello, " + user + "!");
        //3
        System.out.println("What is the result of the expression?");

        //generate question and result
        Scanner scanner2 = new Scanner(System.in);
        Random random = new Random();
        String[] expressions = {"*", "-", "+"};
        int[][] numbers = new int[3][3];
        int i = 0;
        int j = 0;
        int count = 0;

        while (i < numbers[0].length) {
            while (j < numbers[1].length) {

                numbers[0][i] = random.nextInt(10);
                numbers[1][j] = random.nextInt(5);
                var randomExpression = expressions[random.nextInt(2)];
                System.out.println("Question: " + numbers[0][i] + " " + randomExpression + " " + numbers[1][j]);
                int result = switch (randomExpression) {
                    case "*" -> numbers[0][i] * numbers[1][j];
                    case "-" -> numbers[0][i] - numbers[1][j];
                    case "+" -> numbers[0][i] + numbers[1][j];
                    default -> 0;
                };
                System.out.print("Your answer: ");
                int answer;

                try {
                    answer = scanner2.nextInt();
                } catch (InputMismatchException h) {
                    System.out.println("Incorrect command input. Goodbye.");
                    break;
                }
                if (answer == result) {
                    System.out.println("Correct!");
                } else {
                    System.out.print("'" + answer + "'" + " is wrong answer ;(. ");
                    System.out.println("Correct answer was " + "'" + result + "'.");
                    System.out.println("Let's try again, " + user + "!");
                    break;
                }
                i += 1;
                j += 1;
                count += 1;
                if (count == 3) {
                    System.out.println("Congratulations, " + user + "!");
                }
            }
            break;
        }
    }
}
