import java.util.Observable;
import java.util.Observer;

import models.*;


/**
 * Created by samuelhaggmyr on 2017-04-19.
 */
public class Model extends Observable {
    public boolean playerOneTurn = false;  //Used to determine if it is player Ones or player Twos turn
    public Game game;

    public Model() {
        game = new Game();
    }
    public void something(){
        System.out.println("In something tha model");
        setChanged();
        notifyObservers();
    }
}
