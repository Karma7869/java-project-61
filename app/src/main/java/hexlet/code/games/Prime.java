package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    private static final int NUMBER_RANGE = 100;

    public static void primeGame() {

        String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[] questionToUser = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] correctAnswers = new String[Engine.NUMBER_OF_QUESTIONS];

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int randomInt = Util.getRandomNumber(NUMBER_RANGE) + 1;

            questionToUser[i] = String.valueOf(randomInt);
            correctAnswers[i] = primeNumber(randomInt) ? "yes" : "no";
        }
        Engine.gameEngine(question, correctAnswers, questionToUser);
    }

    public static boolean primeNumber(int randNum) {
        int count = 0;

        if (randNum < 2) {
            return false;
        }

        for (int j = 1; j < NUMBER_RANGE; j++) {
            if (randNum % j == 0) {
                count++;
            }
        }
        return count == 2;
    }
}
