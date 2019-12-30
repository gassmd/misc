import java.util.*;

public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if (guessedLetters.contains(letter)) {
        }
        else if (!word.contains(letter)) {
        	numberOfFaults++;  
        	guessedLetters += letter;
        }
        else {
        	guessedLetters += letter;
        }
    }

    public String hiddenWord() {
    	
    	  String hiddenWord = "";
          int i = 0;
          String guessLetter = "";
          while (i < this.word.length()) {
              char guess = this.word.charAt(i);
              guessLetter = Character.toString(guess);
              if (this.guessedLetters.contains(guessLetter)) {
                  hiddenWord += guessLetter;
              } else {
                  hiddenWord += "_";
              }
              i++;
          }
          return hiddenWord;
      }
  }
    
