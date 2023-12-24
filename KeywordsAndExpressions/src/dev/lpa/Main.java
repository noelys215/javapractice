package dev.lpa;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Card[] cardArray = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART, 'A');
        Arrays.fill(cardArray, aceOfHearts);

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts);

        List<Card> acesOfHearts = Collections.nCopies(13, aceOfHearts);

        Card kingOfClubs = Card.getFaceCard(Card.Suit.CLUB, 'K');
        List<Card> kingsOfClubs = Collections.nCopies(13, kingOfClubs);

        List<Card> deck = Card.getStandardDeck();

        Collections.shuffle(deck);

        Collections.reverse(deck);

        var sortedAlgo = Comparator.comparing(Card::rank).thenComparing(Card::suit);
        Collections.sort(deck, sortedAlgo);

        Collections.reverse(deck);

        List<Card> kings = new ArrayList<>(deck.subList(4, 8));

        List<Card> tens = new ArrayList<>(deck.subList(16, 20));

        int subListIndex = Collections.indexOfSubList(deck, tens);

        boolean disjoint = Collections.disjoint(deck, tens);
        deck.sort(sortedAlgo);
        Card tenOfHearts = Card.getNumericCard(Card.Suit.HEART, 10);
        int foundIndex = Collections.binarySearch(deck, tenOfHearts, sortedAlgo);


        Card tenOfClubs = Card.getNumericCard(Card.Suit.CLUB, 10);
        Collections.replaceAll(deck, tenOfClubs, tenOfHearts);

        Collections.replaceAll(deck, tenOfHearts, tenOfClubs);

        System.out.println("Best Card: " + Collections.max(deck, sortedAlgo));
        System.out.println("Worst Card: " + Collections.min(deck, sortedAlgo));

        List<Card> copied = new ArrayList<>(deck.subList(0, 13));
        Collections.rotate(copied, 2);
        System.out.println("UnRotated: " + deck.subList(0, 13));
        System.out.println("Rotated " + 2 + ": " + copied);

    }
}
