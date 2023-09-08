package hexlet.code;

import java.util.Random;

public class Utils {
    public static final int FIRSTBOUND = 5;
    public static final int LASTBOUND = 10;
    public static final int MINBOUND = 0;
    public static final int MAXBOUND = 100;

    //не додумалась, как реализовать ещё Рандом, пришлось 2 параметра передавать ("от" и "до"),
    // а где у меня передается только 1 параметр (только "до") в Рандом,
    // пришлось первым параметром сделать 0 (константой сделала его)
    //подскажите, пожалуйста, как сделать красивее этот код :'(
    public static int getRandomInt(int bound1, int bound2) {
        Random random = new Random();
        return random.nextInt(bound1, bound2);
    }
}
