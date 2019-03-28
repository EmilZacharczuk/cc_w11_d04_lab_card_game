import java.util.*;

public class Deck {
    private ArrayList<Card> cards;


    public Deck() {
        this.cards = new ArrayList<>();
    }
    public int getCount(){
        return this.cards.size();
    }

    public Card createCard(SuitType suit, RankType rank) {
        Card newCard = new Card(suit, rank);
        return newCard;
    }

    public void populateCards() {
        SuitType[] suits = SuitType.values();
        RankType[] ranks = RankType.values();
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                Card newCard = createCard(suits[i], ranks[j]);
                this.cards.add(newCard);
            }
        }
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public void shuffleCards() {
        Collections.shuffle(this.cards);
    }

    public Card dealCard() {
        return this.cards.remove(0);
    }



}
