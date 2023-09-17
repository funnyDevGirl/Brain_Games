package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final int MAXROUND = 3;
    public static final int TRANSMITDATA = 2;

    public static void checkParity() {

        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundsData = new String[MAXROUND][TRANSMITDATA];

        for (int i = 0; i < MAXROUND; i++) {

            roundsData[i] = generateRoundData();
        }
        Engine.run(description, roundsData);
    }

    private static String[] generateRoundData() {

        int number = Utils.getRandomInt(Utils.MINBOUND, Utils.MAXBOUND);

        String question = Integer.toString(number);
        String rightAnswer = (number % 2 == 0) ? "yes" : "no";

        String[] roundData = new String[TRANSMITDATA];

        roundData[Cli.QUESTION] = "Question: " + question;
        roundData[Cli.ANSWER] = rightAnswer;

        return roundData;
    }
}
