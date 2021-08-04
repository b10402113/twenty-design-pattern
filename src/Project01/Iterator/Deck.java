package Project01.Iterator;

import java.util.Iterator;

public class Deck implements Aggregate{
    private Card[] cards;

    private int last = 0;

    public Deck(int maxsize){
        this.cards = new Card[maxsize];
    }

    public Card[] getCards() {
        return cards;
    }

    public void addCard(Card card){
        this.cards[last++] = card;
    }

    public Card getCardByIndex(int index){
        return cards[index];
    }

    public int getLength() {
        return last;
    }

    /**
     * iterator
     */
    public Iterator iterator(){
        return new DeckIterator(this);
    }

    public Iterator backIterator(){
        return new BackDeckIterator(this);
    }

}
