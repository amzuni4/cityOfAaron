/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 *  Team members: Amy Zuniga, Jeremi Lynch, Raylee Haws
 */
package cityofaaron;
import model.*; //calling everything in model
//import model.CropData;
import model.ListItem;

 import java.io.Serializable;
import view.*;
/**
 *
 * @author admin
 */
public class CityOfAaron implements Serializable {
      //variable for keeping a reference to the Game object
        private static Game theGame = null;
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenu(); //inherits the display menu from the MainMenu class
        
         
                 
        
    
        Player player = new Player(); //new instance for Player
         player.setName("Amy"); //pulling team member
        Game game = new Game();
        game.setPlayer(player); 
        System.out.println("Name: " + game.getPlayer().getName()); //game = the new instance; getPlayer is from function in player class
                                                                  //runs game and the get player and retrieve getName since its a string
       System.out.println(TeamMember.MEMBER1.getName()+ ": " 
               + TeamMember.MEMBER1.getTitle()); 
       
    //    theGame.setMap(theMap); //we havent set map ye

        
       
       
       
       
        
       
       //code by Amy:
       
       CropData cropData = new CropData(); //new instance of cropData variable
             cropData.setYear(2994);
             cropData.setPopulation(3500);
             cropData.setAcresOwned(102);
             cropData.setCropYield(3440);
             cropData.setWheatInStore(500);
             cropData.setNumberWhoDied(8000);
             cropData.setNewPeople(8000);
             cropData.setHarvest(800);
             cropData.setWheatForFood(400);
             cropData.setAcresPlanted(400);
             cropData.setWheatForPeople(500);
                     
                                           //returns a string from function
             System.out.println("Year: " + cropData.getYear()+ " Shire Reckoning");
             System.out.println("Population: " + cropData.getPopulation() + " Hobbits");
             System.out.println( "Acres Owned: " + cropData.getAcresOwned() + " Acres");
             System.out.println( "Crop Yield: " + cropData.getCropYield() + " Acres");
             System.out.println("Wheat In Store: " + cropData.getWheatInStore() + "lbs " );
             System.out.println("Number Who Died: " + cropData.getNumberWhoDied() + " Orcs died" );
             System.out.println("New People: " + cropData.getNewPeople()+ " Rangers");
             System.out.println("Harvest: " + cropData.getHarvest()+ " Plants" );
             System.out.println("Wheat for Food: " + cropData.getWheatForFood() +" Bushels");
             System.out.println("Set Acres Planted: " + cropData.getAcresPlanted() + " Acres");
             System.out.println("Set Wheat For People: " + cropData.getWheatForPeople() + "lbs");
             
             //code by Raylee: ListItem Testing
//            
//            ListItem tool = new ListItem(); //new instance for ListItem
//             tool.setName("Hammer");
//             tool.setNumber(5);
//             System.out.println("Tool: " + tool.getName()+ " Quantity: " + tool.getNumber());
//    
    

    }
    
    
            public static void setGame( Game game ) {
         theGame = game;
   }

        
        public static Game getGame()
     {
         return theGame;
     }
        
       
}