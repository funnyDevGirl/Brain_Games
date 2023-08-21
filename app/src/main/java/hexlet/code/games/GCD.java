package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void gcdGame() {
        Engine.greet();

        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        final int maxRound = 3;
        int round = 0;

        while (round < maxRound) {
            //generate question and result
            int interval = 100;
            int number1 = random.nextInt(interval);
            int number2 = random.nextInt(interval);
            String rightAnswer = Integer.toString(gcd(number1, number2));

            System.out.println("Question: " + number1 + " " + number2);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            //checking result
            if (Engine.checkingAnswer(userAnswer.equals(rightAnswer), rightAnswer, userAnswer)) {
                break;
            }
            round += 1;
            Engine.congratulations(round == maxRound);
        }
    }

    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
