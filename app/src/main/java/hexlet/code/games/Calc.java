package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void calcGame() {
        String userName = Cli.getUserName();
        System.out.println("What is the result of the expression?");

        Random rand = new Random();
        String[] operations = {" + ", " - ", " * "};

        for (int i = 0; i < 3; i++) {
            String operation = operations[rand.nextInt(operations.length)];
            int randomNumOne = Engine.getRandomNumber();
            int randomNumTwo = Engine.getRandomNumber();
            int correctAnswer = conversionOperation(randomNumOne, randomNumTwo, operation);

            System.out.println(Engine.publicQuestion + randomNumOne + operation + randomNumTwo);
            String answerToQuestion = Engine.getUserAnswer();
            int conversionAnswerToQuestion = Integer.parseInt(answerToQuestion);

            if (correctAnswer == conversionAnswerToQuestion) {
                System.out.println(Engine.publicCorrect);

            } else {
                Engine.getUserLost(String.valueOf(conversionAnswerToQuestion), String.valueOf(correctAnswer), userName);
                break;
            }
            if (i == 2) {
                Engine.getWinningGame(userName);
            }
        }
    }

    public static int conversionOperation(int randNumOne, int randNumTwo, String operation) {
        if (operation.equals(" + ")) {
            return randNumOne + randNumTwo;

        } else if (operation.equals(" - ")) {
            return randNumOne - randNumTwo;

        } else {
            return randNumOne * randNumTwo;
        }
    }
}
