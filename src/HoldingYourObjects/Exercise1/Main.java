package HoldingYourObjects.Exercise1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();

        gerbils.add(new Gerbil(12));
        gerbils.add(new Gerbil(7));
        gerbils.add(new Gerbil(2));

        for (int i = 0; i < gerbils.size(); i++) {
            gerbils.get(i).hop();

        }
    }
}