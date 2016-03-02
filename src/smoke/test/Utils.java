package smoke.test;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by SemerenkoIlya on 29.02.2016.
 */
public class Utils {
    private final static int LOWER = 1;
    private final static int HIGHER = 2;
    private final static int SAME = 0;

    public int guessValues(int user, int randomNum){
        if (user < randomNum){
            return LOWER;
        } else if(user > randomNum){
            return HIGHER;
        } else if (user == randomNum){
            return SAME;
        }
        return 3;
    }

    void run() {
        Scanner myScanner = new Scanner(System.in);
        Random random = new Random();
        boolean goOn = true;
        try {
            while (goOn) {
                int randomNumber = random.nextInt(20) + 1;
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
        } catch (Exception e){
            System.out.println("Exception + " + e);
        }
    }
}
