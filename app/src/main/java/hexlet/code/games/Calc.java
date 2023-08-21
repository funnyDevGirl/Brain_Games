package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void calcGame() {
        Engine.greet();

        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        final int maxRound = 3;
        int round = 0;
        String[] expressions = {"*", "-", "+"};

        while (round < maxRound) {
            //generate question and answer
            int number1 = random.nextInt(10);
            int number2 = random.nextInt(5);
            var randomExpression = expressions[random.nextInt(2)];
            String rightAnswer = switch (randomExpression) {
                case "*" -> Integer.toString(number1 * number2);
                case "-" -> Integer.toString(number1 - number2);
                case "+" -> Integer.toString(number1 + number2);
                default -> Integer.toString(0);
            };
            System.out.println("Question: " + number1 + " " + randomExpression + " " + number2);
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
