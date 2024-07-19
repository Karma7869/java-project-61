package hexlet.code;

import java.util.Scanner;

public final class Engine {
    public static final int SIZE_RANDOM = 10;
    public static final int NUMBER_OF_QUESTIONS = 3;

    public static void gameEngine(String question, String[] correctAnswer, String[] questionToUser) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to the Brain Games! \nMay I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(question);

        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            System.out.println("Question: " + questionToUser[i]);
            System.out.print("Your answer: ");
            String inputResponse = scanner.nextLine();

            if (correctAnswer[i].equals(inputResponse)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + inputResponse + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer[i] + "'");

                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
