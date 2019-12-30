import java.util.*;

public class RockPaperScissors {
	
	public static int opponentChoice() {
		
		Random rand = new Random();
		return rand.nextInt(3); 
		
	}
	
	public static int userChoice() {
		System.out.println("Welcome to Rock Paper Scissors");
		System.out.println("Enter R for Rock, P for Paper, S for Scissors!");
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine(); 
		switch(userInput) {
		
		case "R":
			return 0;
		case "P":
			return 1;
		case "S":
			return 2;
		}
		return 3;
	}
	
	public static boolean winCheck(int userChoice, int opponentChoice) {
		if (userChoice == opponentChoice) {
			return false;
		}
		else if (userChoice == 0 && opponentChoice == 1) {
			return false;
		}
		else if (userChoice == 0 && opponentChoice == 2) {
			return true;
		}
		else if (userChoice == 1 && opponentChoice == 0) {
			return true;
		}
		else if (userChoice == 1 && opponentChoice == 2) {
			return false;
		}
		else if (userChoice == 2 && opponentChoice == 0) {
			return false;
		}
		else if (userChoice == 2 && opponentChoice == 1) {
			return true; 
		}
		else {
			return true;
	}
	}
	
	public static String toString(int num) {
		
		if (num == 0) {
			return "Rock";
		}
		else if (num == 1) {
			return "Paper";
		}
		else  {
			return "Scissors";
		}
	}
	
	public static void main (String[] args) {
		int opponent = opponentChoice();
		
		if(userChoice() == opponent) {
			System.out.println("Opponent picked " + toString(opponent));
			System.out.println("You tied!");
		}
		
		else if (winCheck(userChoice(), opponent)) {
			System.out.println("Opponent picked " + toString(opponent)); 
			System.out.println("You win!");
		}
		else {
			System.out.println("Opponent picked " + toString(opponent)); 
			System.out.println("You lose!"); 
		}
		 
		
	}
	
}