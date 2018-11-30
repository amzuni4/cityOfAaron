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
     System.out.print("\nHow many acres of land do you wish to buy? "); 

    //  Get the user’s input and save it.
    int acresToBuy;
    boolean paramsNotOkay;
    do{
        paramsNotOkay = false;
        System.out.println("\nHow many acres do you wish to buy?");
        acresToBuy = keyboard.nextInt();
        try
        {
           CropControl.buyLand(acresToBuy, landPrice, acresToBuy, acresToBuy, cropData);
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
     System.out.print("\nHow many acres of land do you wish to sell? "); 

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


//
//  // Source code for the HelpMenuView class
//// The HelpMenuView class is a member of the view layer
//// Methods in the  HelpMenuVeiw class manage the user view
//// Author: Raylee Haws
// 
// public static void feedPeopleView() throws CropException
//         
// {
//     // Get the needed number of bushels from the user.
//     int neededNumOfBushels = CropControl.feedPeople(0, cropData);
//     
//     //Prompt the user to write in the number of bushels they want to set aside to feed the people.
//     System.out.format("How many bushels of grain do you want to set aside to feed people?%\n" + neededNumOfBushels);
//     System.out.println("Here is how many of Bushels of wheat you need to feed people\n"); 
//     
//     // Get the user's input and save.
//     neededNumOfBushels = keyboard.nextInt();
//     int remainingWheat;
//     remainingWheat = CropControl.plantCrops(neededNumOfBushels, cropData);
//     int bushelsSetAside;
//     bushelsSetAside = remainingWheat;
//
//     // Call the feedPeople() method in the control layer.
//     CropControl.feedPeople(neededNumOfBushels, cropData);
//     
//     // output how much wheat is set aside to feed the people with.
//     System.out.format("You now have %d bushels of wheat to feed people. ", cropData.getWheatForPeople());
//     
// }
// 
// 
//  
// // The displayCropsReport method()
//// Purpose: runs the methods to display crops report
//// Parameters: none
//// Returns: none
//
//// The runCropView method()
//// Purpose: runs the methods to manage the crops game
//// Parameters: none
//// Returns: none
//public static void runCropView()
//{
//    // call the buyLandView( ) method
//    buyLandView( );
//        



//    // add calls to the other crop view methods
//    sellLandView();
//    feedPeopleView(cropData);
    plantCropsView(cropData);
    //displayCropsReport();
}

   public static class game {

       public static void setCropData(CropData cropData) {
           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       }

       public game() {
       }
    }
}
