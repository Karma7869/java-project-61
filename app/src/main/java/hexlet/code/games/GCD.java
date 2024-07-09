package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class GCD {
    public static void gcdGame() {
        String userName = Cli.getUserName();
        Engine engine = new Engine();
        System.out.println("Find the greatest common divisor of given numbers.");


        for (int i = 0; i < engine.getNumberQuestion(); i++) {
            int randomNumOne = Engine.getRandomNumber();
            int randomNumTwo = Engine.getRandomNumber();

            System.out.println(engine.getPublicQuestion() + randomNumOne + " " + randomNumTwo);
            String answerToQuestion = Engine.getUserAnswer();

            while (randomNumTwo != 0) {
                int multiple = randomNumTwo;
                randomNumTwo = randomNumOne % randomNumTwo;
                randomNumOne = multiple;
            }

            int gcd = randomNumOne;

            if (answerToQuestion.equals(String.valueOf(gcd))) {
                System.out.println(engine.getPublicCorrect());
            } else {
                Engine.getUserLost(answerToQuestion, String.valueOf(gcd), userName);
                break;
            }
            if (i == 2) {
                Engine.getWinningGame(userName);
            }
        }
    }
}
