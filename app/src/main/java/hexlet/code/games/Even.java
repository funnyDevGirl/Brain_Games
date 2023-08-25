package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static final int BOUND = 100;
    static Random random = new Random();
    public static void evenGame() {
        Engine.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        final int maxCount = 3;
        final int field = 2;

        int count = 0;
        String[][] roundArr = new String[maxCount][field];

        //generate Arr with question and right answer
        while (count < maxCount) {
            for (int i = 0; i < maxCount; i++) {
                int number = random.nextInt(BOUND);
                roundArr[i][0] = Integer.toString(number);
                roundArr[i][1] = (number % 2 == 0) ? "yes" : "no";
            }
            count += 1;
        }
        Engine.userInteraction(roundArr);
    }
}
