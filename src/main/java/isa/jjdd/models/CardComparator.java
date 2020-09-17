package isa.jjdd.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CardComparator implements Comparator<Card> {

    private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");
    private final Map<String, Integer> MAP_OF_RANK_POWERS;
    private final Map<String, Integer> MAP_OF_SUIT_POWERS;

    public CardComparator() {
        MAP_OF_RANK_POWERS = new HashMap();
        MAP_OF_SUIT_POWERS = new HashMap();
        StandardDeck usefulObject = new StandardDeck();
        final String[] standardRanks = usefulObject.getStandardRanks();
        final String[] standardSuits = usefulObject.getStandardSuits();
        for (int i = 0; i < standardRanks.length; i++) {
            MAP_OF_RANK_POWERS.put(standardRanks[i], (Integer) i);
        }
        for (int j = 0; j < standardSuits.length; j++) {
            MAP_OF_SUIT_POWERS.put(standardSuits[j], (Integer) j);
        }
    }

    @Override
    public int compare(Card o1, Card o2) {
        if (o1.getRank().equals(o2.getRank())) {
            return (MAP_OF_SUIT_POWERS.get(o1.getSuit())) - (MAP_OF_SUIT_POWERS.get(o2.getSuit()));
        }
        return (MAP_OF_RANK_POWERS.get(o1.getRank())) - (MAP_OF_RANK_POWERS.get(o2.getRank()));
    }
}