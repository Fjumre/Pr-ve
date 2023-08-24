import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "rock", "paper", "scissors" };

        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.print("Enter your choice: rock, paper, scissors:\n");
        String playerChoice = scanner.nextLine().toLowerCase();

        int computerChoiceIndex = random.nextInt(3);
        String computerChoice = choices[computerChoiceIndex];

        System.out.println("Computer chooses: " + computerChoice);

        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (
                (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                        (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                        (playerChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }
}