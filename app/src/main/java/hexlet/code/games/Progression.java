package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Random;

public class Progression {

    private static final int ARRAY_LENGTH = 10;

    public static void gameProgression() {

        String question = "What number is missing in the progression?";

        String[] questionToUser = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] correctAnswers = new String[Engine.NUMBER_OF_QUESTIONS];

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {


            Random rand = new Random();
            int seedNumber = Util.getRandomNumber();
            int magnifier = Util.getRandomNumber();

            String[] arrayNum = arrayNumbers(seedNumber, magnifier, ARRAY_LENGTH);
            int randIndex = rand.nextInt(arrayNum.length);
            String missingNumber = arrayNum[randIndex];
            arrayNum[randIndex] = "..";

            questionToUser[i] = String.join(" ", arrayNum);
            correctAnswers[i] = missingNumber;
        }
        Engine.gameEngine(question, correctAnswers, questionToUser);
    }

    public static String[] arrayNumbers(int seedNumber, int magnifier, int arrayLength) {
        int[] numbers = new int[arrayLength];
        numbers[0] = seedNumber;

        for (int j = 1; j < arrayLength; j++) {
            numbers[j] = numbers[j - 1] + magnifier;
        }

        String[] numberString = new String[numbers.length];
        for (int j = 0; j < numbers.length; j++) {
            numberString[j] = String.valueOf(numbers[j]);
        }
        return numberString;
    }
}
