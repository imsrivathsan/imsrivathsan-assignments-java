package Constructsbasics;
import java.util.*;
import static java.lang.Math.*;
import java.lang.String.*;
public class rockpaperscissors {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		 Random random = new Random();

	        System.out.print("Shall we play rock, paper, or scissors? (yes/no): ");
	        String playGame = sc.nextLine();

	        if (playGame.equalsIgnoreCase("yes")) {
	            // Play
	            System.out.print("Please enter rock, paper, or scissors: ");
	            String playerChoice = sc.nextLine().trim().toLowerCase();

	            if (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors")) {
	                int computerChoice = random.nextInt(3); // 0 for rock, 1 for paper, 2 for scissors

	                String[] choices = {"rock", "paper", "scissors"};
	                String computer = choices[computerChoice];

	                String result;
	                if (playerChoice.equals(computer)) {
	                    result = "Tie game!";
	                } else if ((playerChoice.equals("rock") && computer.equals("paper")) ||
	                           (playerChoice.equals("paper") && computer.equals("scissors")) ||
	                           (playerChoice.equals("scissors") && computer.equals("rock"))) {
	                    result = "Computer wins!";
	                } else {
	                    result = "Player wins!";
	                }

	                System.out.println("playerOne: " + playerChoice);
	                System.out.println("Computer: " + computer);
	                System.out.println(result);

	                System.out.print("Play Again? (yes/no): ");
	                String playAgain = sc.nextLine();

	                if (playAgain.equalsIgnoreCase("yes")) {
	                    main(args); // Restart the game
	                } else {
	                    System.out.println("Ok, thanks for playing.");
	                }
	            } else {
	                System.out.println("You didn't enter rock, paper, or scissors.");
	            }
	        } else {
	            System.out.println("Ok, maybe next time.");
	        }
	    }
	
}
