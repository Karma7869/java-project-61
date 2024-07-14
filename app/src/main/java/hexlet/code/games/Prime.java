package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static final int NUMBER_RANGE = 100;

    public static void primeGame() {

        String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[] questionToUser = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] correctAnswers = new String[Engine.NUMBER_OF_QUESTIONS];

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {

            Random rand = new Random();
            int randomInt = rand.nextInt(NUMBER_RANGE) + 1;

            questionToUser[i] = String.valueOf(randomInt);

            if (primeNumber(randomInt)) {
                correctAnswers[i] = "yes";
            } else {
                correctAnswers[i] = "no";
            }
        }
        Engine.gameEngine(question, correctAnswers, questionToUser);
    }

    public static boolean primeNumber(int randNum) {
        int count = 0;

        for (int j = 1; j < NUMBER_RANGE; j++) {
            if (randNum % j == 0) {
                count++;
            }
        }
        return count == 2;
    }
}
