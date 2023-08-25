package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    public static final int MINBOUND = 5;
    public static final int MAXBOUND = 10;
    public static final int MINSTEP = 2;
    public static final int MAXSTEP = 5;
    public static final int MINBOUNDFORELEMENT = 1;
    public static final int MAXBOUNDFORELEMENT = 15;
    public static void progressionGame() {
        Engine.greet();
        System.out.println("What number is missing in the progression?");

        final int maxCount = 3;
        final int field = 2;

        int count = 0;
        Random random = new Random();
        String[][] roundArr = new String[maxCount][field];

        //generate Arr with question and right answer
        while (count < maxCount) {
            for (int i = 0; i < maxCount; i++) {

                //сколько элементов в прогрессии
                int randomCount = random.nextInt(MINBOUND, MAXBOUND);
                //шаг прогрессии
                int step = random.nextInt(MINSTEP, MAXSTEP);
                //первый элемент прогрессии
                int firstElement = random.nextInt(MINBOUNDFORELEMENT, MAXBOUNDFORELEMENT);
                //создание массива строк с числами (прогрессия)
                int[] numbers = new int[randomCount];
                for (int j = 0; j < randomCount; j++) {
                    numbers[j] = firstElement;
                    firstElement = firstElement + step;
                }
                //случайный элемент прогрессии
                int randomIndex = random.nextInt(randomCount);
                //массив чисел в строчном формате
                String[] strNumbers = new String[randomCount];
                for (int k = 0; k < randomCount; k++) {
                    strNumbers[k] = String.valueOf(numbers[k]);
                }
                roundArr[i][1] = strNumbers[randomIndex];
                strNumbers[randomIndex] = "..";
                roundArr[i][0] = String.join(" ", strNumbers);
            }
            count += 1;
        }
        Engine.userInteraction(roundArr);
    }
}
