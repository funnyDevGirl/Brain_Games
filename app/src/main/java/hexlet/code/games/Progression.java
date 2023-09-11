package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final int MINSTEP = 2;
    public static final int MAXSTEP = 5;
    public static final int MINBOUNDFORELEMENT = 1;
    public static final int MAXBOUNDFORELEMENT = 15;
    public static final int TRANSMITDATA = 2;
    public static void formProgression() {
        Engine.greet();
        System.out.println("What number is missing in the progression?");

        String[][] roundArr = new String[Engine.MAXROUND][TRANSMITDATA];

        //generate Arr with question and right answer
        for (int count = 0; count < Engine.MAXROUND;  count++) {
            for (int i = 0; i < Engine.MAXROUND; i++) {

                int progressionLength = Utils.getRandomInt(Utils.FIRSTBOUND, Utils.LASTBOUND); //кол-во эл. в прогрессии
                int step = Utils.getRandomInt(MINSTEP, MAXSTEP); //шаг прогрессии
                int firstElement = Utils.getRandomInt(MINBOUNDFORELEMENT, MAXBOUNDFORELEMENT); //1й эл-т
                int hiddenIndex = Utils.getRandomInt(Utils.MINBOUND, progressionLength); //спрятанный эл-т

                String[] progression = makeProgression(firstElement, step, progressionLength);

                roundArr[i][1] = progression[hiddenIndex];
                progression[hiddenIndex] = "..";
                roundArr[i][0] = String.join(" ", progression);
            }
        }
        Engine.interact(roundArr);
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
