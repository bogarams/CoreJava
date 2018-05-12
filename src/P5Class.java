/**
 * Created by - on 19/3/2017.
 */
public class P5Class {
    public static void main(String[] args) {
        P5Car porsche = new P5Car();
        porsche.setModel("922");
        System.out.println("Model of the car is : "+porsche.getModel());
        porsche.setModel("carrera");
        System.out.println("Model of the car is : "+porsche.getModel());
    }
}
