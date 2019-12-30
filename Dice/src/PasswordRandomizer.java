import java.util.Random;

public class PasswordRandomizer {
    private String alphabets = "abcdefghijklmnopqrstuvwxyz";
    private Random random = new Random();
    private int length;

    public PasswordRandomizer(int length) {
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
      int i = 0;
      int charPosition;
      String password = "";
      while (i < this.length) {
    	  charPosition = random.nextInt(alphabets.length()); 
    	  password += alphabets.charAt(charPosition); 
    	  i++;
      }
      return password;
    }
}
    