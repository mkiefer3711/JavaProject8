// @Maddison Kiefer

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
    private final List<Cards> cards;
    
    // Constructor for the class
    public Deck() {
        cards = new ArrayList<>();
        // Creating the arrays
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] faceValues = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        
        // Creates a deck for all possible combinations of the suits and faceValues
        for (String suit : suits) {
            for (String faceValue : faceValues) {
                cards.add(new Cards(suit, faceValue));
            }
        }
    }
    
    // Displays all of the cards in the deck
    public void displayDeck() {
        for (Cards card : cards) {
            System.out.println(card);
        }
    }
    
    // Shuffles the deck using Collections.shuffle
    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    // Getter method to get the list of cards in the deck
    public List<Cards> getCards() {
        return cards;
    }
}
