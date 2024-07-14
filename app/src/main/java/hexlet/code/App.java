package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    private static final int EXIT = 0;
    private static final int GREAT = 1;
    private static final int EVEN_GAME = 2;
    private static final int CALC_GAME = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION_GAME = 5;
    private static final int PRIME_GAME = 6;

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
        int numGame = scanner.nextInt();
        System.out.println();

        switch (numGame) {
            case EXIT:
                System.out.println("You left the game, come again!");
                break;
            case EVEN_GAME:
                Even.evenGame();
                break;
            case CALC_GAME:
                Calc.calcGame();
                break;
            case GCD_GAME:
                GCD.gcdGame();
                break;
            case PROGRESSION_GAME:
                Progression.gameProgression();
                break;
            case PRIME_GAME:
                Prime.primeGame();
                break;
            case GREAT:
                Cli.getUserName();
            default:
                System.out.println("Choose the right game and try again!");
                break;
        }
    }
}
