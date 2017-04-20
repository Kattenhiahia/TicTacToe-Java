import models.*;
/**
 * Created by samuelhaggmyr on 2017-04-19.
 */
public class Controller {
    public boolean playerOneTurn = false;  //Used to determine if it is player Ones or player Twos turn
    public Game game;

    public Controller(){
        game = new Game();
    }
    
}
