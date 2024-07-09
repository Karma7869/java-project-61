package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter. \n"
                + "1 - Greet \n"
                + "2 - Even \n"
                + "3 - Calc + \n"
                + "4 - GCD \n"
                + "5 - Progression \n"
                + "6 - Prime \n"
                + "0 - Exit");

        System.out.print("Your choice: ");
        int numGame = scanner.nextInt();
        System.out.println();

        if (numGame == 2) {
            Even.evenGame();
        } else if (numGame == 3) {
            Calc.calcGame();
        } else if (numGame == 1) {
            Cli.getUserName();
        } else if (numGame == 4) {
            GCD.gcdGame();
        } else if (numGame == 5) {
            Progression.gameProgression();
        } else if (numGame == 6) {
            Prime.primeGame();
        }
    }
}
