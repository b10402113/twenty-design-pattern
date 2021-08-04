package Project01.Iterator;

import java.util.Iterator;

public class DeckIterator implements Iterator {
    private Deck deck;
    private int index;
    public DeckIterator(Deck deck){
        this.deck = deck;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < deck.getLength()){
            return  true;
        }
        return false;
    }

    @Override
    public Object next() {
        Card card = deck.getCardByIndex(index);
        index++;
        return card;
    }
}
