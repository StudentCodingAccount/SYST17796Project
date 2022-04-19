/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */

package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 * @modifier Ethan Dao
 */
public abstract class Card {
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    private final CARDVALUE = {0,1,2,3,4,5,6,7,8,9};
    private final CARDTYPE = {Red,Blue,Green,Yellow};
    
    private String cardValue
    private String cardType;
    
    public void setCard(int cardValue, int cardType){
        
        if(cardValue>CARDVALUE.length){cardValue = 0;}
        if(cardType>CARDTYPE.length){cardtype = 0}
        
        this.cardValue = CARDVALUE[cardValue];
        this.cardType = CARDTYPE[cardType];
        
    }
    
    @Override
    public abstract String toString();

}
