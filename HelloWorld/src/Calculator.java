import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		int[] numbers = nums(); 
		System.out.println("Test: " + Arrays.toString(numbers));
		operation();
		execution();
	}
		
		public static int[] nums() {
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter first number: ");
			int num1 = Integer.parseInt(reader.nextLine()); 
			System.out.print("Enter next number: ");
			int num2 = Integer.parseInt(reader.nextLine()); 
			int[] numbers = {num1, num2};
			return numbers;
	}
		public static String operation() {
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter operation (' +, -, *, /'");
			String operation = reader.nextLine();
			return operation; 
		}
		public static void execution() {
			if (operation() == ("+")){
				System.out.println("It is plus");
			}
			else {
				System.out.println("it is not plus");
			}
		}

}
