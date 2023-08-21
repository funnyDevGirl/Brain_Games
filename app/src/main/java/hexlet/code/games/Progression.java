package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Progression {
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
            final int minInterval = 5;
            final int maxInterval =  10;
            int randomCount = random.nextInt(minInterval, maxInterval);
            //шаг прогрессии
            final int minStep = 2;
            final int maxStep = 5;
            int step = random.nextInt(minStep, maxStep);
            //первый элемент прогрессии
            final int minCoint = 1;
            final int maxCount = 15;
            int begin = random.nextInt(minCoint, maxCount);
            //создание массива строк с числами (прогрессия)
            int[] numbers = new int[randomCount];
            for (int i = 0; i < randomCount; i++) {
                numbers[i] = begin;
                begin = begin + step;
            }
            //рандомный элемент прогрессии
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
