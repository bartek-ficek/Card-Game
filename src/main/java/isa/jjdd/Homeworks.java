package isa.jjdd;

import isa.jjdd.models.Card;
import isa.jjdd.models.StandardDeck;

import java.util.ArrayList;
import java.util.Arrays;

public class Homeworks {
    public static void main(String[] args) {
        // TODO: Create comparator and deck objects BF start
//        SomeRandomCardGame game = new SomeRandomCardGame(null, null);
//        game.startGame();

        StandardDeck decka = new StandardDeck();
        System.out.println(decka.draw());

        System.out.println("------------------------------------");
        System.out.println(decka.draw(51));

        System.out.println(decka.draw(decka.size()));

    }
}