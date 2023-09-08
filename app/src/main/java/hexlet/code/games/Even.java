package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final int TRANSMITDATA = 2;
    public static void checkParity() {
        Engine.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        String[][] roundArr = new String[Engine.MAXROUND][TRANSMITDATA];

        //generate Arr with question and right answer
        for (int count = 0; count < Engine.MAXROUND;  count++) {
            for (int i = 0; i < Engine.MAXROUND; i++) {
                int number = Utils.getRandomInt(Utils.MINBOUND, Utils.MAXBOUND);
                roundArr[i][0] = Integer.toString(number);
                roundArr[i][1] = (number % 2 == 0) ? "yes" : "no";
            }
        }
        Engine.interact(roundArr);
    }
}
