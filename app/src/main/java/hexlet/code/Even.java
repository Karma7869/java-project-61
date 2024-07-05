package hexlet.code;

public class Even {
    public static void evenGame() {
        String userName = Cli.getUserName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {
            int randomNum = (int) (Math.random() * 10);
            System.out.println("Question: " + randomNum);
            String answerToQuestion = Cli.getUserAnswer();

            String userAnswer = "";

            if (answerToQuestion.equals("yes") && randomNum % 2 == 0) {
                userAnswer = "yes";
                System.out.println("Correct!");
            } else if (answerToQuestion.equals("no") && randomNum % 2 != 0) {
                userAnswer = "no";
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answerToQuestion + "' is wrong answer ;(. Correct answer was '" + userAnswer + "'");
                System.out.println("Let's try again," + userAnswer + "!");
                break;
            }

            if (i == 2) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
