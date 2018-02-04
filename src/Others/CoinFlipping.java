package Others;

import java.util.*;

public class CoinFlipping {

    public static void main(String[] args) {

        String[] posibilitiy= {"Stema", "Ban"};

        Random random = new Random();

        String coinFlipping = posibilitiy[random.nextInt(posibilitiy.length)];

        System.out.println(coinFlipping);
    }
}
