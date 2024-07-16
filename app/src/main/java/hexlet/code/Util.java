package hexlet.code;

public class Util {
    private static final int SIZE_RANDOM = 10;
    public static int getRandomNumber() {
        return (int) (Math.random() * SIZE_RANDOM);
    }
}
