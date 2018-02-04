package Others;

import java.util.*;

public class PrimeNo {

    public static void main(String args[]) {
        int rest;
        boolean isPrime = true;

        Scanner scanInput = new Scanner(System.in);

        System.out.println("Enter any number: ");

        int number = scanInput.nextInt();
        scanInput.close();

        for (int i = 2; number > i; i++) {
            rest = number % i;
            if (rest == 0) {
                isPrime = false;
              break; //this is an unlabeled "break statement"
            }else if (rest != 0){
                isPrime = true;
            }
        }
        //If isPrime is true then the number is prime else not
        if (isPrime)
            System.out.println(number + " is a Prime number");
        else
            System.out.println(number + " is not a Prime number");
    }
}


