package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class GCD {
    public static void gcdGame() {
        String userName = Cli.getUserName();
        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < 3; i++) {
            int randomNumOne = Engine.getRandomNumber();
            int randomNumTwo = Engine.getRandomNumber();

            System.out.println(Engine.publicQuestion + randomNumOne + " " + randomNumTwo);
            String answerToQuestion = Engine.getUserAnswer();

            while (randomNumTwo != 0) {
                int multiple = randomNumTwo;
                randomNumTwo = randomNumOne % randomNumTwo;
                randomNumOne = multiple;
            }

            int gcd = randomNumOne;

            if (answerToQuestion.equals(String.valueOf(gcd))) {
                System.out.println(Engine.publicCorrect);
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
