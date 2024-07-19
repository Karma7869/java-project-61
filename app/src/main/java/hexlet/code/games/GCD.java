package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    public static void gcdGame() {
        String question = "Find the greatest common divisor of given numbers.";

        String[] questionToUser = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] correctAnswers = new String[Engine.NUMBER_OF_QUESTIONS];

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int randomNumOne = Util.getRandomNumber(Engine.SIZE_RANDOM);
            int randomNumTwo = Util.getRandomNumber(Engine.SIZE_RANDOM);

            questionToUser[i] = randomNumOne + " " + randomNumTwo;

            correctAnswers[i] = String.valueOf(findingGcd(randomNumOne, randomNumTwo));
        }
        Engine.gameEngine(question, correctAnswers, questionToUser);
    }

    private static int findingGcd(int numOne, int numTwo) {
        while (numTwo != 0) {
            int multiple = numTwo;
            numTwo = numOne % numTwo;
            numOne = multiple;
        }
        return numOne;
    }
}
