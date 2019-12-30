package numberReader;

import java.util.Scanner;

public class NumberReader {
  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);

    System.out.println("Type numbers, input -1 when you are finished: ");

    int sum = 0;
    int numInput = 0;
    int numCount = -1;
    double average = 0;
    int numEven = 0;
    int numOdd = -1;

    while(true){
      sum += numInput;
      numInput = Integer.parseInt(input.nextLine());
      numCount++;
      average = (double)sum / numCount;

      if(numInput % 2 == 0){
        numEven++;
    }
      if(numInput % 2 != 0){
        numOdd++;
    }

      if(numInput == -1){

          System.out.println("Thanks! See you later!");
          System.out.println("The sum is " + sum);
          System.out.println("How many numbers : " + numCount);
          System.out.println("The average is " + average);
          System.out.println("Even numbers: " + numEven);
          System.out.println("Odd numbers: " + numOdd);
          break;
      }
    }
  }
}
