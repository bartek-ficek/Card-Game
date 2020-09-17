package isa.jjdd.models;

import java.util.*;

public class StandardDeck extends Deck {

    private List<Card> standardDeck;
    private List<JokerCard> jokers;
    private String[] standardRanks;
    private String[] standardSuits;


    public StandardDeck() {
        reset();
    }

    public String[] getStandardRanks() {
        return standardRanks;
    }

    public String[] getStandardSuits() {
        return standardSuits;
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
        standardRanks = new String[]
                {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        standardSuits = new String[]
                {"Spades", "Clubs", "Diamonds", "Hearts"};

        for (String rank : standardRanks) {
            for (String suit : standardSuits) {
                this.standardDeck.add(new Card(rank, suit));
            }
        }
        jokers = new ArrayList<JokerCard>();
        jokers.add(new JokerCard("JOKER","Black"));
        jokers.add(new JokerCard("JOKER","Red"));
        standardDeck.addAll(jokers);
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
