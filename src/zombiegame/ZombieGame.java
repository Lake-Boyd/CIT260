/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiegame;
//
import byui.cit260.zombieGame.model.InventoryItem;
import byui.cit260.zombieGame.model.Map;
import byui.cit260.zombieGame.model.Player;
import byui.cit260.zombieGame.model.Thug;
import byui.cit260.zombieGame.model.Weapon;
import byui.cit260.zombieGame.model.Zombie;
import byui.cit260.zombieGame.model.Game;
import byui.cit260.zombieGame.model.MainCharacter;
import byui.cit260.zombieGame.model.NPC;
import byui.cit260.zombieGame.model.ConversationScene;
import byui.cit260.zombieGame.model.Scene;
import byui.cit260.zombieGame.model.Location;
import byui.cit260.zombieGame.model.NormalScene;
import byui.cit260.zombieGame.view.StartProgramView;

/**
 * @author Evanator
 */
public class ZombieGame {
    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;
    
    public static int xCoordinate = 0;//initial player X coordinate
    public static int yCoordinate = 0;//initial player Y coordinate
    public static int radioListenCount = 0;    

    
    
     public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        ZombieGame.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ZombieGame.player = player;
    }
  
    public static void main(String[] args) {
       
        //create startProgramview origin - display start program view
        StartProgramView startProgramView = new StartProgramView();
        
        try{ 
       
        startProgramView.displayStartProgramView();
        
            }
       
        catch (Throwable te){
            
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.displayStartProgramView();
        }
        
    }

   
}
