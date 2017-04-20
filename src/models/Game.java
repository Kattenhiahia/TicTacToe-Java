package models;

/**
 * Created by samuelhaggmyr on 2017-04-19.
 */
public class Game {
    public String getPlayer2() {
        return Player2;
    }

    public void setPlayer2(String player2) {
        Player2 = player2;
    }

    public String getPlayer1() {

        return Player1;
    }

    public void setPlayer1(String player1) {
        Player1 = player1;
    }

    public String Player1;
    public String Player2;
    public Grid grid;

    public Game(){
        Player1 = new String("");
        Player2 = new String("");
        grid = new Grid();
    }

}
