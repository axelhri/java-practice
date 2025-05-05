import java.util.Random;
import java.util.Scanner;

public class rps {
    public static void main(String[] args) {

        Random random = new Random();

        System.out.println("Rock Paper Scissors");
        System.out.println("-------------------");

        Scanner input = new Scanner(System.in);

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {

        System.out.println("Rock Paper Scissors Game");
        System.out.println("Enter your choice : ");

        playerChoice = input.nextLine().toLowerCase();
        computerChoice = choices[random.nextInt(1,3)];

        if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
            System.out.println("Invalid choice");
            continue;
        }

        if (playerChoice.equals(computerChoice)) {
            System.out.println("Tie");
        } else if (playerChoice.equals("rock") && computerChoice.equals("scissors") || playerChoice.equals("scissors") && computerChoice.equals("paper") || playerChoice.equals("paper") && playerChoice.equals("rock")) {
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }

        System.out.println("Computer choice : " + computerChoice);
        System.out.print("Play again (yes/no)");
        playAgain = input.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing !");

        input.close();
    }
}
