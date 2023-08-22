package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        final int maxRound = 3;

        int round = 0;

        while (round < maxRound) {
            //generate question and answer
            //сколько элементов в прогрессии
            int randomCount = random.nextInt(MINBOUND, MAXBOUND);
            //шаг прогрессии
            int step = random.nextInt(MINSTEP, MAXSTEP);
            //первый элемент прогрессии
            int firstElement = random.nextInt(MINBOUNDFORELEMENT, MAXBOUNDFORELEMENT);
            //создание массива строк с числами (прогрессия)
            int[] numbers = new int[randomCount];
            for (int i = 0; i < randomCount; i++) {
                numbers[i] = firstElement;
                firstElement = firstElement + step;
            }
            //случайный элемент прогрессии
            int randomIndex = random.nextInt(randomCount);
            //массив чисел в строчном формате
            String[] strNumbers = new String[randomCount];
            for (int i = 0; i < randomCount; i++) {
                strNumbers[i] = String.valueOf(numbers[i]);
            }
            String rightAnswer = strNumbers[randomIndex];
            strNumbers[randomIndex] = "..";

            //здесь задается вопрос, дается ответ и проверяется
            System.out.println("Question: " + String.join(" ", strNumbers));
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            //checking result
            if (Engine.checkingAnswer(userAnswer.equals(rightAnswer), rightAnswer, userAnswer)) {
                break;
            }
            round += 1;
            Engine.congratulations(round == maxRound);
        }
    }
}
