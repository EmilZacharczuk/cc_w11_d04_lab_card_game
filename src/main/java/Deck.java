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


        /*
        public static int[] RandomizeArray(int[] array){
        Random rgen = new Random();  // Random number generator

        for (int i=0; i<array.length; i++) {
            int randomPosition = rgen.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }

        return array;
    }
        * */



    }
}
