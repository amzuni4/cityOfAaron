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
public class CityOfAaron {
    
    // variable for keeping a reference to the Game object
    private static Game theGame;
    public static Game getGame() {
        return theGame;
    }

    public static void setGame(Game _theGame) {
        theGame = _theGame;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            // main function - entry point for the program
            // runs the main menu
            MainMenuView mmv = new MainMenuView();
            mmv.displayMenu();
            
    }
    
}