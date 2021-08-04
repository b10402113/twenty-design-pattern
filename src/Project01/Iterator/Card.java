package Project01.Iterator;

public class Card {
    private Integer number;
    private Enum<SuitEnum> suit;

    public Card(Integer number, Enum<SuitEnum> suit) {
        this.number = number;
        this.suit = suit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Enum<SuitEnum> getSuit() {
        return suit;
    }

    public void setSuit(Enum<SuitEnum> suit) {
        this.suit = suit;
    }

}
