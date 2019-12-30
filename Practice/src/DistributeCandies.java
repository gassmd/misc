
public class DistributeCandies {
	
	    public static int distributeCandies(int[] candies) {
	    	int num = 0;
	    	for (int i=0; i<candies.length; i++) {
	    		for (int j = 1; j<candies.length; j++) {
	    			if (candies[i] == candies [j]) {
	    				num++;
	    			}
	    		}
	    	}
	    	System.out.println(num);
	    	return num; 
	    	
	    }
	

	public static void main (String[] args) {
		int[] test = {1,1,2,2,3,3};
		int[] test1 = {1,1,2,3};
		distributeCandies(test);
		
	}
 }
