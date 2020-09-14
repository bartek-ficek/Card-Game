package isa.jjdd.models;

public class Card <T extends Card, E extends Card.Spades> {
    //TODO Im not sure <T> above in class card. I added, but only to test.
    public String suit;
    public int rank;

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
    //    public Card() {
//        this.suit = null;
//        this.rank = 0;
//    }
    //TODO Do I need constructor above?

    public class Spades extends Card {
        public Spades() {
            suit = "Spades";
        }
    }
    public class Two extends Spades {
        public Two() {
            super(suit);
            rank = 2;
        }
    }
    public class Three extends Spades {
        public Three() {
            super();
            rank = 3;
        }
    }

}

// TODO: implement Card class

