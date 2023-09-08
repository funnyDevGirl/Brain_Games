package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final int MINSTEP = 2;
    public static final int MAXSTEP = 5;
    public static final int MINBOUNDFORELEMENT = 1;
    public static final int MAXBOUNDFORELEMENT = 15;
    public static final int TRANSMITDATA = 2;
    public static void formProgression() {
        Engine.greet();
        System.out.println("What number is missing in the progression?");

        String[][] roundArr = new String[Engine.MAXROUND][TRANSMITDATA];

        //generate Arr with question and right answer
        for (int count = 0; count < Engine.MAXROUND;  count++) {
            for (int i = 0; i < Engine.MAXROUND; i++) {

                int randomCount = Utils.getRandomInt(Utils.FIRSTBOUND, Utils.LASTBOUND); //кол-во эл. в прогрессии
                int step = Utils.getRandomInt(MINSTEP, MAXSTEP); //шаг прогрессии
                int firstElement = Utils.getRandomInt(MINBOUNDFORELEMENT, MAXBOUNDFORELEMENT); //1й эл-т

                //создание массива строк с числами (прогрессия)
                String[] numbers = new String[randomCount];
                for (int j = 0; j < randomCount; j++) {
                    numbers[j] = Integer.toString(firstElement);
                    firstElement = firstElement + step;
                }
                //случайный элемент прогрессии
                int randomIndex = Utils.getRandomInt(Utils.MINBOUND, randomCount);

                roundArr[i][1] = numbers[randomIndex];
                numbers[randomIndex] = "..";
                roundArr[i][0] = String.join(" ", numbers);
            }
        }
        Engine.interact(roundArr);
    }
}
