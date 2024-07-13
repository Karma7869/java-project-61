package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    public static void evenGame() {
        String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[] questionToUser = new String[3];
        String[] correctAnswers = new String[3];

        for (int i = 0; i < Util.NUMBER_OF_QUESTIONS; i++) {
            int randomNum = Util.getRandomNumber();
            questionToUser[i] = String.valueOf(randomNum);

            if (randomNum % 2 == 0) {
                correctAnswers[i] = "yes";
            } else if (randomNum % 2 != 0) {
                correctAnswers[i] = "no";
            }
        }
        Engine.gameEngine(question, correctAnswers, questionToUser);
    }
}
