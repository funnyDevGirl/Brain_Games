package hexlet.code;
//import java.util.Arrays;
//import java.util.Scanner;

public class Engine {
    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String user = Cli.name();
        System.out.println("Hello, " + user + "!");
    }
}
