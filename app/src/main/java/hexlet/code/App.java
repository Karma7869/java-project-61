package hexlet.code;

public class App {
    public static void main(String[] args) {
        int numGame = Cli.getGameChoice();

        if (numGame == 2) {
            Even.evenGame();
        } else if (numGame == 1) {
            Cli.getUserName();
        }
    }
}
