package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;


public class Calc {
    public static final int FIRSTBOUND = 5;
    public static final int LASTBOUND = 10;
    public static final int INDEX = 2; //индекс элемента, который будет исключен
    public static final String[] EXPRESSIONS = {"*", "-", "+"};
    static Random random = new Random();
    public static void calcGame() {
        Engine.greet();

        System.out.println("What is the result of the expression?");

        final int maxCount = 3;
        final int field = 2;

        int count = 0;
        String[][] roundArr = new String[maxCount][field];

        //generate Arr with question and right answer
        while (count < maxCount) {
            for (int i = 0; i < maxCount; i++) {
                int number1 = random.nextInt(FIRSTBOUND);
                int number2 = random.nextInt(LASTBOUND);

                var randomExpression = EXPRESSIONS[random.nextInt(INDEX)];

                roundArr[i][0] = number1 + " " + randomExpression + " " + number2;
                roundArr[i][1] = expression(randomExpression, number1, number2);
            }
            count += 1;
        }
        Engine.userInteraction(roundArr);
    }

    public static String expression(String randomExpression, int number1, int number2) {
        int result = switch (randomExpression) {
            case "*" -> number1 * number2;
            case "-" -> number1 - number2;
            case "+" -> number1 + number2;
            default -> 0;
        };
        return Integer.toString(result);
    }
}
