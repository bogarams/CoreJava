/**
 * Created by - on 18/3/2017.
 */
public class P2FloatAndDouble {
    public static void main(String[] args)
    {
        System.out.println("********************************");
        //A decimal number appearing at right hand side is always assumed to be double by default.
        //A float value has single precision and occupies 32 bits
        int myIntValue=5;
        float myFloatValue = 5.2f;
        //float myFloatValue1 = 5.2; //throws an error that a double cannot be assigned to a float.
        //A double value has double precision and occupies 64 bits
        //Compelling reasons for double: A double is faster in modern computers, it has a large precision of 16 decimals, internal java math functions
        // uses double data type.
        double myDoubleValue= 5d;
        //PRINTS 5
        System.out.println("myIntValue="+myIntValue);
        //prints 5.0
        System.out.println("myFloatValue="+myFloatValue);
        //prints 5.0
        System.out.println("myDoubleValue="+myDoubleValue);
        System.out.println("********************************");
        int resultI=myIntValue/2;
        float resultF=myFloatValue/2;
        double resultD=myDoubleValue/2;
        //PRINTS 2 as it ignores the handling of remainder
        System.out.println("resultI="+resultI);
        //prints 2.5 as it handles the remainder
        System.out.println("resultF="+resultF);
        //prints 2.5 as it handles the remainder
        System.out.println("resultD="+resultD);
        System.out.println("********************************");
        resultI=myIntValue/3;
        resultF=myFloatValue/3f;
        resultD=myDoubleValue/3d;
        //PRINTS 1 as it ignores the handling of remainder
        System.out.println("resultI="+resultI);
        //prints 1.6666666 (7 decimals) as it is single precision and handles the remainder
        System.out.println("resultF="+resultF);
        //prints 1.6666666666666667 (16 decimals) as it is a double precision and handles the remainder
        System.out.println("resultD="+resultD);
        System.out.println("********************************");
        int noOfPounds=200;
        float noOfKilos=0.45359237f * noOfPounds;
        System.out.println("Number of Kilos="+noOfKilos);
        System.out.println("********************************");
        //We can use underscores to make double values more readable
        double phi=3.141_59;
        System.out.println("Phi="+phi);
    }
}
