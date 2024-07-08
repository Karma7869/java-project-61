package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter. \n1 - Greet \n2 - Even \n3 - Calc \n4 - GCD \n5 - Progression \n6 - Prime \n0 - Exit");
        System.out.print("Your choice: ");
        int numGame = scanner.nextInt();

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
