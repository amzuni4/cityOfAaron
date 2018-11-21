package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Animal {
    
    private String animal;
    private int number;
    
//    public String[] Animal(String animal, int number){
//        return String[animal, number];
//    }
    
    public void setAnimal(String animal){
        
        this.animal = animal; 
    }
   
   public String getAnimal()
    {
          return animal;  
    }  
    
     public void setNumber(int number){
        
        this.number = number;
   }  
        
   public int getNumber()
    {
          return number;  
    }  
}