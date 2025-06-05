package wheeloffortune2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author annak
 */
public class Player {
    String username;
    int highscore;

    public Player(String username) {
        this.username = username;
    }

    public Player(String username, int highscore) {
        this.username = username;
        this.highscore = highscore;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getHighscore() {
        return highscore;
    }

    public void setHighscore(int highscore) {
        this.highscore = highscore;
    }

    public String toString() {
        return username + "\n" + highscore;
    }
        
    
}
