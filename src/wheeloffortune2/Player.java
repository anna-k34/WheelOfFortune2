/*
Wheel of Fortune Game
ICS4U Final project
Player class
 */
package wheeloffortune2;

import java.util.Objects;

public class Player {

    //encapsulation of attributes
    String username;
    int highscore;
    int spinsLeft;

    /**
     * Primary constructor that creates a Player with a username
     *
     * @param username the string the user enters
     */
    public Player(String username) {
        this.username = username;
    }

    /**
     * Secondary constructor that creates a Player with a username, highscore,
     * and number of spins left
     *
     * @param username that user enters
     * @param highscore that will be continuously updated and then the final
     * will be sorted in the highscore screen
     * @param spinsLeft number of rounds left user has to play
     */
    public Player(String username, int highscore, int spinsLeft) {
        this.username = username;
        this.highscore = highscore;
        this.spinsLeft = spinsLeft;
    }

    /**
     * Accessor that returns the username of the Player that the user enters
     *
     * @return username of player as String
     */
    public String getUsername() {
        return username;
    }

    /**
     * Mutator that sets the username of the Player that the user enters
     *
     * @param username of player
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * accessor that returns the number of spins the user has left in their game
     *
     * @return integer of spins left
     */
    public int getSpinsLeft() {
        return spinsLeft;
    }

    /**
     * Mutator that sets the number of spins the user has left in their game
     *
     * @param spinsLeft number of spins left
     */
    public void setSpinsLeft(int spinsLeft) {
        this.spinsLeft = spinsLeft;
    }

    /**
     * Accessor that returns the highscore of the user/how much money they make
     *
     * @return int of how much user won
     */
    public int getHighscore() {
        return highscore;
    }

    /**
     * Mutator that sets the highscore of the user/how much money they make
     *
     * @param highscore of how much money user made
     */
    public void setHighscore(int highscore) {
        this.highscore = highscore;
    }
    /**
     * cloning method that creates an identical player
     * @return identical player
     */
    public Player clone() {
        Player p = new Player(username, highscore, spinsLeft);
        return p;
    }
    /**
     * method to check for the equality of the Player and another Player
     * @param p Player to check equality with
     * @return whether Players are identical or not
     */
     public boolean equals(Player p) {
        return (p.username.equalsIgnoreCase(username) && p.highscore==highscore && p.spinsLeft==spinsLeft);
    }
    
    /**
     * To string method that returns formatted output
     *
     * @return output that will be put into the file when saved
     */
    public String toString() {
        return username + "\n" + highscore;
    }

}
