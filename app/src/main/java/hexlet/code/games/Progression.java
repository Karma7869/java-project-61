package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static void gameProgression() {
        String userName = Cli.getUserName();
        Engine engine = new Engine();
        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < 3; i++) {
            int[] numbers = new int[10];
            numbers[0] = Engine.getRandomNumber();
            int magnifier = Engine.getRandomNumber();

            for (int j = 1; j < 10; j++) {
                numbers[j] = numbers[j - 1] + magnifier;
            }

            String[] numberString = new String[numbers.length];
            for (int j = 0; j < numbers.length; j++) {
                numberString[j] = String.valueOf(numbers[j]);
            }

            Random rand = new Random();
            int randIndex = rand.nextInt(numberString.length);
            String missingNumber = numberString[randIndex];
            numberString[randIndex] = "..";

            System.out.println(engine.getPublicQuestion() + String.join(" ", numberString));
            String answerToQuestion = Engine.getUserAnswer();

            if (answerToQuestion.equals(missingNumber)) {
                System.out.println(engine.getPublicCorrect());
            } else {
                Engine.getUserLost(answerToQuestion, missingNumber, userName);
                break;
            }

            if (i == 2) {
                Engine.getWinningGame(userName);
            }
        }
    }
}
