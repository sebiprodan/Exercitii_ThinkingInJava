package ObjectContainers;

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

public class App {

    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++){
            apples.add(new Apple());
            // Orange is detected only at run time
            apples.add(new Orange());
        }

        for (int i = 0; i < apples.size(); i++){
            // error : Orange can not be cast Apple
            ((Apple)apples.get(i)).id();
        }
    }

}
