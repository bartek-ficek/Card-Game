package isa.jjdd.models;

import java.util.List;
import java.util.Stack;

public class Player {
    private Stack<Card> cards;
    private int points;

    public Card getNextCard() {
        return cards.pop();
    }

    public void setCards(List<? extends Card> cards) {
        this.cards = new Stack<>();
        this.cards.addAll(cards);
    }

    public int getPoints() {
        return points;
    }

    public void score() {
        points++;
    }
}
