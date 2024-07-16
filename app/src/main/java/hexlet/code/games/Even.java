package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    public static void evenGame() {
        String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[] questionToUser = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] correctAnswers = new String[Engine.NUMBER_OF_QUESTIONS];

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int randomNum = Util.getRandomNumber();
            questionToUser[i] = String.valueOf(randomNum);

            correctAnswers[i] = parityDetection(randomNum) ? "yes" : "no";
        }
        Engine.gameEngine(question, correctAnswers, questionToUser);
    }

    public static boolean parityDetection(int num) {
        return num % 2 == 0;
    }
}
