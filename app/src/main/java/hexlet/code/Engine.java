package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static Scanner scanner = new Scanner(System.in);

    private String publicQuestion = "Question: ";
    private String publicCorrect = "Correct!";

    public String getPublicQuestion() {
        return publicQuestion;
    }

    public String getPublicCorrect() {
        return publicCorrect;
    }

    public static String getUserAnswer() {
        System.out.print("Your answer: ");
        String inputResponse = scanner.nextLine();
        return inputResponse;
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 10);
    }

    public static void getUserLost(String answerToQuestion, String userAnswer, String userName) {
        System.out.println("'" + answerToQuestion + "' is wrong answer ;(. Correct answer was '" + userAnswer + "'");
        System.out.println("Let's try again, " + userName + "!");
    }

    public static void getWinningGame(String userName) {
        System.out.println("Congratulations, " + userName + "!");
    }

}
