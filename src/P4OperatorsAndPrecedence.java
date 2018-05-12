/**
 * Created by - on 18/3/2017.
 */
public class P4OperatorsAndPrecedence {
    public static void main(String[] args) {
        //Assignments return value of assignment(right hand value).
        int age = 21;
        //this says incompatible types, because if expects boolean but
        //the expression returns an integer due to assignment expression
        //if( age = 21 )
        // System.out.println("age="+age);
        boolean isCar = false;
        //Below executes fine even though expression is assignment, because expression returns
        //true after assignment. We mistyped double equals with single equals in if's
        //condition and it got accepted fine
        if (isCar = true)
            System.out.println("This is a car");

    }
}
