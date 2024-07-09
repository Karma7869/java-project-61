package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    private static final int CALC_GAME = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION_GAME = 5;
    private static final int PRIME_GAME = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter. \n"
                + "1 - Greet \n"
                + "2 - Even \n"
                + "3 - Calc \n"
                + "4 - GCD \n"
                + "5 - Progression \n"
                + "6 - Prime \n"
                + "0 - Exit");

        System.out.print("Your choice: ");
        int numGame = scanner.nextInt();
        System.out.println();

        if (numGame == 2) {
            Even.evenGame();
        } else if (numGame == CALC_GAME) {
            Calc.calcGame();
        } else if (numGame == 1) {
            Cli.getUserName();
        } else if (numGame == GCD_GAME) {
            GCD.gcdGame();
        } else if (numGame == PROGRESSION_GAME) {
            Progression.gameProgression();
        } else if (numGame == PRIME_GAME) {
            Prime.primeGame();
        }
    }
}
