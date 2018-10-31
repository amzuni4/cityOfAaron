/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.*;
import cityofaaron.CityOfAaron;
/**
 *
 * @author admin
 */
public class GameControl 
{
    public static void createNewGame(String _name)
    {        
        
       CityOfAaron cityOfAaron = new CityOfAaron();
       
    // Create a new Game object.
    Game game = new Game();
    // Create the player object and set the name
    Player player = new Player();
    player.setName(_name);
    
    // save reference to the player object in the game
    game.setPlayer(player);
    
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
    
    //when all is done, save a reference to the Game object
    cityOfAaron.setGame(game);

}
}

