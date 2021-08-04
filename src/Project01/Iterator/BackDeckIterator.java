package Project01.Iterator;

import java.util.Iterator;

public class BackDeckIterator implements Iterator {
    private Deck deck;
    private int index;
    public BackDeckIterator(Deck deck){
        this.deck = deck;
        this.index = deck.getLength() - 1;
    }

    @Override
    public boolean hasNext() {
        if(index >= 0){
            return  true;
        }
        return false;
    }

    @Override
    public Object next() {
        Card card = deck.getCardByIndex(index);
        index--;
        return card;
    }
}
