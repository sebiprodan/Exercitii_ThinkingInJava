import java.util.*;

public class CompareRandomsInfinte {

    public static void main(String[] args) {

        int firstNo = 0;
        int secondNo;

        Random random1 = new Random();
        Random random2 = new Random();

        while (firstNo <25){
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
