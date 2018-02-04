package Others;

import java.util.*;

public class CompareRandoms {

    public static void main(String[] args) {

        int firstNo;
        int secondNo;

        Random random1 = new Random();
        Random random2 = new Random();

        for (int i = 0; i < 25; i++) {
            firstNo = random1.nextInt(25);
            secondNo = random2.nextInt(25);

            if (firstNo < secondNo) {
                System.out.println(firstNo + " & " + secondNo + " : primul numar e mai mic ca al doilea");
            } else if (firstNo == secondNo) {
                System.out.println(firstNo + " & " + secondNo + " : primul numar este egal cu al doilea");
            } else {
                System.out.println(firstNo + " & " + secondNo + " : primul numar este mai mare ca al doilea");
            }
        }
    }
}
