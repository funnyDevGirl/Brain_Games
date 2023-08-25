package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.math3.primes.Primes;
import java.util.Random;

public class Prime {
    public static final int BOUND = 100;
    public static void primeGame() {
        Engine.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        final int maxCount = 3;
        final int field = 2;

        int count = 0;
        Random random = new Random();
        String[][] roundArr = new String[maxCount][field];

        //generate Arr with question and right answer
        while (count < maxCount) {
            for (int i = 0; i < maxCount; i++) {
                int number = random.nextInt(BOUND);
                roundArr[i][0] = Integer.toString(number);
                roundArr[i][1] = Primes.isPrime(number) ? "yes" : "no";
            }
            count += 1;
        }
        Engine.userInteraction(roundArr);
    }
}
