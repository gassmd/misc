import java.util.*; 

public class Deck {

    private static Scanner input = new Scanner(System.in);
    private static Random newRan = new Random();

    private static final List RANKS = new ArrayList(Arrays.asList("ace", 2, 3, 4, 5, 6, 7, 8, 9,
            10, "jack", "queen", "king"));
    private static final List SUITS = new ArrayList(Arrays.asList("hearts", "diamonds", "clubs",
            "spades"));

    private static List makeDeck() {
        List result = new ArrayList();
        for (Object i : SUITS) {
            for (Object j : RANKS) {
                result.add(Arrays.asList(i, j));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List deck = makeDeck();

        for (Object i : deck) {
            System.out.println(i);
        }
    }
}