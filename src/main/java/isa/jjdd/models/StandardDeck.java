package isa.jjdd.models;

import java.util.*;

public class StandardDeck extends Deck {

    private List<Card> standardDeck;
    private String[] standardRanks;
    private String[] standardSuits;


    public StandardDeck() {
        reset();
    }

    @Override
    public Card draw() {
        Card drawnCard = standardDeck.remove(0);
        return drawnCard;
    }

    @Override
    public List draw(int count) {
        List<Card> drawnCards = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            drawnCards.add(draw());
        }
        return drawnCards;
    }

    @Override
    public void reset() {
        standardDeck = new ArrayList<Card>();
        standardRanks = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        standardSuits = new String[]{"Clubs", "Diamonds", "Hearts", "Spades"};
        for (String rank : standardRanks) {
            for (String suit : standardSuits) {
                this.standardDeck.add(new Card(rank, suit));
            }
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(standardDeck);
    }

    @Override
    public void shuffle(int count) {
        for (int i = 0; i < count; i++) {
            shuffle();
        }
    }

    @Override
    public int size() {
        return standardDeck.size();
    }
}
