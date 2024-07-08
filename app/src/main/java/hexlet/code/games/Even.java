package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Even {
    public static void evenGame() {
        String userName = Cli.getUserName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {
            int randomNum = Engine.getRandomNumber();
            System.out.println(Engine.publicQuestion + randomNum);
            String answerToQuestion = Engine.getUserAnswer();

            String userAnswer = "";

            if (answerToQuestion.equals("yes") && randomNum % 2 == 0) {
                System.out.println(Engine.publicCorrect);
            } else if (answerToQuestion.equals("no") && randomNum % 2 != 0) {
                System.out.println(Engine.publicCorrect);
            } else {
                if (randomNum % 2 == 0) {
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
