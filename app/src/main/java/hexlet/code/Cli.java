package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String user;
    private static String rightAnswer;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;

    public static String enterName() {
        Scanner scanner = new Scanner(System.in);
        user = scanner.nextLine();
        return user;
    }

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        user = Cli.enterName();
        System.out.println("Hello, " + user + "!");
    }

    public static String getName() {
        return user;
    }

    public static void askQuestion(String[] roundData) {
        System.out.println(roundData[QUESTION]);
        System.out.print("Your answer: ");
    }

    public static String getRightAnswer(String[] roundData) {
        rightAnswer = roundData[ANSWER];
        return rightAnswer;
    }
}
