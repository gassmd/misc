import java.util.*;

public class FIrstRecurring {
	public static ArrayList<Integer> lengths(ArrayList<String> list) {
		ArrayList<Integer> listLength = new ArrayList<Integer>(); {
			for (String words:list) {
				listLength.add(words.length());
			}
			return listLength; 
		}
	}
	public static String newWord(ArrayList<String> list) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter new string: ");
		String newString = reader.nextLine(); 
		return newString; 
	}
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
	    ArrayList<String> list = new ArrayList<String>();
	    list.add("Hallo");
	    list.add("Moi");
	    list.add("Benvenuto!");
	    list.add("badger badger badger badger");
	    ArrayList<Integer> lengths = lengths(list);

	    System.out.println("The lengths of the Strings: " + lengths);
	    System.out.print("Add new string? (Y/N): ");
	    String response = reader.nextLine();
	    if (response.equals("Y")){
	    	newWord(list); 
	    	lengths(list);
	    }
	    else {
	    	System.out.print("Fuck you then");
	    }
	}
}
	    