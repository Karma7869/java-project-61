package hexlet.code;

import hexlet.code.games.Progression;

public class Util {
    public static int getRandomNumber() {
        return (int) (Math.random() * Progression.DEFAULT_LENGTH);
    }
}
