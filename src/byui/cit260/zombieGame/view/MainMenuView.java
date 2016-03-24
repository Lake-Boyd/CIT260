/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.control.GameControl;
import java.util.IllegalFormatException;
import java.util.Scanner;
import zombiegame.ZombieGame;

/**
 *
 * @author Boyd
 */
public class MainMenuView extends View {

    public MainMenuView(){
    super("\n"
            + "\n++++++++++++++++++++++++++++++++++++++"
            + "\n+  Main Menu                          "
            + "\n++++++++++++++++++++++++++++++++++++++"
            + "\nN - Start New Game"
            + "\nL - Load Game"
            + "\nH - Help"
            + "\nS - Save Game"
            + "\nD - Test Double Number Exception"
            + "\nQ - Quit"
            + "\n++++++++++++++++++++++++++++++++++++++"
     );
    }
    private boolean promptMessage;

    public MainMenuView(String message) {
        super (message);
    }


    
    @Override
    public boolean doAction(String value) throws IllegalFormatException {
    
      try {  
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value){
            
            case "N"://create and start a new game
                this.startNewGame();
                break;
            
            case "L"://get and start existing game
               this.loadGame();
               break;
               
            case "H"://get help
                this.displayHelpMenu();
                break;
                
            case "S"://save the current game
                this.saveGame();
                break;
                
                case "D"://save the current game
                this.callDoubleNumber();
                break;
 
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
      
            }
 
        }
      catch 
          (IllegalFormatException me){
           System.out.println(me.getMessage());
         }
          return false;     
        
    }


    private void startNewGame() {
 
        //create new game 
        GameControl.createNewGame(ZombieGame.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
           
    }

    private void loadGame() {

        System.out.println("\n*** loadGame function called");    
    
    }

    private void displayHelpMenu() {

       
     HelpMenuView helpMenuView = new HelpMenuView();
 
     
        helpMenuView.displayHelpMenuView();
     
       // System.out.println(helpMenuView);    
  
    
    }

    private void saveGame() {


        System.out.println("\n*** saveGame function called");  

    }

    private void callDoubleNumber() {
        
        System.out.println("\n*** callDoubleNumber function called");
        DoubleFormat doubleNumber = new DoubleFormat();
        doubleNumber.getDoubleNumber();
    }


    
}