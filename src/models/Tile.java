package models;

/**
 * Created by samuelhaggmyr on 2017-04-19.
 */
public class Tile {
    public String getType() {
        return type;
    }

    public String type;

    public void setType(String type) {
        this.type = type;
    }

    public Tile(){
        type = new String("");
    }

}
