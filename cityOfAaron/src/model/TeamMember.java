/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author admin
 */
import java.io.Serializable;

public enum TeamMember implements Serializable{
    
    MEMBER1("Amy", "Gollum"),   
    MEMBER2("Jeremi", "Sam"), 
    MEMBER3("Raylee", "Frodo");
    //data members
    private String name;
    private String title;
    
    
    TeamMember(String name, String title)
   {
       this.name = name; //assigning a value for name
       this.title= title; 
   }

// The getName() method
    // Purpose: returns the value stored in name
    // Parameters: none
    // Returns: the value stored in name
    public String getName()
    {
        return name;
    }
    public String getTitle()
    {
        return title;
    }
    
}