// Print numbers 1-100, for all divisible by 3 print Fizz, divis by 5 print Buzz, 3 and 5 FizzBuzz
public class FizzBuzz {

	public static void main (String[] args) {
		
		for (int i = 1; i<=100; i++) {
			if (i%15==0) {		// could also do (i%3==0&i%5==0)
				System.out.println(i + " Fizz Buzz"); 
			}
			else if (i%3==0) {
				System.out.println(i+" Fizz");
			}
			else if (i%5==0) {
				System.out.println(i + " Buzz");
			}
			else {
			
			System.out.println(i);
		}
		}
	}
}

