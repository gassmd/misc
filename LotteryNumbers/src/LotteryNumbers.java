import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private int min = 1;
    private int max = 39;
    private Random random = new Random();
    private int lotteryLength = 7; 
    
    public LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        int i = 0;
        int lottery = 0;
        while (i < lotteryLength) {
        	lottery = random.nextInt(max)+min; 
        	if(!containsNumber(lottery)) {
        		this.numbers.add(lottery);
        		i++; 
        	}
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number); 
        	}
        }
    

        
    

    