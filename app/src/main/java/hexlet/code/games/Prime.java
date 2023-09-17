package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;
import org.apache.commons.math3.primes.Primes;

public class Prime {
    public static final int MAXROUND = 3;
    public static final int TRANSMITDATA = 2;

    public static void checkSimplicity() {

        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] roundsData = new String[MAXROUND][TRANSMITDATA];

        for (int i = 0; i < MAXROUND; i++) {

            roundsData[i] = generateRoundData();
        }
        Engine.run(description, roundsData);
    }

    private static String[] generateRoundData() {

        int number = Utils.getRandomInt(Utils.MINBOUND, Utils.MAXBOUND);

        String question = Integer.toString(number);
        String rightAnswer = Primes.isPrime(number) ? "yes" : "no";

        String[] roundData = new String[TRANSMITDATA];

        roundData[Cli.QUESTION] = "Question: " + question;
        roundData[Cli.ANSWER] = rightAnswer;

        return roundData;
    }
}
