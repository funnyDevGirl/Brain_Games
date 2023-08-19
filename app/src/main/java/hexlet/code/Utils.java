package hexlet.code;

public class Utils {
    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
