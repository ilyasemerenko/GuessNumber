package smoke.test;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by SemerenkoIlya on 29.02.2016.
 */
public class GuessNumber {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        Random rand = new Random();
        Utils util = new Utils();
        boolean goOn = true;

    while (goOn) {
        int randomNumber = rand.nextInt(20) + 1;
        while (true) {
            String userString = myScanner.nextLine();
            if ("q".equalsIgnoreCase(userString)) {
                System.out.println("Loser! Random number = " + randomNumber);
                break;
            } else if (randomNumber == Integer.valueOf(userString)) {
                System.out.println("Got it! Let's try again!");
                break;
            } else if (randomNumber > Integer.valueOf(userString)) {
                System.out.println("Go on. Your value is lower");
            } else if (randomNumber < Integer.valueOf(userString)) {
                System.out.println("Go on. Your value is higher");
            }
        }
    }
    }
}
