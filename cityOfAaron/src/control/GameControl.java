// Source code for the ListMenuView class
// The ListMenuView class is a member of the view layer
// Methods in the  GameControl class manage the user view
// Author: Amy Zuniga, Jeremi Lynch
// Date Last modified: 11/20
package control;

import model.*;
import cityofaaron.CityOfAaron;
import model.Location;
import java.util.ArrayList;
import model.Game;
/**
 *
 * @author admin
 */
public class GameControl 
{
    private static Game game = new Game();
    // size of the Locations array
   private static final int MAX_ROW = 5;
    private static final int MAX_COL = 5;
    

    public static void createNewGame(String _name)
    {        
      Map theMap = new Map();
    CropData cropData = new CropData();
    // Create the player object and set the name
    Player player = new Player();
    player.setName(_name);
    
    // save reference to the player object in the game
    game.setPlayer(player);
    
    //Animal List Items
    //calls in createAnimalList to main menu
    // written by Amy Zuniga
    // Nov 23, 2018
    createAnimalList();
    }
    
    // method prologue ….
    public static void createCropDataObject()
    {
        
    //create and initialize a CropData object
    CropData cropData = new CropData();
    
    //Save a reference to it in the Game Object
    cropData.setPopulation(100);
    cropData.setNewPeople(5);
    cropData.setCropYield(3);
    cropData.setNumberWhoDied(0);
    cropData.setWheatInStore(2700);
    cropData.setAcresOwned(1000);
    cropData.setAcresPlanted(1000);
    cropData.setHarvest(3000);
    cropData.setAcresPlanted(1000); 
        
    game.setCropData(cropData); 
    }
    // The createMap method
    // Purpose: creates the location objects and the map
    // Parameters: none
    // Returns: none
    public static void createMap()   
    {
        // create the Map object, it is 5 x 5
        // refer to the Map constructor
        Map theMap = new Map(MAX_ROW, MAX_COL);
        
 // create a string that will go in the Location objects
// that contain the river
String river = "\nYou are on the River. The river is the source" +
                      "\nof life for our city. The river marks the eastern " +
                      "\nboundary of the city - it is wilderness to the East.";

// create a new Location object
Location loc = new Location();

// use setters in the Location class to set the description and symbol
loc.setDescription(river);
loc.setSymbol("~~~");  

// set this location object in each cell of the array in column 4      
for(int i = 0; i < MAX_ROW; i++)
 {
        theMap.setLocation(i, 4, loc);
        
 }

// define the string for a The village location
 String theVillage = "\nYou are in the village." +
 "\nThe city is full of fun and exciting visitor favorites." +
 "\nAny and all vistors may be required to plant the crops, in our fields," + 
 "\nduring the spring months."; 

 // set the village location with a hint
 loc = new Location();
 loc.setDescription(theVillage + "\nWelcome to the Village");
 loc.setSymbol("###");
 
 for(int i = 0; i < MAX_ROW; i++)
 theMap.setLocation(0, 1, loc);


// define the string for a farm land location
 String farmland = "\nYou are on the fertile banks of the River." +
 "\nIn the springthis low farmland floods and is covered with rich" +
 "\nnew soil. Wheat is planted as far as you can see."; 

 // set a farmland location with a hint
 loc = new Location();
 loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
 loc.setSymbol("!!!");
 
 for(int i = 0; i < MAX_ROW; i++)
 theMap.setLocation(0, 2, loc);
 
 // define the string for a desert location
 String desert = "\nYou are on the barren desert." +
 "\nIn the the desert is rainy and is covered with sage" +
 "\nbrush. Tumbleweeds will get in the way of your wagons, during the windy season."; 

 // set a desert location with a hint
 loc = new Location();
 loc.setDescription(desert + "\nWelcome to the Calavada Dessert.");
 loc.setSymbol("***");
 
 for(int i = 0; i < MAX_ROW; i++)
 theMap.setLocation(0, 3, loc);
 
 // define the string for a The Ruler's Court location
 String rulersCourt = "\nYou have reached the Ruler's court." +
 "\nExplore select places of The Ruler's Court" +
 "\nand get to know your judges,";

 // set the Ruler's Court location with a hint
 loc = new Location();
 loc.setDescription(rulersCourt + "\nOne bushel will plant two acres of wheat.");
 loc.setSymbol("---");
 
 for(int i = 0; i < MAX_ROW; i++)
 theMap.setLocation(0, 5, loc);
 
 //you need to call the setMap() method.
// Use the static variable game that I asked you to declare at the class level.

  game.setMap(theMap);
 }
// The createAnimalList method
    // Purpose: creates the array that lists the animals
    // Parameters: string, int
    // Returns:animal
    // Author: Amy Zuniga
    // Date Modified: 11/21 & 11/23
    
    
 public static void createAnimalList()
    {
        ArrayList<ListItem> animal = new ArrayList<>();
        
        animal.add(new ListItem("Cows", 122));
        animal.add(new ListItem("Horses", 222));
        animal.add(new ListItem("Pigs", 30));
        animal.add(new ListItem("Goats", 80));
      
        //save the animals into a game
        game.setAnimal(animal);
       
    }
 
// The showAnimalList method
    // Purpose: Displays the array list of animals
    // Returns: void
    // Author: Amy Zuniga
    // Date Modified: 11/26
    public static void showAnimalList(){
         System.out.println("Show List Of Animals: ");
         ArrayList<ListItem> animal = game.getAnimal();
         
         for(ListItem item : animal){
             System.out.println(item.getName() + ": " + item.getNumber());
         }
    }
 
 
    }
    
    
    
