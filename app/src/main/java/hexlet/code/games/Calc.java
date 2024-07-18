package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Random;

public class Calc {
    public static void calcGame() {
        String question = "What is the result of the expression?";

        Random rand = new Random();
        String[] operations = {" + ", " - ", " * "};
        String[] questionToUser = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] correctAnswers = new String[Engine.NUMBER_OF_QUESTIONS];

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            String operation = operations[rand.nextInt(operations.length)];
            int randomNumOne = Util.getRandomNumber(10);
            int randomNumTwo = Util.getRandomNumber(10);
            int correctAnswer = conversionOperation(randomNumOne, randomNumTwo, operation);
            correctAnswers[i] = String.valueOf(correctAnswer);
            questionToUser[i] = randomNumOne + operation + randomNumTwo;
        }

        Engine.gameEngine(question, correctAnswers, questionToUser);
    }

    public static int conversionOperation(int randNumOne, int randNumTwo, String operation) {
        if (operation.equals(" + ")) {
            return randNumOne + randNumTwo;

        } else if (operation.equals(" - ")) {
            return randNumOne - randNumTwo;

        } else {
            return randNumOne * randNumTwo;
        }
    }
}
