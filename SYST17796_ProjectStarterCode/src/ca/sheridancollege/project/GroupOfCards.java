/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Ethan Dao Apr 2022
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
    private int size;//the size of the grouping

    public GroupOfCards(int size) {
        this.size = size;
    }
    
    public GroupOfCards(){
    
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    public void removeCard(int cardValue){
        cards.remove(cardValue);
    }
    
    public void addCard(card cardAdded){
        cards.add(cardAdded);
    }
    
    private void createDeck(int noOfDecks){
        card input = new card();
        cards.clear();
        size=noOfDecks*40;
        for(int i=0;i<noOfDecks;i++){
            for(int x=0;x<4;x++){
                for(int y=0;y<9;y++){
                    input.setCard(y,x);
                    cards.add(input);
                }
            }
        }
    }

}//end class
