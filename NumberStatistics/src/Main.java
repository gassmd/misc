import java.util.*;
public class Main {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics sumOdd = new NumberStatistics();
        NumberStatistics sumEven = new NumberStatistics();
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: "); 
        while(true) {
        	int number = reader.nextInt();     
        if (number == -1) {
        	break;
        	}
        if (number%2!=1) {
        	stats.addNumber(number);
        	sumEven.addNumber(number);
        }
        if (number%2==1) {
        	stats.addNumber(number);
        	sumOdd.addNumber(number);
        }
      }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + sumEven.sum());
        System.out.println("sum of odd: " + sumOdd.sum());
    }
}

    