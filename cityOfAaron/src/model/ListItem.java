/*
 * The ListItem() class file for the Individual Assignment
 * CIT-260
 * Fall 2018
 *  Author: Raylee Haws
 */
package model;

public class ListItem {
    
    private String name;
    private int number;
  
   // initializes a general class
 public ListItem (String name, int number) // its all the items in the list for animals list
 {
     
     setName(name); // calls the pre-created function in the class
     setNumber(number);
 }

   
        
   public void setName(String name){
        
        this.name = name; 
    }
   
   public String getName()
    {
          return name;  
    }  
       
   public void setNumber(int number){
        
        this.number = number;
   }  
        
   public int getNumber()
    {
          return number;  
    }  
   
   
            
}
