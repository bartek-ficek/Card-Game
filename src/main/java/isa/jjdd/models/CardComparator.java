package isa.jjdd.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CardComparator implements Comparator<Card> {

    private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");
    private final Map<String, Integer> mapOfRankPowers;
    private final Map<String, Integer> mapOfSuitPowers;

    public CardComparator() {
        mapOfRankPowers = new HashMap();
        mapOfSuitPowers = new HashMap();
        StandardDeck usefulObject = new StandardDeck();
        final String[] standardRanks = usefulObject.getStandardRanks();
        final String[] standardSuits = usefulObject.getStandardSuits();
        for (int i = 0; i < standardRanks.length; i++) {
            mapOfRankPowers.put(standardRanks[i], (Integer) i);
        }
        for (int j = 0; j < standardSuits.length; j++) {
            mapOfSuitPowers.put(standardSuits[j], (Integer) j);
        }
    }

    @Override
    public int compare(Card o1, Card o2) {
        if (o1.getRank().equals(o2.getRank())) {
            return (mapOfSuitPowers.get(o1.getSuit())) - (mapOfSuitPowers.get(o2.getSuit()));
        }
        return (mapOfRankPowers.get(o1.getRank())) - (mapOfRankPowers.get(o2.getRank()));
    }
}