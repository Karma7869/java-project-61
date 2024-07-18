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
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");

        System.out.print("Your choice: ");
        String numGame = String.valueOf(scanner.nextInt());
        System.out.println();

        switch (numGame) {
            case "0" -> System.out.println("You left the game, come again!");
            case "1" -> Cli.getUserName();
            case "2" -> Even.evenGame();
            case "3" -> Calc.calcGame();
            case "4" -> GCD.gcdGame();
            case "5" -> Progression.gameProgression();
            case "6" -> Prime.primeGame();
            default -> System.out.println("Choose the right game and try again!");
        }
    }
}
