import java.util.*;

public class Player {
	
	 private String name, position; 
	 private int rank; 
	 
	 public Player(String name, String position, int rank) { 
		 
		 this.name = name;
		 this.position = position;
		 this.rank = rank; 
	 }
	 
	 public String getName() {
		 return name; 
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getPosition() {
		 return position; 
	 }
	 public void setPosition(String position) {
		 this.position = position;
	 }
	 public int getRank() {
		 return rank;
	 }
	 public void setRank(int rank) {
		 this.rank = rank; 
	 }
	 public String toString() {
		 return "Player: " + name + "," + position + "; RANK: " + rank; 
	 }
}

