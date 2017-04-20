/**
 * Created by samuelhaggmyr on 2017-04-19.
 */
public class Controller {
    public Model model;

    public Controller(Model model){
        this.model = model;
    }
    public void itsSomething(){
        model.something();
    }

}
