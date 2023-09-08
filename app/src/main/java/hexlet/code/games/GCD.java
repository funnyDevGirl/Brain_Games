package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static final int TRANSMITDATA = 2;
    public static void findGCD() {
        Engine.greet();
        System.out.println("Find the greatest common divisor of given numbers.");

        String[][] roundArr = new String[Engine.MAXROUND][TRANSMITDATA];

        //generate Arr with question and right answer
        for (int count = 0; count < Engine.MAXROUND;  count++) {
            for (int i = 0; i < Engine.MAXROUND; i++) {
                int number1 = Utils.getRandomInt(Utils.MINBOUND, Utils.MAXBOUND);
                int number2 = Utils.getRandomInt(Utils.MINBOUND, Utils.MAXBOUND);

                roundArr[i][0] = number1 + " " + number2;
                roundArr[i][1] = Integer.toString(gcd(number1, number2));
            }
        }
        Engine.interact(roundArr);
    }

    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
