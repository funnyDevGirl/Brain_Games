package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final int MAXROUND = 3;
    public static final int MININDEX = 0;
    public static final int MAXINDEX = 2;
    public static final String[] EXPRESSIONS = {"*", "-", "+"};
    public static final int TRANSMITDATA = 2;


    public static void evaluateExpression() {

        String description = "What is the result of the expression?";
        String[][] roundsData = new String[MAXROUND][TRANSMITDATA];

        for (int i = 0; i < MAXROUND; i++) {

            roundsData[i] = generateRoundData();
        }
        Engine.run(description, roundsData);
    }

    private static String[] generateRoundData() {

        int number1 = Utils.getRandomInt(Utils.MINBOUND, Utils.FIRSTBOUND);
        int number2 = Utils.getRandomInt(Utils.MINBOUND, Utils.LASTBOUND);

        var randomExpression = EXPRESSIONS[Utils.getRandomInt(MININDEX, MAXINDEX)];

        String question = number1 + " " + randomExpression + " " + number2;
        String rightAnswer = generateAnswer(randomExpression, number1, number2);

        String[] roundData = new String[TRANSMITDATA];

        roundData[Cli.QUESTION] = "Question: " + question;
        roundData[Cli.ANSWER] = rightAnswer;

        return roundData;
    }

    private static String generateAnswer(String randomExpression, int number1, int number2) {
        int result = switch (randomExpression) {
            case "*" -> number1 * number2;
            case "-" -> number1 - number2;
            case "+" -> number1 + number2;
            default -> throw new RuntimeException("Условие не выполняется, пожалуйста, проверьте исходные данные.");
        };
        return Integer.toString(result);
    }
}
