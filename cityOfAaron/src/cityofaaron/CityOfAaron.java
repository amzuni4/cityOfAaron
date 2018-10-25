/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 *  Team members: Amy Zuniga, Jeremi Lynch, Raylee Haws
 */
package cityofaaron;
import model.*; //calling everything in model

/**
 *
 * @author admin
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Player player = new Player();
        
        player.setName("Amy");
        
        Game game = new Game();
        game.setPlayer(player);
       System.out.println(TeamMember.MEMBER1.getName()+ "-" + TeamMember.MEMBER1.getTitle()); 
    }
    
   
}