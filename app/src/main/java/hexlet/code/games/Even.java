package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void evenGame() {
        //greet
        //Engine.greet();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String user = Cli.name();
        System.out.println("Hello, " + user + "!");

        //generate question and result
        Scanner scanner2 = new Scanner(System.in);
        Random random = new Random();
        int[] numbers = new int[3];
        int i = 0;
        int count = 0;

        while (i < numbers.length) {
            numbers[i] = random.nextInt(100);
            String result = (numbers[i] % 2 == 0) ? "yes" : "no";

            System.out.println("Question: " + numbers[i]);
            System.out.print("Your answer: ");
            String answer = scanner2.next();

            if (answer.equals(result)) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + answer + "'" + " is wrong answer ;(. ");
                System.out.println("Correct answer was " + "'" + result + "'.");
                System.out.println("Let's try again, " + user + "!");
                break;
            }
            i += 1;
            count += 1;
            if (count == 3) {
                System.out.println("Congratulations, " + user + "!");
            }
        }
    }
}
