// @author Maddison Kiefer

public class Cards {
    private final String suit;
    private final String faceValue;

    // Constructor for the class
    public Cards(String suit, String faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }
    
    // Getter for the suit
    public String getSuit() {
        return suit;
    }
    
    // Getter for the faceValue
    public String getFaceValue() {
        return faceValue;
    }

    @Override
    public String toString() {
        return faceValue + " of " + suit;
    }
}
