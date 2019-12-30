package numberGuesser;
import java.util.Scanner;
import java.util.Random;

public class NumberGuesser{
	
	private static void numberRun() {
		Scanner input = new Scanner(System.in);
		int randomNumber = randomNumber(); 
		int userNumber = 0;
		int score = 0;
		
		while(true) {
			System.out.println("Guess a number: ");
			userNumber = input.nextInt();
		
		if(userNumber == randomNumber) {
			System.out.println("Wow! You win!");
			
		
		}
		else if(userNumber < randomNumber) {
			score++; 
			System.out.println("The number is higher, guesses made: " + score);
		}
		else if(userNumber > randomNumber) {
			score++;
			System.out.println("The number is lower, guesses made: " + score);
		}
		}
	}
	
	
	private static int randomNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter max number: ");
		int numberMax = input.nextInt();
		return new Random().nextInt(numberMax);
		numberRun();
	}
	
	
	public static void main(String[] args) {
		randomNumber();
		numberRun();
		
		
	}
	}

