/*
 * The player() class file for the cityOfAaron project
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
public class Player implements Serializable {
    private String name;
    
    
  
    public Player(){} //empty constuctor for javabean
    
   public void setName(String name){
        
        this.name = name; //this indicates we pulling name from private variable
    }

    public String getName() // when its a void don't write anything in ()
    {
          return name; //does not take anything from user 
    }  
   
}