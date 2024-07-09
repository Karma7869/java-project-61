package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Even {
    public static void evenGame() {
        String userName = Cli.getUserName();
        Engine engine = new Engine();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < engine.getNumberQuestion(); i++) {
            int randomNum = Engine.getRandomNumber();
            System.out.println(engine.getPublicQuestion() + randomNum);
            String answerToQuestion = Engine.getUserAnswer();

            String userAnswer = "";

            if (answerToQuestion.equals("yes") && randomNum % 2 == 0) {
                System.out.println(engine.getPublicCorrect());
            } else if (answerToQuestion.equals("no") && randomNum % 2 != 0) {
                System.out.println(engine.getPublicCorrect());
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
