/* Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard 
  Example:

	Input: ["Hello", "Alaska", "Dad", "Peace"]
	Output: ["Alaska", "Dad"]
 */
import java.util.*;
public class KeyboardRow {
	
	 static String firstRow = "qwertyuiop";
	 String secondRow = "asdfghjkl";
	 String thirdRow = "zxcvbnm";
	 
	 static char[] firstRowArray = stringToCharArray(firstRow); 
	 char[] secondRowArray = stringToCharArray(secondRow); 
	 char[] thirdRowArray = stringToCharArray(thirdRow); 
	
	  public String[] findWords(String[] words) {
	        
	    }
	  
	  public static char[] stringToCharArray(String stringToConvert) {
		  char [] stringToCharArray = stringToConvert.toCharArray();
	  }
	

	public static void main(String[] args) {
		System.out.println(firstRowArray); 
		}

	}


