package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.math3.primes.Primes;
import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void primeGame() {
        Engine.greet();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        final int maxRound = 3;
        int round = 0;

        while (round < maxRound) {
            //generate question and answer
            final int interval = 100;
            int number = random.nextInt(interval);
            String rightAnswer = Primes.isPrime(number) ? "yes" : "no";

            System.out.println("Question: " + number);
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
}
