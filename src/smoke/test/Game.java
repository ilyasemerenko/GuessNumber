package smoke.test;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by SemerenkoIlya on 29.02.2016.
 */
public class Game {

    Scanner myScanner;
    Random random;

    private int range;
    private int level;

    //Don't want waste time anymore for this game...
    //todo Refactor. Extract methods.
    void run() {
        range = 20;
        level = 1;
        myScanner = new Scanner(System.in);
        random = new Random();
        while (true) {
            System.out.println("Level " + level + ". Type number 1-" + range + ".");
            try {
                int randomNumber = random.nextInt(range) + 1;
                while (true) {
                    String userString = myScanner.nextLine();
                    if ("q".equalsIgnoreCase(userString)) {
                        quit(randomNumber);
                    } else if (randomNumber == Integer.valueOf(userString)) {
                        System.out.println("Got it! Number = " + randomNumber + ". You've achieved new level. Continue playing? 'Y/N'.(Or try again? 'X' )");
                        String answer = myScanner.nextLine();
                        if(answer.equalsIgnoreCase("y")){
                            range += 5;
                            level++;
                            break;
                        } else if (answer.equalsIgnoreCase("n")){
                            System.out.println("See you later");
                            System.exit(0);
                        } else if (answer.equalsIgnoreCase("x")){
                            break;
                        } else {
                            System.exit(0);//
                        }
                    } else if (randomNumber > Integer.valueOf(userString)) {
                        System.out.println("You think the number = " + userString + ". Go on. Your value is lower");
                    } else if (randomNumber < Integer.valueOf(userString)) {
                        System.out.println("You think the number = " + userString +". Go on. Your value is higher");
                    }
                }
            } catch (NumberFormatException e){
                System.out.println("You should use only numbers or 'q/Q' for exit.");
                e.printStackTrace();
            }
        }
    }

    private void quit(int randomNumber) {
        System.out.println("Loser! Random number = " + randomNumber + ". See you next time.");
        System.exit(0);
    }
}
