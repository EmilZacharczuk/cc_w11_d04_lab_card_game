import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before

    public void before() {
        card = new Card(SuitType.CLUBS, RankType.ACE);

    }
    @Test
    public void hasSuit() {
        assertEquals(SuitType.CLUBS, card.suit());

    }
    @Test
    public void hasRank() {
        assertEquals(RankType.ACE, card.rank());
    }
}
