package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static final int MAXROUND = 3;
    public static final int TRANSMITDATA = 2;

    public static void findGCD() {

        String description = "Find the greatest common divisor of given numbers.";
        String[][] roundsData = new String[MAXROUND][TRANSMITDATA];

        for (int i = 0; i < MAXROUND; i++) {

            roundsData[i] = generateRoundData();
        }
        Engine.run(description, roundsData);
    }

    private static String[] generateRoundData() {

        int number1 = Utils.getRandomInt(Utils.MINBOUND, Utils.MAXBOUND);
        int number2 = Utils.getRandomInt(Utils.MINBOUND, Utils.MAXBOUND);

        String question = number1 + " " + number2;
        String rightAnswer = Integer.toString(gcd(number1, number2));

        String[] roundData = new String[TRANSMITDATA];

        roundData[Cli.QUESTION] = "Question: " + question;
        roundData[Cli.ANSWER] = rightAnswer;

        return roundData;
    }

    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
