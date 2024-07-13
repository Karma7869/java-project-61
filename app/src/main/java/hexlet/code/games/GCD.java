package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    public static void gcdGame() {
        String question = "Find the greatest common divisor of given numbers.";

        String[] questionToUser = new String[Util.NUMBER_OF_QUESTIONS];
        String[] correctAnswers = new String[Util.NUMBER_OF_QUESTIONS];


        for (int i = 0; i < Util.NUMBER_OF_QUESTIONS; i++) {
            int randomNumOne = Util.getRandomNumber();
            int randomNumTwo = Util.getRandomNumber();

            questionToUser[i] = randomNumOne + " " + randomNumTwo;

            while (randomNumTwo != 0) {
                int multiple = randomNumTwo;
                randomNumTwo = randomNumOne % randomNumTwo;
                randomNumOne = multiple;
            }
            correctAnswers[i] = String.valueOf(randomNumOne);
        }
        Engine.gameEngine(question, correctAnswers, questionToUser);
    }
}
