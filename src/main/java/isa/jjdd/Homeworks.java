package isa.jjdd;

import isa.jjdd.models.Card;
import isa.jjdd.models.CardTry;

public class Homeworks {
    public static void main(String[] args) {
        // TODO: Create comparator and deck objects BF start
//        SomeRandomCardGame game = new SomeRandomCardGame(null, null);
//        game.startGame();

        Card.Spades spades = new Card().new Spades();
        System.out.println(spades.toString());

        Card.Spades.Two twoOfSpades = spades.new Two();
        System.out.println(twoOfSpades.toString());

        Card.Spades.Three threeOfSpades = spades.new Three();
        System.out.println(threeOfSpades.toString());

        Card<Card.Spades, Card.Two> tumturu = new Card<>(new Card);


    }
}