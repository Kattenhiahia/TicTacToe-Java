/**
 * Created by samuelhaggmyr on 2017-04-17.
 */
import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class Main {
    public static void main (String args[]){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(final Exception e){
            /*Do nothing*/
        }
        Model model = new Model();
        Controller controller = new Controller(model);
        View view = new View(controller);
        model.addObserver(view);

    }

}
