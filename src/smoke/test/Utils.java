package smoke.test;

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
}
