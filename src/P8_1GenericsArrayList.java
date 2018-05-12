import java.util.ArrayList;

/**
 * Created by - on 9/4/2017.
 */
public class P8_1GenericsArrayList {
    public static void main(String[] args) {
        //Generics are introduced with JAva 1.5
        //Below raw type declaration is still supported for backwards compatibility
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        //ArrayList is a generic class which accepts any type of data. While inserting data
        //it is a good practice to pass a datatype as parameter.
        //al.add("string"); //, this will cause an exception(cannot cast to Integer) at run
        // time in function printDouble because this function expects all members to be
        // integer type.
        al.add(5);
        printDouble(al);

        //Declaring array list as a parameterized type
        //ArrayList<Integer> al2 =  new ArrayList<Integer>(); //till java 1.6, , must parameter
        //type at right hand side too as empty <> (diamond operator is not supported)
        ArrayList<Integer> al1 =  new ArrayList<>();//Since java 1.7 no need to include
        //type parameter at right hand side else we get a warning
        al1.add(1);
        //al1.add("string"); //this will cause program not to compile because we declared
        //al1 as Integer type
        printDouble(al1);

    }

    private static void printDouble(ArrayList n)
    {
        for(Object i : n){
            System.out.println((Integer) i*2);
        }
    }
}
