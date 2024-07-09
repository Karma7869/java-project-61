package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static final int NUMBER_RANGE = 100;

    public static void primeGame() {

        String userName = Cli.getUserName();
        Engine engine = new Engine();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < engine.getNumberQuestion(); i++) {

            int count = 0;
            String userAnswer = "";

            Random rand = new Random();
            int randomInt = rand.nextInt(NUMBER_RANGE) + 1;

            System.out.println(engine.getPublicQuestion() + randomInt);
            String answerToQuestion = Engine.getUserAnswer();

            for (int j = 1; j < NUMBER_RANGE; j++) {
                if (randomInt % j == 0) {
                    count++;
                }
            }
            if (count == 2 && answerToQuestion.equals("yes")) {
                System.out.println(engine.getPublicCorrect());
            } else if (count != 2 && answerToQuestion.equals("no")) {
                System.out.println(engine.getPublicCorrect());
            } else {
                if (count == 2) {
                    userAnswer = "yes";
                } else {
                    userAnswer = "no";
                }
                Engine.getUserLost(answerToQuestion, userAnswer, userName);
                break;
            }

            if (i == 2) {
                Engine.getWinningGame(userName);
            }
        }
    }
}
