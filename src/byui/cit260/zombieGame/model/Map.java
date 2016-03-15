/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.model;
import java.io.Serializable;

//
/**
 *
 * @author Boyd/Evan
 */


public class Map implements Serializable {
    
    private int distanceToDestination;
    private int distanceTraveled;
    private int playerXCoordinate;
    private int playerYCoordinate;
    private int noOfRows;
    private int noOfColumns;
    private Location[] [] locations;

    public Map() {
    }

    public Map(int noOfRows, int noOfColumns) {
       
     if (noOfRows < 1 || noOfColumns < 1){
        System.out.println("The number of rows and coloumns must be greater then zero");
        return;
     }   
        
     this.noOfRows = noOfRows;
     this.noOfColumns = noOfColumns;
     
     //create 2-D array for location objects
     this.locations = new Location[noOfRows][noOfColumns];
     
     for (int row = 0; row < noOfRows; row++) {
         for (int column = 0; column < noOfColumns; column++){
         //create and intialize new location object instance
         Location location = new Location();
         location.setColumn(column);
         location.setRow(row);
         location.setVisited(false);
         
         //assign the locationobject to the current postion in array
         locations [row] [column] = location;
     }
     } 
    }


public String buildMap(int num1, int num2){
  
        String[][] locationArray = null;
        locationArray = new String [3][7];
        locationArray[0][0] = "START";
        locationArray[1][0] = "SCHOOL";
        locationArray[2][0] = "FIRE STATION";
        
        locationArray[0][1] = "SPORTING GOODS STORE";
        locationArray[1][1] = "HOSPITAL";
        locationArray[2][1] = "CONVENIENCE STORE";
        
        locationArray[0][2] = "RESIDENTIAL LOT";
        locationArray[1][2] = "GROCERY STORE";
        locationArray[2][2] = "POLICE STATION";
        
        locationArray[0][3] = "BUS STATION";
        locationArray[1][3] = "PARK";
        locationArray[2][3] = "CITY HALL";
        
        locationArray[0][4] = "CONVENTION CENTER 1";
        locationArray[1][4] = "HOTEL";
        locationArray[2][4] = "APARTMENT BUILDING";
        
        locationArray[0][5] = "CONVENTION CENTER 2";
        locationArray[1][5] = "SHOPPING MALL";
        locationArray[2][5] = "CATHEDRAL";
        
        locationArray[0][6] = "REFUGEE CAMP 1";
        locationArray[1][6] = "REFUGEE CAMP 2";
        locationArray[2][6] = "ZOO";
        
        return locationArray[num1][num2];
}

public enum SceneType {
    
    start,
    fireStation,
    school,
    sportingGoodsStore,
    hospital,
    convienceStore,
    lot,
    groceryStore,
    policeStation,
    busStation,
    park,
    cityHall,
    conventionCenter1,
    hotel,
    apartmentBuilding,
    conventionCenter2,
    shoppingMall,
    cathedral,
    zoo,
    refugeeCamp1,
    refugeeCamp2;
 
    

    
}


public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
    

    public int getDistanceToDestination() {
        return distanceToDestination;
    }

    public void setDistanceToDestination(int distanceToDestination) {
        this.distanceToDestination = distanceToDestination;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public int getPlayerXCoordinate() {
        return playerXCoordinate;
    }

    public void setPlayerXCoordinate(int playerXCoordinate) {
        this.playerXCoordinate = playerXCoordinate;
    }

    public int getPlayerYCoordinate() {
        return playerYCoordinate;
    }

    public void setPlayerYCoordinate(int playerYCoordinate) {
        this.playerYCoordinate = playerYCoordinate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.distanceToDestination;
        hash = 71 * hash + this.distanceTraveled;
        hash = 71 * hash + this.playerXCoordinate;
        hash = 71 * hash + this.playerYCoordinate;
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "distanceToDestination=" + distanceToDestination + ", distanceTraveled=" + distanceTraveled + ", playerXCoordinate=" + playerXCoordinate + ", playerYCoordinate=" + playerYCoordinate + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.distanceToDestination != other.distanceToDestination) {
            return false;
        }
        if (this.distanceTraveled != other.distanceTraveled) {
            return false;
        }
        if (this.playerXCoordinate != other.playerXCoordinate) {
            return false;
        }
        if (this.playerYCoordinate != other.playerYCoordinate) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
    
    
    
}
