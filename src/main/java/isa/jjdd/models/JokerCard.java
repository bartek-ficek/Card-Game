package isa.jjdd.models;

import java.util.Objects;

public class JokerCard extends Card {


    public JokerCard(String rank, String suit) {
        super(rank, suit);
    }

    @Override
    public String getRank() {
        return super.getRank();
    }

    @Override
    public String getSuit() {
        return super.getSuit();
    }

    @Override
    public String toString() {
        return suit + " " + rank;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
