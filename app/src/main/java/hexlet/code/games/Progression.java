package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {

    private static final int ARRAY_LENGTH = 10;

    public static void gameProgression() {

        String question = "What number is missing in the progression?";

        String[] questionToUser = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] correctAnswers = new String[Engine.NUMBER_OF_QUESTIONS];

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {

            int seedNumber = Util.getRandomNumber(Engine.SIZE_RANDOM);
            int magnifier = Util.getRandomNumber(Engine.SIZE_RANDOM);

            String[] arrayNum = arrayNumbers(seedNumber, magnifier, ARRAY_LENGTH);
            int randIndex = Util.getRandomNumber(arrayNum.length);
            String missingNumber = arrayNum[randIndex];
            arrayNum[randIndex] = "..";

            questionToUser[i] = String.join(" ", arrayNum);
            correctAnswers[i] = missingNumber;
        }
        Engine.gameEngine(question, correctAnswers, questionToUser);
    }

    private static String[] arrayNumbers(int seedNumber, int magnifier, int arrayLength) {
        String[] numbers = new String[arrayLength];
        numbers[0] = String.valueOf(seedNumber);

        for (int j = 1; j < arrayLength; j++) {
            numbers[j] = String.valueOf(Integer.parseInt(numbers[j - 1]) + magnifier);
        }
        return numbers;
    }
}
