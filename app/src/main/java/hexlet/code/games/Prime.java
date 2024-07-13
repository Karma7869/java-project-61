package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Random;

public class Prime {
    private static final int NUMBER_RANGE = 100;

    public static void primeGame() {

        String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[] questionToUser = new String[Util.NUMBER_OF_QUESTIONS];
        String[] correctAnswers = new String[Util.NUMBER_OF_QUESTIONS];

        for (int i = 0; i < Util.NUMBER_OF_QUESTIONS; i++) {

            int count = 0;

            Random rand = new Random();
            int randomInt = rand.nextInt(NUMBER_RANGE) + 1;

            questionToUser[i] = String.valueOf(randomInt);

            for (int j = 1; j < NUMBER_RANGE; j++) {
                if (randomInt % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                correctAnswers[i] = "yes";
            } else if (count != 2) {
                correctAnswers[i] = "no";
            }
        }
        Engine.gameEngine(question, correctAnswers, questionToUser);
    }
}
