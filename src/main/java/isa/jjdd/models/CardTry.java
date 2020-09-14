package isa.jjdd.models;

public class CardTry<T extends CardTry> {
    public String suit;
    public int rank;

    @Override
    public String toString() {
        return rank + " of " + suit;
    }


    class SpadesTry extends CardTry {
        public SpadesTry() {
            suit = "Spades";
        }
    }

    class TwoTry extends SpadesTry {
        public TwoTry() {
            super();
            rank = 2;
        }
    }

    class ThreeTry extends SpadesTry {
        public ThreeTry() {
            super();
            rank = 3;
        }
    }
}


