// @Maddison Kiefer


public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        
        // Displays the unshuffled deck
        System.out.println("Unshuffled Deck:");
        deck.displayDeck();
        
        // Calls the function to shuffle the deck
        deck.shuffleDeck();
        
        // Displays the shuffled deck
        System.out.println("\nShuffled Deck:");
        deck.displayDeck();
    }
}
