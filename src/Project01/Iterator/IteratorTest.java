package Project01.Iterator;

import java.util.Iterator;

public class IteratorTest{
    public static void main(String[] args) {
        Card card1 = new Card(3,SuitEnum.Club);
        Card card2 = new Card(2,SuitEnum.Diamond);
        Card card3 = new Card(4,SuitEnum.Heart);
        Card card4 = new Card(5,SuitEnum.Spade);
        Deck deck = new Deck(10);
        deck.addCard(card1);
        deck.addCard(card2);
        deck.addCard(card3);
        deck.addCard(card4);
        Iterator iterator = deck.iterator();
        while (iterator.hasNext()){
            Card card = (Card)iterator.next();
            System.out.println(card.getNumber());
            System.out.println(card.getSuit());
        }
        Iterator backIt = deck.backIterator();
        while (backIt.hasNext()){
            Card card = (Card)backIt.next();
            System.out.println(card.getNumber());
            System.out.println(card.getSuit());
        }
        Card[] cards = deck.getCards();
        for(int i = 0; i < cards.length;i++){
            System.out.println(cards[i]);
        }



    }


}
