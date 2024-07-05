package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static Scanner scanner = new Scanner(System.in);

    public static String getUserAnswer() {
        System.out.print("Your answer: ");
        String inputResponse = scanner.nextLine();
        return inputResponse;
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 10);
    }

}
