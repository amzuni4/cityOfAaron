// Source code for the ListMenuView class
// The ListMenuView class is a member of the view layer
// Methods in the  ListMenuVeiw class manage the user view
// Author: Amy Zuniga, Jeremi Lynch, Week 10; Raylee Haws up until week 10
// Date Last modified: 11/16
// ==============================================================
package view;

import cityofaaron.CityOfAaron;
import control.GameControl;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import model.Game;
import model.ListItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class ListMenuView extends MenuView {

    private Game game = CityOfAaron.getGame();
// The ListMenuView constructor
    // Purpose: Initialize the menu data
    // Parameters: none
// Returns: none
// ===================================

    public ListMenuView() {
        super("\n"
                + "**********************************\n"
                + "* CITY OF AARON: LIST MENU VIEW  *\n"
                + "**********************************\n"
                + " 1 - List the animals in the storehouse\n"
                + " 2 - List the tools in the storehouse\n"
                + " 3 - List the provisions in the storehouse\n"
                + " 4 - List the developers of this game\n"
                + " 5 - Back to Main Menu",
                5);
    }

// The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    @Override
    public void doAction(int option) {
        switch (option) {
            case 1: // calls listAnimals function
                listAnimals();
                break;
            case 2: // calls a ListTools function
                listTools();
                break;
            case 3: // calls list provisions
                listProvisions();
                break;
            case 4: // save game
                listTeam();
                break;
            case 5:
                System.out.println("Return to Main Menu.");
        }
    }

    // The listAnimals method
    // Purpose: Shows the user a list of the animals in the storehouse from GameControl
    // Parameters: none
    // Returns: none
    //Author: Amy Zuniga
// Date Modified: Nov 26, 2018
    // ===================================
    public void listAnimals() {
        System.out.println("View List of Animals in Storehouse");
        // get the reference to the game object that has beens stored in the CityOfAaron class.
// Save the reference in the variable “game"
        Game game = CityOfAaron.getGame();

// Now use this game object to get a reference to the animal list
        ArrayList<ListItem> animal = game.getAnimal();

        for (int i = 0; i < game.getAnimal().size(); i++) {

            //}
            System.out.println(game.getAnimal().get(i).getName() + " " + game.getAnimal().get(i).getNumber());
        }
        System.out.println("\nWrite the List of Animals to a file");
        ListMenuView.outPutListAnimals();

    }

//      The outputListAnimals method
//  Purpose: Shows the user a list of the animals in the storehouse from GameControl
//  Parameters: none
//  Returns: none
// Author: Amy Zuniga
// Date Modified: Nov 26, 2018
//  ===================================
    public static void outPutListAnimals() {
        Scanner keyboard = new Scanner(System.in);
        //  declare a string to hold the file name
        // prompt the user for a file name, get and save the user’s input
        String filePath;

        System.out.println("Please enter file name for the list of Animals ending in .txt: ");
        filePath = keyboard.next();
        // declare a reference to a PrintWriter,ln  object (opens a new file print writer prints in a certain wya
        try (PrintWriter out = new PrintWriter(filePath);) {

            String heading1 = "Animal";
            String heading2 = "Number";
            out.printf("%-15s %15s %n\n", heading1, heading2);
            out.println("-------------------------------");
            Game game = CityOfAaron.getGame();
            ArrayList<ListItem> animal = game.getAnimal();
            for (int i = 0; i < game.getAnimal().size(); i++) {
                out.printf("%-15s %15s %n", game.getAnimal().get(i).getName(), game.getAnimal().get(i).getNumber());

            }

        } catch (IOException e) {
            //output error message
            System.out.println("File Error");
        }

    }
    // The listTools method
    // Purpose: Shows the user a list of the tools in the storehouse
    // Parameters: none
    // Returns: none
    // ===================================

    public void listTools() {
        System.out.println("View List of Tools in Storehouse");
        Game game = CityOfAaron.getGame();
        ArrayList<ListItem> tool = game.getTool();
        for (int i = 0; i < tool.size(); i++) {

            System.out.println(tool.get(i).getName() + " " + tool.get(i).getNumber());
        }
    }

//      The outputListTools method
//  Purpose: Shows the user a list of the animals in the storehouse from GameControl
//  Parameters: none
//  Returns: none
// Author: Jeremi Lynch
// Date Modified: Dec 8, 2018
//  ===================================
    public static void outPutListTools() {
        //fill in for 12/8 assignment
    }

    // The listProvisions method
    // Purpose: Shows the user a list of the provisions in the storehouse
    // Parameters: none
    // Returns: none
    // ===================================
    public void listProvisions() {
        System.out.println("View List of Provisions in Storehouse");
        Game game = CityOfAaron.getGame();
        ArrayList<ListItem> provision = game.getProvision();
        for (int i = 0; i < provision.size(); i++) {
            System.out.println(provision.get(i).getName() + " " + provision.get(i).getNumber());
        }

    }

    //      The outputListTools method
//  Purpose: Shows the user a list of the animals in the storehouse from GameControl
//  Parameters: none
//  Returns: none
// Author: Raylee Haws
// Date Modified: Dec 8, 2018
//  ===================================
    public static void outPutListProvisions() {
        //fill in for 12/8 assignment
    }

    // The listTeam method
    // Purpose: Shows the user a list of the developers of this game
    // Parameters: none
    // Returns: none
    // ===================================
    public void listTeam() {
        System.out.println("View List of Developers of the Game");

        Game game = CityOfAaron.getGame();
        ArrayList<ListItem> developer = game.getDeveloper();
        for (int i = 0; i < developer.size(); i++) {
            System.out.println(developer.get(i).getName() + " " + developer.get(i).getNumber());
        }
        System.out.println("\nWrite the team member list to a file");
        ListMenuView.outPutListTeam();

        
    }

    //      The outputListTools method
//  Purpose: Shows the user a list of the animals in the storehouse from GameControl
//  Parameters: none
//  Returns: none
// Author: Amy Zuniga
// Date Modified: Dec 8, 2018
//  ===================================
    public static void outPutListTeam() {

        Scanner keyboard = new Scanner(System.in);
        //  declare a string to hold the file name
        // prompt the user for a file name, get and save the user’s input
        String filePath;

        System.out.println("Please enter file name for the list of Developers on the team ending in .txt: ");
        filePath = keyboard.next();
        // declare a reference to a PrintWriter,ln  object (opens a new file print writer prints in a certain wya
        try (PrintWriter out = new PrintWriter(filePath);) {

            String heading1 = "Name";
            String heading2 = "Number";
            out.printf("%-15s %15s %n", heading1, heading2);
            out.println("-------------------------------");
            Game game = CityOfAaron.getGame();
            ArrayList<ListItem> developer = game.getDeveloper();
            for (int i = 0; i < game.getDeveloper().size(); i++) {
                out.printf("%-15s %15s %n", game.getDeveloper().get(i).getName(), game.getDeveloper().get(i).getNumber());

            }

        } catch (IOException e) {
            //output error message
            System.out.println("File Error");
        }

    }
}
