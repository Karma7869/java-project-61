package hexlet.code;

public class Util {
    public static final int NUMBER_OF_QUESTIONS = 3;
    private static final int DEFAULT_LENGTH = 10;
    public static int getRandomNumber() {
        return (int) (Math.random() * DEFAULT_LENGTH);
    }
}
