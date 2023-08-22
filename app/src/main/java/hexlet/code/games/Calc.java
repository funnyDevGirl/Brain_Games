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
            final int firstBound = 5;
            final int lastBound =  10;

            int number1 = random.nextInt(firstBound);
            int number2 = random.nextInt(lastBound);

            final int index = 2; //индекс элемента, который будет исключен

            var randomExpression = expressions[random.nextInt(index)];
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
