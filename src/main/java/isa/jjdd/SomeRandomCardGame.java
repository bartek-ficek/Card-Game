package isa.jjdd;

import isa.jjdd.models.Card;
import isa.jjdd.models.Deck;
import isa.jjdd.models.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;

public class SomeRandomCardGame {
    private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");
    private static final int PLAYER_CARDS = 5;
    private static final int SHUFFLE_COUNT = 3;

    private final Comparator<Card> comparator;
    private final Deck<? extends Card> deck;

    public SomeRandomCardGame(Comparator<Card> comparator, Deck<? extends Card> deck) {
        this.comparator = comparator;
        this.deck = deck;
    }

    public void startGame() {
        STDOUT.info("Started some random card game!\n");

        deck.shuffle(SHUFFLE_COUNT);
        STDOUT.info(String.format("Deck was shuffled %d times\n", SHUFFLE_COUNT));

        Player player1 = new Player();
        player1.setCards(deck.draw(PLAYER_CARDS));
        STDOUT.info(String.format("Player 1 drawn %d cards\n", PLAYER_CARDS));

        Player player2 = new Player();
        player2.setCards(deck.draw(PLAYER_CARDS));
        STDOUT.info(String.format("Player 2 drawn %d cards\n", PLAYER_CARDS));

        for (int i = 0; i < PLAYER_CARDS; i++) {
            Card player1Card = player1.getNextCard();
            Card player2Card = player2.getNextCard();

            STDOUT.info(String.format("Player 1 card: %s\n", player1Card.toString()));
            STDOUT.info(String.format("Player 2 card: %s\n", player2Card.toString()));

            int result = comparator.compare(player1Card, player2Card);

            if (result > 0) {
                STDOUT.info("Player 1 scored a point\n");
                player1.score();
            } else {
                STDOUT.info("Player 2 scored a point\n");
                player2.score();
            }
        }

        if (player1.getPoints() > player2.getPoints()) {
            STDOUT.info("Player 1 WINS!\n");
        } else {
            STDOUT.info("Player 2 WINS!\n");
        }
    }
}
