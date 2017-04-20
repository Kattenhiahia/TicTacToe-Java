package models;

/**
 * Created by samuelhaggmyr on 2017-04-19.
 */
public class Game {
    public String Player1;
    public String Player2;
    public Grid grid;

    public Game(){
        Player1 = new String("");
        Player2 = new String("");
        grid = new Grid();
    }
}
