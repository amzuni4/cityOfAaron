/*
/* The main() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 *  Team members: Amy Zuniga, Jeremi Lynch, Raylee Haws
 */
package model;

/**
 *
 * @author admin
 */
public enum Fruits {
    APPLE("Apple", "red"),   
    BANANA("Banana", "yellow"), 
    PLUMB("Plumb", "purple");
    
    
    //data members
    private String name;
   private String color;
   
   Fruits(String name, String color)
   {
       this.name = name; //assigning a value for name
       this.color = color; 
   }

// The getName() method
    // Purpose: returns the value stored in name
    // Parameters: none
    // Returns: the value stored in name
    public String getName()
    {
        return name;
    }

}