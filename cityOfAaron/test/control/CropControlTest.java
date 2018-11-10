/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class CropControlTest {
    
    /**
     * Test of sellLand method, of class CropControl.
     */
    @Test
    public void testSellLand() {
       System.out.println("sellLand -  Test Case 1");
       CropData cropData = new CropData();
        cropData.setAcresOwned(2000);
        
        int landPrice = 10;
        int acresToSell = 0;
        int expResult = 2000;
        int result = CropControl.sellLand(landPrice, acresToSell, cropData);
        assertEquals(expResult, result);
    }

    
    
        
        /**
     * Test of buyLand method, of class CropControl.
     * Author: Amy Zuniga, Jeremi Lynch, Raylee Haws
     * Test 1
     */
    @Test
    public void testBuyLand1() {
       System.out.println("buyLand -  Test Case 1");
       CropData cropData = new CropData();
       
        
        int acresToBuy = 10;
        int landPrice = 20;
        int wheatInStore = 800;
        int acresOwned = 2800;
                
        int expResult = 2810;
        int result = CropControl.buyLand(acresToBuy, landPrice, wheatInStore, acresOwned, cropData);
        assertEquals(expResult, result);
    
}
        /**
     * Test of buyLand method, of class CropControl.
     * Author: Amy Zuniga, Jeremi Lynch, Raylee Haws
     * Test 2
     */
    @Test
    public void testBuyLand2() {
       System.out.println("buyLand -  Test Case 2");
       CropData cropData = new CropData();
       
        
        int acresToBuy = -5;
        int landPrice = 20;
        int wheatInStore = 800;
        int acresOwned = 2800;
                
        int expResult = -1;
        int result = CropControl.buyLand(acresToBuy, landPrice, wheatInStore, acresOwned, cropData);
        assertEquals(expResult, result);
    
}
    /**
     * Test of buyLand method, of class CropControl.
     * Author: Amy Zuniga, Jeremi Lynch, Raylee Haws
     * Test 3
     */
    
     @Test 
    public void testBuyLand3() {
       System.out.println("buyLand -  Test Case 2");
       CropData cropData = new CropData();
       
        
        int acresToBuy = 3000;
        int landPrice = 20;
        int wheatInStore = 800;
        int acresOwned = 2800;
                
        int expResult = -1;
        int result = CropControl.buyLand(acresToBuy, landPrice, wheatInStore, acresOwned, cropData);
        assertEquals(expResult, result);
    
}
    
    /**
     * Test of buyLand method, of class CropControl.
     * Author: Amy Zuniga, Jeremi Lynch, Raylee Haws
     * Test 4
     */
    
     @Test 
    public void testBuyLand4() {
       System.out.println("buyLand -  Test Case 2");
       CropData cropData = new CropData();
       
        
        int acresToBuy = 40;
        int landPrice = 20;
        int wheatInStore = 800;
        int acresOwned = 2000;
                
        int expResult = 2040;
        int result = CropControl.buyLand(acresToBuy, landPrice, wheatInStore, acresOwned, cropData);
        assertEquals(expResult, result);
    }

    
    
    /**
     * Test of buyLand method, of class CropControl.
     * Author: Amy Zuniga, Jeremi Lynch, Raylee Haws
     * Test 5
     */
    
     @Test 
    public void testBuyLand5() {
       System.out.println("buyLand -  Test Case 2");
       CropData cropData = new CropData();
       
        
        int acresToBuy = 0;
        int landPrice = 20;
        int wheatInStore = 800;
        int acresOwned = 2000;
                
        int expResult = 2000;
        int result = CropControl.buyLand(acresToBuy, landPrice, wheatInStore, acresOwned, cropData);
        assertEquals(expResult, result);
    }

    /**
     * Test of plantCrops method, of class CropControl.
     * Author: Amy Zuniga
     * Test Case 1 : returns remaining wheat
     */
    @Test
    public void testPlantCrops1() {
        System.out.println("plantCrops -  Test Case 1");
        CropData cropData = new CropData();
       
        
        int acresToPlant = 5;
        int expResult = 28;
       
        cropData.setAcresOwned(20); 
        cropData.setPopulation(150);
        cropData.setWheatInStore(25);
        
        int result = CropControl.plantCrops(acresToPlant, cropData);
        
        System.out.println(result);
        assertEquals(expResult, result);
        //System.out.println(result);
}
    /**
     * Test of plantCrops method, of class CropControl.
     * Author: Amy Zuniga
     * Test Case 2 : remaining wheat
     */
     @Test
    public void testPlantCrops2() {
        System.out.println("plantCrops -  Test Case 1");
        CropData cropData = new CropData();
        
        
        int acresToPlant = 10;
        
        cropData.setAcresOwned(5); 
        cropData.setPopulation(6);
        cropData.setWheatInStore(5);
        int expResult = -1;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
}
    /**
     * Test of plantCrops method, of class CropControl.
     * Author: Amy Zuniga
     * Test Case 3 : remaining wheat
     */
     @Test
    public void testPlantCrops3() {
        System.out.println("plantCrops -  Test Case 1");
        CropData cropData = new CropData();
        
       int acresToPlant = 3;
       cropData.setAcresOwned(20); 
       cropData.setPopulation(5);
       cropData.setWheatInStore(0);
       int expResult = -1;
        
       int result = CropControl.plantCrops(acresToPlant, cropData);
       assertEquals(expResult, result);
  }
        /**
     * Test of plantCrops method, of class CropControl.
     * Author: Amy Zuniga
     * Test Case 4: returns remainingWheat
     */
     @Test
    public void testPlantCrops4() {
        System.out.println("plantCrops -  Test Case 1");
        CropData cropData = new CropData();
        
       int acresToPlant = 10;
       cropData.setAcresOwned(20); 
       cropData.setPopulation(100);
       cropData.setWheatInStore(34);
       int expResult = 39;
        
       int result = CropControl.plantCrops(acresToPlant, cropData);
       assertEquals(expResult, result);
       }
    
        /**
     * Test of plantCrops method, of class CropControl.
     * Author Amy Zuniga
     * Test Case 5 returns remaining wheat
     */
    
     @Test 
    public void testPlantCrops5() {
        System.out.println("plantCrops -  Test Case 1");
        CropData cropData = new CropData();
        
       int acresToPlant = 0;
       cropData.setAcresOwned(10); 
       cropData.setPopulation(5);
       cropData.setWheatInStore(7);
               
        int expResult = 7;
        
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        
    }
    /**
     * /**
     * Test of feedPeople method, of class CropControl.
     * Author: Raylee Haws
     * Test Case 1 : returns remaining wheat
     */
       @Test 
    public void testfeedPeople1() {
        System.out.println("feedPeople -  Test Case 1");
        CropData cropData = new CropData();
        
        
        int neededNumOfBushels = 7;
        cropData.setWheatInStore(10);
        int expResult = 3; 
        
        int result = CropControl.feedPeople(neededNumOfBushels,  cropData);
        assertEquals(expResult, result);
}
    /**
     * Test of feedPeople method, of class CropControl.
     * Author: Raylee Haws
     * Test Case 2 : returns remaining wheat
     */
     @Test 
    public void testfeedPeople2() {
        System.out.println("feedPeople -  Test Case 2");
        CropData cropData = new CropData();
        
        int neededNumOfBushels = 11;
        cropData.setWheatInStore(2);
        int expResult = -1;
        
        int result = CropControl.feedPeople(neededNumOfBushels, cropData);
        assertEquals(expResult, result);
}
    
    /**
     * Test of feedPeople method, of class CropControl.
     * Author: Raylee Haws
     * Test Case 3 : returns remaining wheat
     */
    
    @Test 
    public void testfeedPeople3() {
        System.out.println("feedPeople -  Test Case 3");
        CropData cropData = new CropData();
        
        int neededNumOfBushels = -3;
        cropData.setWheatInStore(10);
        int expResult = -1;
        
        int result = CropControl.feedPeople(neededNumOfBushels,  cropData);
        assertEquals(expResult, result);
}
    
    /**
     * Test of feedPeople method, of class CropControl.
     * Author: Raylee Haws
     * Test Case 4 : returns remaining wheat
     */
    
    @Test 
    public void testfeedPeople4() {
        System.out.println("feedPeople -  Test Case 4");
        CropData cropData = new CropData();
        
        int neededNumOfBushels = 10;
        cropData.setWheatInStore(10);
        int expResult = 0;
        
        int result = CropControl.feedPeople(neededNumOfBushels, cropData);
        assertEquals(expResult, result);
}
    
    /**
     * Test of feedPeople method, of class CropControl.
     * Author: Raylee Haws
     * Test Case 5 : returns remaining wheat
     */
    
    @Test 
    public void testfeedPeople5() {
        System.out.println("feedPeople -  Test Case 5");
        CropData cropData = new CropData();
        
        int neededNumOfBushels = 0;
        cropData.setWheatInStore(10);
        int expResult = 10;
        
        
        int result = CropControl.feedPeople(neededNumOfBushels, cropData);
        assertEquals(expResult, result);
}
 

    /**
     * Test of setOffering method, of class CropControl.
     * Author Jeremi Lynch
     * Test Case 1 returns harvest - offering
     */
    
     @Test 
    public void setOffering1() {
        System.out.println("setOffering -  Test Case 1");
        CropData cropData = new CropData();
        
        
        int harvest = 100;
        int offering = 10;
        int expResult = 90;
       
        int result = CropControl.setOffering(harvest, offering, cropData);
        assertEquals(expResult, result);
        }
    /**
     * Test of setOffering method, of class CropControl.
     * Author Jeremi Lynch
     * Test Case 2 returns harvest - offering
     */
    
     @Test 
    public void setOffering2() {
        System.out.println("setOffering -  Test Case 1");
        CropData cropData = new CropData();
               
        int harvest = -100;
        int offering = 10;
        int expResult = -1;
        
        int result = CropControl.setOffering(harvest, offering, cropData);
        assertEquals(expResult, result);
        
    }
    /**
     * Test of setOffering method, of class CropControl.
     * Author Jeremi Lynch
     * Test Case 3 returns harvest - offering
     */
    
     @Test 
    public void setOffering3() {
        System.out.println("setOffering -  Test Case 1");
        CropData cropData = new CropData();
        
        
        int harvest = 100;
        int offering = 100;
        int expResult = -1;
        
        int result = CropControl.setOffering(harvest, offering, cropData);
        assertEquals(expResult, result);
        
    }
    /**
     * Test of setOffering method, of class CropControl.
     * Author Jeremi Lynch
     * Test Case 4 returns harvest - offering
     */
    
     @Test 
    public void setOffering4() {
        System.out.println("setOffering -  Test Case 1");
        CropData cropData = new CropData();
        
        int harvest = 100;
        int offering = 1;
        int expResult = 99;
        int result = CropControl.setOffering(harvest, offering, cropData);
        assertEquals(expResult, result);
 }
    /**
     * Test of setOffering method, of class CropControl.
     * Author Jeremi Lynch
     * Test Case 5 returns harvest - offering
     */
    
     @Test 
    public void setOffering5() {
        System.out.println("setOffering -  Test Case 1");
        CropData cropData = new CropData();
        
        int harvest = 100;
        int offering = 99;
        int expResult = 1;
        
        int result = CropControl.setOffering(harvest, offering, cropData);
        assertEquals(expResult, result);
    }
}
