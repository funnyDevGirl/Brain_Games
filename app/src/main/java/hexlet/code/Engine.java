package hexlet.code;

public class Engine {
    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String user = Cli.name();
        System.out.println("Hello, " + user + "!");
    }

    public static boolean checkingAnswer(boolean condition, Object rightAnswer, Object userAnswer) {

        if (condition) {
            System.out.println("Correct!");
        } else {
            System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
            System.out.println("Correct answer was '" + rightAnswer + "'.");
            System.out.println("Let's try again, " + Cli.getName() + "!");
            return true;
        }
        return false;
    }

    public static void congratulations(boolean condition) {
        if (condition) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
}
