package HoldingYourObjects.Examples;

import java.util.ArrayList;

class Apple {
    private static long counter;
    private final long id = counter++;
    public long id(){
        return id;
    }

}

class Orange {

}
// example using Generics.
public class App {

    public static void main(String[] args) {
        ArrayList <Apple> apples = new ArrayList();
        for (int i = 0; i < 3; i++)
            apples.add(new Apple());
            // we are prevented that Orange is not Apple form the compile time
            //apples.add(new Orange())
        for (int i = 0; i < apples.size(); i++)
            System.out.println(apples.get(i).id());

            for (Apple c : apples)
            System.out.println(c.id());
        }
    }
