package hexlet.code.games;

import hexlet.code.Cli;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void progressionGame() {
        //greet
        //Engine.greet();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String user = Cli.name();
        System.out.println("Hello, " + user + "!");
        //5
        System.out.println("What number is missing in the progression?");

        int count = 0;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int round = 3;
        while (round > 0) {
            //сколько элементов в прогрессии
            int randomCount = random.nextInt(5, 10);
            //шаг прогрессии
            int step = random.nextInt(2, 5);
            //первый элемент прогрессии
            int begin = random.nextInt(1, 15);
            //создание массива строк с числами (прогрессия)
            int[] numbers = new int[randomCount];
            for (int i = 0; i < randomCount; i++) {
                numbers[i] = begin;
                begin = begin + step;
            }
            //рандомный элемент прогрессии
            int randomIndex = random.nextInt(randomCount);
            int rightAnswer = numbers[randomIndex];
            var result = new StringBuilder(begin);
            for (var number : numbers) {
                result.append(" ").append(number);
            }
            var question = result.toString();
            var complete = question.replace(String.valueOf(rightAnswer), "..");

            System.out.println("Question: " + complete);
            System.out.print("Your answer: ");
            int answer;

            try {
                answer = scanner.nextInt();
            } catch (InputMismatchException h) {
                System.out.println("Incorrect command input. Goodbye.");
                break;
            }
            if (answer == rightAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + answer + "'" + " is wrong answer ;(. ");
                System.out.println("Correct answer was " + "'" + rightAnswer + "'.");
                System.out.println("Let's try again, " + user + "!");
                break;
            }
            count += 1;
            round -= 1;
            if (count == 3) {
                System.out.println("Congratulations, " + user + "!");
            }
        }
    }
}
