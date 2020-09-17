package isa.jjdd;

import isa.jjdd.models.CardComparator;
import isa.jjdd.models.StandardDeck;


public class Homeworks {
    public static void main(String[] args) {
        StandardDeck standardDeck = new StandardDeck();
        CardComparator cardcomparator = new CardComparator();

        SomeRandomCardGame game = new SomeRandomCardGame(cardcomparator, standardDeck);
        game.startGame();

    }
}