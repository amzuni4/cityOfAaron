// Source code for the HelpMenuView class
// The HelpMenuView class is a member of the view layer
// Methods in the  HelpMenuVeiw class manage the user view
// Author: Amy Zuniga
// Date Last modified: 11/5
// ==============================================================
package view;
import model.*;

import control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

/**
 *
 * @author admin
 */
public class CropView {

 // Create a Scanner object
 private static Scanner keyboard = new Scanner(System.in);   
     
 // Get references to the Game object and the CropData object
 static private Game game = CityOfAaron.getGame();
 static private CropData cropData = game.getCropData();

    
//// private static Scanner keyboard = new Scanner(System.in);   
////     Game game = new Game();
////     CityOfAaron  cityOfAaron1 = new CityOfAaron();
////  Get references to the Game object and the CropData object
//// static private Game game = cityOfAaron1.getGame();
//// static private CropData cropData = game.getCropData();
 
// The buyLandView method
 // Purpose: interface with the user input for buying land
// Parameters: none
 // Returns: none
 public static void buyLandView()
 {
     // Get the cost of land for this round.
     int landPrice = CropControl.calcLandCost();

     // Prompt the user to enter the number of acres to buy
     System.out.format("Land is selling for %d bushels per acre.%n",landPrice);
     System.out.print("\nHow many acres of land do you wish to buy? "); 

    //  Get the user’s input and save it.
    int acresToBuy;
    int wheatInStore = cropData.getWheatInStore();
    int acresOwned = cropData.getAcresOwned();
   
   
    acresToBuy = keyboard.nextInt();

    // Call the buyLand( ) method in the control layer to buy the land
    CropControl.buyLand(acresToBuy, landPrice, wheatInStore, acresOwned, cropData);
    

     // output how much land we now own
     System.out.format("You now own %d acres of land. ", cropData.getAcresOwned());

}
 
 
 public static void sellLandView()
 {
     // Get the cost of land for this round.
     int landPrice = CropControl.calcLandCost();

     // Prompt the user to enter the number of acres to buy
     System.out.format("Land is selling for %d bushels per acre.%n",landPrice);
     System.out.print("\nHow many acres of land do you wish to sell? "); 

    //  Get the user’s input and save it.
    int acresToSell;
    acresToSell = keyboard.nextInt();

    // Call the buyLand( ) method in the control layer to buy the land
    CropControl.sellLand( landPrice, acresToSell, cropData);
    

     // output how much land we now own
     System.out.format("You now own %d acres of land. ", cropData.getAcresOwned());

}
 
 public static void feedPeopleView()
 {
     // Get the needed number of bushels from user.
     int neededNumOfBushels = CropControl.feedPeople(0, 0, 0, cropData);

     // Prompt the user to enter the number of bushels
     System.out.format("How many bushels of grain do you want to set aside to feed the people?%n" + neededNumOfBushels);
     System.out.println("Here is how many of Bushels of wheat you need to feed people\n"); 

    //  Get the user’s input and save it.
    neededNumOfBushels = keyboard.nextInt();
    int remainingWheat = CropControl.plantCrops(neededNumOfBushels, cropData);
    int bushelsSetAside = remainingWheat;
    // Call the buyLand( ) method in the control layer to buy the land
    CropControl.feedPeople(neededNumOfBushels, remainingWheat,  bushelsSetAside, cropData);
    

     // output how much land we now own
     System.out.format("You now have %d bushels of wheat to feed people. ", cropData.getWheatForPeople());

}
 
  public static void plantCropsView()
 {
     // Get the amount of acres to plant
     int acresToPlant = CropControl.plantCrops(0, cropData);

     // Prompt the user to enter the number of bushels
     System.out.format("How many acres of land do you want to plant?%n",acresToPlant);
     System.out.print("\nThis is how many acres you want planted: "); 

    //  Get the user’s input and save it.
    acresToPlant = keyboard.nextInt();

    // Call the plantCrops( ) method in the control layer to buy the land
    CropControl.plantCrops(acresToPlant, cropData);
    

     // output how much land we now own
     System.out.format("Here are the number of acres that can be planted: ", cropData.getWheatForPeople());

}
 
//  public static void displayCropsReportView(){
//    //get the crop Report for the user
//    int 
//}

 
 
// The runCropView method()
// Purpose: runs the methods to manage the crops game
// Parameters: none
// Returns: none
public static void runCropView()
{
    // call the buyLandView( ) method
    buyLandView( );
        

    // add calls to the other crop view methods
    sellLandView();
    feedPeopleView();
    plantCropsView();
  //  displayCropsReport();
  
    // as they are written
}
}
