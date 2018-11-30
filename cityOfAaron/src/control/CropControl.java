// The CropControl class - part of the control layer
// class contains all of the calculation methods for managing the crops
// Author: Amy Zuniga, Jeremi Lynch, Raylee Haws, Brother DeBry
// Date last modified: May 2018
//-------------------------------------------------------------

package control;
import exceptions.CropException;
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
//Updated 11/29 Amy Zuniga

    public static void sellLand(int landPrice, int acresToSell, CropData cropData) throws CropException
    {
    //if acresToSell < 0, return -1
        if(acresToSell < 0)
            throw new CropException("A negative value was input");

    //if acresToSell > acresOwned, return -1
        int owned = cropData.getAcresOwned();
        if(acresToSell > owned)
           throw new CropException("There's insufficient wheat to sell this much land");

    //acresOwned = acresOwned - acresToSell
    owned -= acresToSell;
    cropData.setAcresOwned(owned);
    

    //wheatInStore = wheatInStore + acresToSell * landPrice
    int wheat = cropData.getWheatInStore();
    wheat += (acresToSell * landPrice);
    cropData.setWheatInStore(wheat);

    }
    
    // The buyLand method
// Purpose: To buy land
// Parameters:  the number of acres to buy, the price of land,
//the amount of wheat in storage, and a reference to a CropData object
// Returns: the number of acres owned after the land purchase
// Pre-conditions: acres to buy must be positive
// and <= the amount of wheat in store.
// Updated 11.29 by Amy Zuniga, Raylee Haws, Jeremi Lynch
public static void buyLand(int acresToBuy, int landPrice, int wheatInStore, int acresOwned, CropData cropData) throws CropException
{
   // If acresToBuy < 0, return -1;
    if(acresToBuy <0)
        throw new CropException("A negative value was input");
    
 int wheat = cropData.getWheatInStore();
    if(wheatInStore < (landPrice * acresToBuy))
        throw new CropException("There's insufficient wheat to buy this much land");
    // add the number of acresto buy to current number of acres
    acresOwned = cropData.getAcresOwned();
    acresOwned += acresToBuy;
    cropData.setAcresOwned(acresOwned);
    
    //deduct cost from wheat In store
    wheat = cropData.getWheatInStore();
    wheat -= (acresToBuy * landPrice);
    cropData.setWheatInStore(wheat);

}
  
    /**
 * Author: Amy Zuniga 10/20/2018 and Jeremi Lynch 11/29
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
    
    public static int feedPeople(int neededNumOfBushels, CropData cropData)
    {
            
            int remainingWheat;
            int bushelsSetAside;

   // If neededNumOfBushels < 0, return -1; invalid entry 
    if(neededNumOfBushels <0)
        return -1;
    // If wheatInStore < 0, return -1; 
    int wheatInStore = cropData.getWheatInStore();
    // If wheatInStore < neededNumOfBushels, return -1;
    if(wheatInStore < neededNumOfBushels)
        return -1;
     //remainingWheat = (wheatInStore - neededNumOfBushels)
     remainingWheat = (wheatInStore - neededNumOfBushels);
    //bushelsSetAside = neededNumOfBushels
     bushelsSetAside = neededNumOfBushels;
     cropData.setWheatInStore(wheatInStore);
     //Save acresPlanted and remainingWheat;
     
    //returns remaining wheat
     return remainingWheat;
     
}


    

public static int setOffering( int harvest, int percentageForOffering, CropData cropData )
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


