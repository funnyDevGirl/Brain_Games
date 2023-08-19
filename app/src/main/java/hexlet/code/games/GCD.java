package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Utils;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void gcdGame() {
        //greet
        //Engine.greet();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String user = Cli.name();
        System.out.println("Hello, " + user + "!");
        //4
        System.out.println("Find the greatest common divisor of given numbers.");

        //generate question and result
        Scanner scanner2 = new Scanner(System.in);
        Random random = new Random();
        int[][] numbers = new int[3][3];
        int i = 0;
        int j = 0;
        int count = 0;

        while (i < numbers[0].length) {
            while (j < numbers[1].length) {

                numbers[0][i] = random.nextInt(100);
                numbers[1][j] = random.nextInt(100);

                System.out.println("Question: " + numbers[0][i] + " " + numbers[1][j]);
                int result = Utils.gcd(numbers[0][i], numbers[1][j]);

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
