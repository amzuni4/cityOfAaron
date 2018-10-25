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
public enum TeamMember {
    
    MEMBER1("Amy", "12/6"),   
    MEMBER2("Jeremi", "Victory"), 
    MEMBER3("Raylee", "Singer");
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