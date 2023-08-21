package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void evenGame() {
        Engine.greet();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        final int maxRound = 3;
        int round = 0;

        while (round < maxRound) {
            //generate question and answer
            int number = random.nextInt(100);
            String rightAnswer = (number % 2 == 0) ? "yes" : "no";

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
