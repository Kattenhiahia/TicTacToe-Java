/**
 * Created by samuelhaggmyr on 2017-04-17.
 */
import javax.swing.*;
public class Main {

    public static void main (String args[]){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(final Exception e){
            /*Do nothing*/
        }
        Controller controller = new Controller();
        new View(controller);
    }

}
