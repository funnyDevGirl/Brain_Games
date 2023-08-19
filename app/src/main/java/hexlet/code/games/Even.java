package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class Even {
    public static void evenGame() {
        //greet
        //Engine.greet();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String user = Cli.name();
        System.out.println("Hello, " + user + "!");
        //2
        String[][] volumes = {{"15", "50", "33"}, {"no", "yes", "no"}};

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner1 = new Scanner(System.in);
        int count = 0;
        int i = 0;
        int j = 0;

        while (i < volumes[0].length) {
            while (j < volumes[1].length) {
                System.out.println("Question: " + volumes[0][i]);
                System.out.print("Your answer: ");
                String answer = scanner1.next();
                if (answer.equals(volumes[1][j])) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + user + "!");
                    break;
                }
                count += 1;
                i += 1;
                j += 1;
                if (count == 3) {
                    System.out.println("Congratulations, " + user + "!");
                }
            }
            break;
        }
    }
}
