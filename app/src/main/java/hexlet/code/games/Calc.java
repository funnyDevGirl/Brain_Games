package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    //интервал для выборки элемента, который будет исключен (от 0 до 2)
    public static final int MININDEX = 0;
    public static final int MAXINDEX = 2;
    public static final String[] EXPRESSIONS = {"*", "-", "+"};
    public static final int TRANSMITDATA = 2;
    public static void evaluateExpression() {
        Engine.greet();

        System.out.println("What is the result of the expression?");

        String[][] roundArr = new String[Engine.MAXROUND][TRANSMITDATA];

        //generate Arr with question and right answer
        for (int count = 0; count < Engine.MAXROUND;  count++) {
            for (int i = 0; i < Engine.MAXROUND; i++) {
                int number1 = Utils.getRandomInt(Utils.MINBOUND, Utils.FIRSTBOUND);
                int number2 = Utils.getRandomInt(Utils.MINBOUND, Utils.LASTBOUND);

                var randomExpression = EXPRESSIONS[Utils.getRandomInt(MININDEX, MAXINDEX)];

                roundArr[i][0] = number1 + " " + randomExpression + " " + number2;
                roundArr[i][1] = pickUp(randomExpression, number1, number2);
            }
        }
        Engine.interact(roundArr);
    }

    public static String pickUp(String randomExpression, int number1, int number2) {
        int result = switch (randomExpression) {
            case "*" -> number1 * number2;
            case "-" -> number1 - number2;
            case "+" -> number1 + number2;
            default -> {
                try {
                    throw new Exception("Условие не выполняется, пожалуйста, проверьте исходные данные.");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        };
        return Integer.toString(result);
    }
}
