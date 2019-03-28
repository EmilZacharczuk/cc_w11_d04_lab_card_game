import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {
    Deck deck;



    @Before
    public void before(){
        this.deck = new Deck();
    }

    @Test
    public void emptyCardsArray() {
        assertEquals(0, deck.getCount());
    }

    @Test
    public void canCreateCard() {
        Card testCard = deck.createCard(SuitType.HEARTS, RankType.ACE);
        assertEquals(SuitType.HEARTS, testCard.suit());
        assertEquals(RankType.ACE, testCard.rank());
    }

    @Test
    public void canPopulateCardDeck(){
        deck.populateCards();
        assertEquals(52, deck.getCount());
    }

    @Test
    public void canGetCards() {
        deck.populateCards();
        assertEquals(52, deck.getCards().size());
    }

    @Test
    public void canShuffleCards(){
        deck.populateCards();
        Card actualCard = deck.getCards().get(0);
        deck.shuffleCards();
        Card expectedCard = deck.getCards().get(0);
        assertNotEquals(expectedCard.rank(), actualCard.rank());
    }
}
