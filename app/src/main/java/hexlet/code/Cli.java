package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static Scanner scanner = new Scanner(System.in);

    public static int getGameChoice() {
        System.out.println("Please enter the game number and press Enter. \n1 - Greet \n2 - Even \n3 - Calc \n0 - Exit");
        System.out.print("Your choice: ");
        int numGame = scanner.nextInt();
        scanner.nextLine();

        return numGame;
    }

    public static String getUserName() {
        System.out.println("Welcome to the Brain Games! \nMay I have your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello," + userName);
        return userName;
    }

    public static String getUserAnswer() {
        System.out.println("Your answer: ");
        String inputResponse = scanner.nextLine();
        return inputResponse;
    }

    public static void closeScanner() {
        scanner.close();
    }
}
