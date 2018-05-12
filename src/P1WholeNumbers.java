/**
 * Created by - on 1/2/2017.
 */
public class P1WholeNumbers {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        System.out.println("********************************");
        //Byte data type width is 8 bits
        //If we are using whole numbers between -128 to 127 then use byte to store integer
        //value in less space than integer data type
        byte minByteInt=-128; //Min int value
        byte maxByteInt=127; //Max int value
        System.out.println("Min byte value:"+minByteInt);
        System.out.println("Max byte value:"+maxByteInt);
        System.out.println("********************************");
        System.out.println("********************************");
        //Short data type width is 16 bits
        short minShortInt=-32768; //Min int value
        short maxShortInt=32767; //Max int value
        System.out.println("Min short value:"+minShortInt);
        System.out.println("Max short value:"+maxShortInt);
        System.out.println("********************************");
        System.out.println("********************************");
        //Int data type width is 32 bits
        //A whole number appearing at right hand side is always assumed to be int by default in Java.
        int minInt=-2147483648; //Min int value
        int maxInt=2147483647; //Max int value
        System.out.println("Min Int value:"+minInt);
        System.out.println("Max Int value:"+maxInt);
        //Since java 7, we can put underscores in the int literals for readability.
        minInt=-2_147_483_648; //Min int value
        maxInt=2_147_483_647; //Max int value
        System.out.println("Min Int value:"+minInt);
        System.out.println("Max Int value:"+maxInt);
        System.out.println("********************************");
        System.out.println("********************************");
        //Long data type width is 64 bits
        long minLongInt=-9_223_372_036_854_775_808L; //Min long value
        //We can use either lower case letter 'l' or upper case letter 'L'to denote a long
        //literal, prefer upper case as the lower case letter looks more like a number one.
        long maxLongInt=9_223_372_036_854_775_807L; //Max long value
        System.out.println("Min Long value:"+minLongInt);
        System.out.println("Max Long value:"+maxLongInt);
        System.out.println("********************************");
        System.out.println("********************************");
        //Whole number expressions are treated by default as integer data type values.
        // When assigning whole number expressions to variables of short or byte , an explicit
        //casting to respective data type is required.
        byte result = (byte) (maxByteInt/2); //If we dont cast it then Throws a compilation error
        // that an integer value cannot be assigned to byte value(incompatible types)
        System.out.println(result);
        System.out.println("********************************");

    }
}
