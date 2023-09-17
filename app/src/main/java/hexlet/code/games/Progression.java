package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final int MAXROUND = 3;
    public static final int MINSTEP = 2;
    public static final int MAXSTEP = 5;
    public static final int MINBOUNDFORELEMENT = 1;
    public static final int MAXBOUNDFORELEMENT = 15;
    public static final int TRANSMITDATA = 2;

    public static void formProgression() {

        String description = "What number is missing in the progression?";
        String[][] roundsData = new String[MAXROUND][TRANSMITDATA];

        for (int i = 0; i < MAXROUND; i++) {

            roundsData[i] = generateRoundData();
        }
        Engine.run(description, roundsData);
    }

    private static String[] generateRoundData() {

        int progressionLength = Utils.getRandomInt(Utils.FIRSTBOUND, Utils.LASTBOUND); //кол-во эл. в прогрессии
        int step = Utils.getRandomInt(MINSTEP, MAXSTEP); //шаг прогрессии
        int firstElement = Utils.getRandomInt(MINBOUNDFORELEMENT, MAXBOUNDFORELEMENT); //1й эл-т
        int hiddenIndex = Utils.getRandomInt(Utils.MINBOUND, progressionLength); //спрятанный эл-т

        String[] progression = makeProgression(firstElement, step, progressionLength);

        String[] roundData = new String[TRANSMITDATA];

        String rightAnswer = progression[hiddenIndex];

        progression[hiddenIndex] = "..";

        String question = String.join(" ", progression);

        roundData[Cli.QUESTION] = "Question: " + question;
        roundData[Cli.ANSWER] = rightAnswer;

        return roundData;
    }

    public static String[] makeProgression(int firstElement, int step, int progressionLength) {

        String[] progression = new String[progressionLength];
        for (int j = 0; j < progressionLength; j++) {
            progression[j] = Integer.toString(firstElement);
            firstElement = firstElement + step;
        }
        return progression;
    }
}
