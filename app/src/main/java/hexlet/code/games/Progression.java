package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Random;

public class Progression {
    public static final int DEFAULT_LENGTH = 10;

    public static void gameProgression() {

        String question = "What number is missing in the progression?";

        String[] questionToUser = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] correctAnswers = new String[Engine.NUMBER_OF_QUESTIONS];

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {

            Random rand = new Random();
            String[] arrayNum = arrayNumbers();
            int randIndex = rand.nextInt(arrayNum.length);
            String missingNumber = arrayNum[randIndex];
            arrayNum[randIndex] = "..";

            questionToUser[i] = String.join(" ", arrayNum);
            correctAnswers[i] = missingNumber;
        }
        Engine.gameEngine(question, correctAnswers, questionToUser);
    }

    public static String[] arrayNumbers() {
        int[] numbers = new int[DEFAULT_LENGTH];
        numbers[0] = Util.getRandomNumber();
        int magnifier = Util.getRandomNumber();

        for (int j = 1; j < DEFAULT_LENGTH; j++) {
            numbers[j] = numbers[j - 1] + magnifier;
        }

        String[] numberString = new String[numbers.length];
        for (int j = 0; j < numbers.length; j++) {
            numberString[j] = String.valueOf(numbers[j]);
        }
        return numberString;
    }
}
