/*
/* The Crop Data class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 *  Individual Assignment by Amy Zuniga
 */
package model;
import java.io.Serializable;
/**
 *
 * @author admin
 */
public class CropData implements Serializable{
    private int year;
    private int population;
    private int acresOwned;
    private int cropYield;
    private int wheatInStore;   //creating insnatce variables for private ints
    private int numberWhoDied;
    private int newPeople;
    private int harvest;
    private int wheatForFood;
    private int acresPlanted;
    private int wheatForPeople;
  
    public CropData(){} //empty constuctor for javabean
    
     
   public void setYear(int year){
        
        this.year = year; //this indicates we pulling name from private variable
    }

    public int getYear() // when its a void don't write anything in ()
    {
          return year; //does not take anything from user 
    }  

    public void setPopulation(int population){ 
        
        this.population = population;
        }
    public int getPopulation(){
        return population; 
    }
        public void  setAcresOwned(int acresOwned){
             this.acresOwned = acresOwned;
    }
        public int getAcresOwned(){
            return acresOwned;
            }
     public void setCropYield(int cropYield){
            this.cropYield = cropYield;
           }
    public int getCropYield(){
        return cropYield;
    }
    public void setWheatInStore(int wheatInStore){
        this.wheatInStore = wheatInStore;
    }
    public int getWheatInStore(){
        return wheatInStore;
    }
    public void setNumberWhoDied(int numberWhoDied){
        this.numberWhoDied = numberWhoDied;
    }
    public int getNumberWhoDied(){
        return numberWhoDied;
    }
    public void setNewPeople(int newPeople){
        this.newPeople = newPeople;
    }
    public int getNewPeople(){
        return newPeople;
    }
    public void setHarvest(int harvest){
        this.harvest = harvest;
    }
    public int getHarvest(){
        return harvest;
    }
    public void setWheatForFood(int wheatForFood){
        this.wheatForFood = wheatForFood;
    }
    public int getWheatForFood(){
        return wheatForFood;
    }
    public void setAcresPlanted(int acresPlanted){
        this.acresPlanted = acresPlanted;
    }
    public int getAcresPlanted(){
        return acresPlanted;
    }
    
    public void setWheatForPeople(int wheatForPeople){
        this.wheatForPeople = wheatForPeople;
    }
        public int getWheatForPeople(){
            return wheatForPeople;
        }
}