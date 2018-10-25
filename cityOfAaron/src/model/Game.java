/*
 * The Game() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 *  Team members: Amy Zuniga, Jeremi Lynch, Raylee Haws
 */
package model;
 import java.io.Serializable;
/**
 *
 * @author admin
 */
public class Game implements Serializable {
    private Player thePlayer;
            //type then name
    //always write the typ of the variable at the end 
  
    public Game(){} //empty constuctor for javabean
    
   public void setPlayer(Player thePlayer){
        
        this.thePlayer = thePlayer; //this indicates we pulling name from private variable
    }

    public Player getPlayer() // when its a void don't write anything in ()
    {
          return thePlayer; //does not take anything from user 
    }  
}
