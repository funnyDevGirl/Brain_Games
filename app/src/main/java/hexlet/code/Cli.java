package hexlet.code;
import java.util.Scanner;

public class Cli {
    private static String user;
    public static String name() {
        Scanner scanner = new Scanner(System.in);
        user = scanner.nextLine();
        return user;
    }

    public static String getName() {
        return user;
    }
}


