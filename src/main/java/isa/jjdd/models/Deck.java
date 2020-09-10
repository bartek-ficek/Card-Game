package isa.jjdd.models;

import java.util.List;

/**
 * A collection of cards that can be drawn from it and shuffled in a random order.
 *
 * @param <T> type of cards in a deck
 */
public abstract class Deck<T extends Card> {

    /**
     * Empty constructor, calls reset() method.
     * Deck should have it's default value set when created.
     */
    Deck() {
        reset();
    }

    /**
     * Draw a first card from deck and remove it.
     *
     * @return first card from deck
     */
    public abstract T draw();

    /**
     * Draw n first cards from deck and remove them.
     *
     * @param count number of cards
     * @return list of n first cards from deck
     */
    public abstract List<T> draw(int count);

    /**
     * Restore a deck to it's default value.
     */
    public abstract void reset();

    /**
     * Shuffle a deck to a random order.
     */
    public abstract void shuffle();

    /**
     * Shuffle a deck to a random order n-times.
     *
     * @param count number of times to shuffle
     */
    public abstract void shuffle(int count);

    /**
     * Number of cards in deck.
     *
     * @return number of cards
     */
    public abstract int size();
}
