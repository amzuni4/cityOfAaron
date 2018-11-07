// The CropControl class - part of the control layer
// class contains all of the calculation methods for managing the crops
// Author: Amy Zuniga, Jeremi Lynch, Raylee Haws, Brother DeBry
// Date last modified: May 2018
//-------------------------------------------------------------

package control;
import java.util.Random;
import model.CropData;
/**
 *
 * @author admin
 */

//This function creates the random number
public class CropControl {
    
    //constants
    private static final int LAND_BASE = 17;
    private static final int LAND_RANGE = 10;
    //random number generator
    private static Random random = new Random();
    
    // calcLandCost() method
    // Purpose: Calculate a random land price between 17 and 26 bushels/acre
    // Parameters: none
    // Returns: the land cost
    public static int calcLandCost()
    {
        int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;  
        return landPrice;            
    }
    
      
// The sellLand method
// Purpose: To sell land
// Parameters: the price of land, the number of acres to sell, and
//    a reference to a CropData object
// Returns: the number of acres owned after the sale
// Pre-conditions: acres to sell must be positive
// and <= acresOwned
// Author: Brother DeBry

    public static int sellLand(int landPrice, int acresToSell, CropData cropData)
    {
    //if acresToSell < 0, return -1
        if(acresToSell < 0)
            return -1;

    //if acresToSell > acresOwned, return -1
        int owned = cropData.getAcresOwned();
        if(acresToSell > owned)
            return -1;

    //acresOwned = acresOwned - acresToSell
    owned -= acresToSell;
    cropData.setAcresOwned(owned);
    

    //wheatInStore = wheatInStore + acresToSell * landPrice
    int wheat = cropData.getWheatInStore();
    wheat += (acresToSell * landPrice);
    cropData.setWheatInStore(wheat);
    //return acresOwned
    return owned;

    }
    
    // The buyLand method
// Purpose: To buy land
// Parameters:  the number of acres to buy, the price of land,
//the amount of wheat in storage, and a reference to a CropData object
// Returns: the number of acres owned after the land purchase
// Pre-conditions: acres to buy must be positive
// and <= the amount of wheat in store.

public static int buyLand(int acresToBuy, int landPrice, int wheatInStore, 
        int acresOwned, CropData cropData)
{
   // If acresToBuy < 0, return -1;
    if(acresToBuy <0)
        return -1;
 //If wheatInStore < (landPrice * acresToBuy), return -1;
    if(wheatInStore < (landPrice * acresToBuy))
        return -1;
//acresOwned = (acresOwned + acresToBuy)
     acresOwned = (acresOwned + acresToBuy);
    //wheatInStore = wheatInStore – (acresToBuy *  landPrice)
     wheatInStore = wheatInStore - (acresToBuy * landPrice);
     cropData.setWheatInStore(wheatInStore);
     cropData.setAcresOwned(acresOwned);
    //Return acresOwned;
     return acresOwned;
}
  
 /**
 * Author: Amy Zuniga
 * The "Plant the Crops" Method 
 * Purpose: 
 * Plant the Crops
 * Parameters: 
 * The number of acres to plant, the number of acres owned, the number of
 * population available to tend the acres, The current number of bushels of 
 * wheat, and a reference to the  CropData object.
 * Returns: 
 * The remaining amount of wheat in store and the the amount of acres planted.
 * Pre-Conditions: 
 * The number of acres to plant must be positive, and less than or equal to
 * the amount of acres owned. 
 * The population to tend the plants must be positive and less than or equal to
 * Ten times the number of acresToPlant 
 * The current number of bushels must be positive and greater than or equal to 
 * two times the number of acresToPlant 
 */

    public static int plantCrops(int acresToPlant, CropData cropData)
{
   // If acresToPlant < 0, return -1
        if(acresToPlant <0)
            return -1;
    //If acresToPlant > acresOwned, return -1
    int acresOwned = cropData.getAcresOwned();
     if (acresToPlant > acresOwned)
         return -1;
    //If thePopulation < acresToPlant * 10, return -1
    int thePopulation = cropData.getPopulation();
    if (thePopulation < acresToPlant * 10)
        return -1;
    //If currentBushels < acresToPlant * 2, return -1
    int currentBushels = cropData.getWheatInStore();
    if (currentBushels < acresToPlant * 2)
        return -1;

 // numOfBushels = acresToPlant / 2 
 int numOfBushels = acresToPlant / 2;
//remainingWheat = currentBushels – numOfBushels
int remainingWheat = currentBushels - numOfBushels;

//acresPlanted = acresToPlant;
int acresPlanted = acresToPlant;

//Save acresPlanted and remainingWheat;
cropData.setAcresPlanted(acresPlanted);
cropData.setWheatInStore(remainingWheat);

//Return acresPlanted and remainingWheat;
 return remainingWheat + acresPlanted; 


}

     /**
 * Author: Raylee Haws
 * The feedPeople Method 
 * Purpose: 
 * To set aside wheat to feed people
 * Parameters: 
 * The needed number of bushels,
 * the amount of wheat in store,
 * and a reference to the CropData object.
 * Returns: 
 * The remaining amount of wheat in store and the bushels set aside to feed the people.
 * Pre-Conditions: 
 * The needed number of bushels must be positive,
 * the wheat in store must be positive
 * and greater than the needed number of bushels. 
 */
    
    public static int feedPeople(int neededNumOfBushels, int remainingWheat, 
        int bushelsSetAside, CropData cropData)
{
   // If neededNumOfBushels < 0, return -1; invalid entry 
    if(neededNumOfBushels <0)
        return -1;
    // If wheatInStore < 0, return -1; 
    int wheatInStore = cropData.getWheatInStore();
    if(wheatInStore <0)
        return -1;
    // If wheatInStore < neededNumOfBushels, return -1;
    if(wheatInStore < neededNumOfBushels)
        return -1;
     //remainingWheat = (wheatInStore - neededNumOfBushels)
     remainingWheat = (wheatInStore - neededNumOfBushels);
    //bushelsSetAside = neededNumOfBushels
     bushelsSetAside = neededNumOfBushels;
     cropData.setWheatInStore(wheatInStore);
    //returns remaining wheat
     return remainingWheat;
     
}


    

public  int setOffering( int harvest, int percentageForOffering, CropData cropData )
{
  if(harvest < 0)
   return -1;
 if(percentageForOffering == 0)     
 return -1;
   if(percentageForOffering == 100)
return -1;
  int wheatInStore = cropData.getWheatInStore();
 wheatInStore = wheatInStore +(harvest - percentageForOffering);
 return wheatInStore;
}
}

