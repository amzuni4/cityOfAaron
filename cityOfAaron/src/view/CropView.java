// Source code for the CropView class
// The HelpMenuView class is a member of the view layer
// Methods in the  HelpMenuVeiw class manage the user view
// Author: Amy Zuniga, Raylee Haws, Jeremi Llynch
// Date Last modified: 11/5
// ==============================================================
package view;
import model.*;

import control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;
import exceptions.CropException;

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
 
 

    

// The buyLandView method
 // Purpose: interface with the user input for buying land
// Parameters: none
 // Returns: none
 //Author: Brother DeBry
 public static void buyLandView()
 {
     // Get the cost of land for this round.
     int landPrice = CropControl.calcLandCost();

     // Prompt the user to enter the number of acres to buy
     System.out.format("Land is selling for %d bushels per acre.%n",landPrice);
    

    //  Get the user’s input and save it.
    int acresToBuy;
    boolean paramsNotOkay;
    do{
        paramsNotOkay = false;
        System.out.println("\nHow many acres of land you wish to buy?");
        acresToBuy = keyboard.nextInt();
        try
        {
           CropControl.buyLand(acresToBuy, landPrice,  cropData);
        }
        catch(CropException e)
        {
            System.out.println("I am sorry master, I cannot do this.");
            System.out.println(e.getMessage());
            paramsNotOkay = true;
        }
    } while(paramsNotOkay);
 }
    
// The sellLandView method
 // Purpose: interface with the user input for buying land
// Parameters: none
 // Returns: none
 //Author: Amy Zuniga last update 11.29
     
 
 public static void sellLandView()
 {
     // Get the cost of land for this round.
     int landPrice = CropControl.calcLandCost();

     // Prompt the user to enter the number of acres to sell
     System.out.format("Land is selling for %d bushels per acre.%n",landPrice);
   

    //  Get the user’s input and save it.
    int acresToSell;
    boolean paramsNotOkay;
    do{
        paramsNotOkay = false;
        System.out.println("\nHow many acres do you wish to sell?");
        acresToSell = keyboard.nextInt();
        try{
            CropControl.sellLand(landPrice, acresToSell, cropData);
        }
        catch(CropException e)
        {
            System.out.println("I am sorry my master, I cannot do this.");
            System.out.println(e.getMessage());
            paramsNotOkay = true;
        }
    } while (paramsNotOkay);
    
}
// The plantCropsView method
// Purpose: interface with the user input for planting crops
// Parameters: none
// Returns: none
 //Author: Amy Zuniga 10/20/ 2018 and Jeremi Lynch 11/29/2018
public static void plantCropsView(CropData cropData) {
        //get acres owned by the player and wheat in store
        int acres = cropData.getAcresOwned(); 
        int wheat = cropData.getWheatInStore();
        //display
        System.out.format("You own %d acres of land.%n", acres); 
        System.out.format("There are %d bushels of wheat in store.%n", wheat);
        
        boolean paramsOkay = true;
        
        do {
            try {
                //ask user how many bushels of wheat they would like to plant
                System.out.print("How many acres would you like to plant?");
                //get input
                int landToPlant = keyboard.nextInt();
                
                if (landToPlant > acres) {
                    throw new CropException("Cannot Plant on more land than Possessed");
                }
                
                if (wheat < 0) {
                    throw new CropException("Cannot Plant without any wheat");
                }
                //plant the crops
                CropControl.plantCrops(landToPlant, cropData); 
             }
            catch (CropException e) {
                System.out.println(e.getMessage());
                paramsOkay = true;
            }
        } while (paramsOkay); 
}

//  // Source code for the HelpMenuView class
//// The HelpMenuView class is a member of the view layer
//// Methods in the  HelpMenuVeiw class manage the user view
//// Author: Raylee Haws 11/29 edited Amy Zuniga 12/4

  public static void feedPeopleView(CropData cropData) {
        //get amount of wheat in store
        int wheat = cropData.getWheatInStore();
        //display wheat in store to user
        System.out.format("There are %d bushels of wheat in store.%n", wheat);
        
        boolean ok = true;
        do {
            try {
                //ask user how much wheat to feed the people
                System.out.print("How much wheat would you like to give to the people?");
                //get input
                int wheatForPeople = keyboard.nextInt(); 
                
                if (wheatForPeople < 0) {
                    throw new CropException("Cannot Feed People Negative Amount of Wheat");
                }
                
                if (wheatForPeople > wheat) {
                    throw new CropException("Cannot Feed People More Wheat than Possessed");
                }
                
                //give to the people
                CropControl.feedPeople(wheatForPeople, cropData);
                ok = false;
            }
            catch (CropException e) {
                System.out.println(e.getMessage());
                ok = true;
            }
        } while (ok);
        
         
        
    } 
  
  // The cropReportView method()
// Purpose: displays all of the pertinent data from the CropData class
// Parameters: none
// Returns: none
// Author: Amy Zuniga
// Date Modified: December 11, 2018
  public static void cropReportView()
  {
      //ropData cd = new CropData();
          System.out.println("Display the Year Number: " +  cropData.getYear());
       
          System.out.println("Display the number of People who starved: " + cropData.getNumberWhoDied());
       
          System.out.println("Display the amount of new individuals in the city: " + cropData.getNewPeople());
          
          System.out.println("Display the current population: " + cropData.getNewPeople());
          
          System.out.println("Get the number of acres of crop land owned by the city: " + cropData.getAcresOwned());
         
          System.out.println("Get the number of bushels per acre in this year's harvest: " + cropData.getCropYield());
          
          System.out.println("Get the number of bushels harvested : " + cropData.getHarvest());
        
          System.out.println("Display the number of bushels of wheat in store: " + cropData.getWheatInStore());
          
  }




// The runCropView method()
// Purpose: runs the methods to manage the crops game
// Parameters: none
// Returns: none
public static void runCropView()
{
    //call the cropReportView
    // by Amy Zuniga 12/11
    cropReportView();
    // call the buyLandView( ) method
    buyLandView();
    //call the sellLandView by Amy Zuniga 11.30
    sellLandView();
    //call the feedPeopleView by Amy Zuniga 12.4
   feedPeopleView(cropData);
   //call plantCropsView by Amy Zuniga 12/4
   plantCropsView(cropData);
   
}
}

