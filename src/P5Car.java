/**
 * Created by - on 19/3/2017.
 */
public class P5Car {
    private String model;
    private String engine;
    private String colour;
    private int doors;
    private int brakes;

    public void setModel(String model) {
        if ( model.equals("carrera") || model.equals("commodore") )
        {
            this.model=model;
        }
        else {
            this.model = "Unknown";
        }
    }
    public String getModel() {
        return this.model;
    }
}
