public class SumArray {
	    public static void main(String[] args) {
	        int[] array = {5, 1, 3, 4, 2};
	        printElegantly(array);
	    }

	    public static void printElegantly(int[] array) {
	    	for (int i : array) {
	        	System.out.print(i + ", "); 
	        	if ( i == 2) {
	        		System.out.print(i);
	        	}
	        }
	    }
	}
	  