package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

import static hexlet.code.Utils.gcd;

public class GCD {
    public static final int MINBOUND = 1;
    public static final int MAXBOUND = 100;
    static Random random = new Random();
    public static void gcdGame() {
        Engine.greet();
        System.out.println("Find the greatest common divisor of given numbers.");

        final int maxCount = 3;
        final int field = 2;

        int count = 0;
        String[][] roundArr = new String[maxCount][field];

        //generate Arr with question and right answer
        while (count < maxCount) {
            for (int i = 0; i < maxCount; i++) {
                int number1 = random.nextInt(MINBOUND, MAXBOUND);
                int number2 = random.nextInt(MINBOUND, MAXBOUND);

                roundArr[i][0] = number1 + " " + number2;
                roundArr[i][1] = Integer.toString(gcd(number1, number2));
            }
            count += 1;
        }
        Engine.userInteraction(roundArr);
    }
}
