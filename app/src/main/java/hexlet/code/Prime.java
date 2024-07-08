package hexlet.code;

import java.util.Random;

public class Prime {
    public static void primeGame() {

        String userName = Cli.getUserName();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {

            int count = 0;
            String userAnswer = "";

            Random rand = new Random();
            int randomInt = rand.nextInt(100) + 1;

            System.out.println(Engine.publicQuestion + randomInt);
            String answerToQuestion = Engine.getUserAnswer();

            for (int j = 1; j < 100; j++) {
                if (randomInt % j == 0) {
                    count++;
                }
            }
            if (count == 2 && answerToQuestion.equals("yes")) {
                System.out.println(Engine.publicCorrect);
            } else if (count != 2 && answerToQuestion.equals("no")) {
                System.out.println(Engine.publicCorrect);
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
