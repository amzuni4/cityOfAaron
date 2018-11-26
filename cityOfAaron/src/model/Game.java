/*
 * The Game() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 *  Team members: Amy Zuniga, Jeremi Lynch, Raylee Haws
 */
package model;
 import java.io.Serializable;
import cityofaaron.CityOfAaron;
import java.util.ArrayList;
import model.Map;
/**
 *
 * @author admin
 */
public class Game implements Serializable {
    //private variables
    private Map theMap;
    private Player thePlayer;
    private CropData theCropData;
    //written by Amy Zuniga
    // Nov. 23 2018
    private ArrayList<ListItem> animal;
    //written by Jeremi Lynch
    // Nov. 26 2018
    
    private ArrayList<ListItem> tool;
    
    //written by Raylee Haws
    // Nov. 26 2018
    
    private ArrayList<ListItem> provision;
            //type then name
    //always write the typ of the variable at the end 
    
    
    //default constructor
    public Game(){} //empty constuctor for javabean
    
    //setter and getters
    //The Game class needs to hold a reference to the Map object that gets created.
    public void setMap(Map theMap){
        this.theMap = theMap;
    }
    
    public Map getMap(){
       return theMap; 
    }
    
   public void setPlayer(Player thePlayer){
        
        this.thePlayer = thePlayer; //this indicates we pulling name from private variable
    }

    public Player getPlayer() // when its a void don't write anything in ()
    {
          return thePlayer; //does not take anything from user 
    }  
    public void setCropData(CropData theCropData){
        this.theCropData = theCropData;
    }
    public CropData getCropData()
    {
        return theCropData;
    }

    //SETTERS AND GETTERS FOR ANIMAL LIST
    // Author: Amy Zuniga
    // Date: 11/23 
    public void setAnimal(ArrayList<ListItem> animal)
    {
        this.animal = animal;
    }
    
    public ArrayList<ListItem> getAnimal(){
        return animal;
    }

    //SETTERS AND GETTERS FOR TOOL LIST
    // Author: Jeremi Lynch
    // Date: 11/26
    public void setTool (ArrayList<ListItem> tool)
    {
        this.tool = tool;
    }
    
    public ArrayList<ListItem> getTool(){
        return tool;
    }
    //SETTERS AND GETTERS FOR Provision LIST
    // Author: Raylee Haws
    // Date: 11/26 
    public void setProvision (ArrayList<ListItem>provision)
    {
        this.provision = provision;
    }
    
    public ArrayList<ListItem> getProvision(){
        return provision;
    }

}
 

