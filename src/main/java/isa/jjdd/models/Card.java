package isa.jjdd.models;

import java.util.Objects;

/**
 * The class constitutes single card from most common pack of playing cards used today.
 * Each card is {@code Object} represented by its own rank and suit.
 */

public class Card {

    /**
     * The rank of the card represented by String.
     * One of the two major attribute of Card.
     */
    private final String rank;

    /**
     * The suit of the card represented by String.
     * One of the two major attribute of Card.
     */
    private final String suit;

    /**
     * Constructs single Card with the specified
     * rank and suit.
     *
     * @param rank    rank of the card created
     * @param suit    suit of the card created
     */
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Return the rank of card object
     *
     * @return rank of the card object
     */
    public String getRank() {
        return rank;
    }

    /**
     * Return the suit of card object
     *
     * @return suit of the card object
     */
    public String getSuit() {
        return suit;
    }

    /**
     * Returns a string representation of Card. It contains
     * the String representation of each field (rank & suit)
     */
    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    /**
     * Compares the specified object with this card for equality. Returns
     * {@code true} if and only if the specified object is also a card
     * and all corresponding pairs of elements in
     * the two card are <i>equal</i>.  (Two elements {@code e1} and
     * {@code e2} are <i>equal</i> if {@code Objects.equals(e1, e2)}.)
     * In other words, two card are defined to be
     * equal if they contain the same elements in the same order.
     *
     * @param o the object to be compares for equality with this card
     * @return {@code true} if the argument is equal to this card object
     * and {@code false} otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return Objects.equals(rank, card.rank) &&
                Objects.equals(suit, card.suit);
    }

    /**
     * Return a hash code value for the card object.
     * The hash code is generated on a basis of rank and suit attributes.
     *
     * @return hash code value for card object
     */
    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }
}

