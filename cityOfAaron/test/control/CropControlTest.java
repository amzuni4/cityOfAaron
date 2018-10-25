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
        cropData.setAcresOwned(2800);
        
        int landPrice = 20;
        int acresToSell = 10;
        int expResult = 2790;
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
       
        
        int acresToBuy = 30;
        int landPrice = 10;
        int wheatInStore = 500;
        int acresOwned = 30;
                
        int expResult = 330;
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
        int wheatInStore = 30;
        int acresOwned = 50;
                
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
       
        
        int acresToBuy = 3;
        int landPrice = 20;
        int wheatInStore = 5;
        int acresOwned = 1;
                
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
       
        
        int acresToBuy = 30;
        int landPrice = 0;
        int wheatInStore = 900;
        int acresOwned = 100;
                
        int expResult = 100;
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
       
        
        int acresToBuy = 2;
        int landPrice = 1;
        int wheatInStore = 2;
        int acresOwned = 1;
                
        int expResult = 3;
        int result = CropControl.buyLand(acresToBuy, landPrice, wheatInStore, acresOwned, cropData);
        assertEquals(expResult, result);
    }
    
    
    
    
   
/**
     * Test of plantCrops method, of class CropControl.
     * Author: Amy Zuniga
     * Test Case 1
     */
    
     @Test
    public void testPlantCrops1() {
        System.out.println("plantCrops -  Test Case 1");
        CropData cropData = new CropData();
        
        
        int acresToPlant = 10;
        int acresOwned = 20;
        int thePopulation = 150;
        int currentBushels = 50;
               
        int expResult = 8;
        
        int result = CropControl.plantCrops(acresToPlant, acresOwned, thePopulation, currentBushels, cropData);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of plantCrops method, of class CropControl.
     * Author: Amy Zuniga
     * Test Case 2
     */
    
     @Test
    public void testPlantCrops2() {
        System.out.println("plantCrops -  Test Case 1");
        CropData cropData = new CropData();
        
        
        int acresToPlant = 10;
        int acresOwned = 5;
        int thePopulation = 6;
        int currentBushels = 5;
               
        int expResult = -1;
        
        int result = CropControl.plantCrops(acresToPlant, acresOwned, thePopulation, currentBushels, cropData);
        assertEquals(expResult, result);
        
    }
    
    
        /**
     * Test of plantCrops method, of class CropControl.
     * Author: Amy Zuniga
     * Test Case 3
     */
    
     @Test
    public void testPlantCrops3() {
        System.out.println("plantCrops -  Test Case 1");
        CropData cropData = new CropData();
        
        
        int acresToPlant = 3;
        int acresOwned = 20;
        int thePopulation = 5;
        int currentBushels = 0;
               
        int expResult = -1;
        
        int result = CropControl.plantCrops(acresToPlant, acresOwned, thePopulation, currentBushels, cropData);
        assertEquals(expResult, result);
        
    }
    
        /**
     * Test of plantCrops method, of class CropControl.
     * Author: Amy Zuniga
     * Test Case 4
     */
    
     @Test
    public void testPlantCrops4() {
        System.out.println("plantCrops -  Test Case 1");
        CropData cropData = new CropData();
        
        
        int acresToPlant = 10;
        int acresOwned = 10;
        int thePopulation = 120;
        int currentBushels = 34;
               
        int expResult = 8;
        
        int result = CropControl.plantCrops(acresToPlant, acresOwned, thePopulation, currentBushels, cropData);
        assertEquals(expResult, result);
        
    }
    
        /**
     * Test of plantCrops method, of class CropControl.
     * Author Amy Zuniga
     * Test Case 5
     */
    
     @Test
    public void testPlantCrops5() {
        System.out.println("plantCrops -  Test Case 1");
        CropData cropData = new CropData();
        
        
        int acresToPlant = 0;
        int acresOwned = 10;
        int thePopulation = 5;
        int currentBushels = 7;
               
        int expResult = 0;
        
        int result = CropControl.plantCrops(acresToPlant, acresOwned, thePopulation, currentBushels, cropData);
        assertEquals(expResult, result);
        
    }
}