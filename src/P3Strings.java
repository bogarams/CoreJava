/**
 * Created by - on 18/3/2017.
 */
public class P3Strings {
    public static void main(String[] args) {
        //There are 8 primitive data types in Java:
        //byte,short,int,long,float,double,char,boolean
        //There is a class data type called String too which is not primitive.
        //String is a sequence of characters.
        String myString="This is String";
        //String can accept unicode characters too.
        int year = 2017;
        myString = myString + ". \u00A9 "+ year;
        System.out.println(myString);
    }
}
