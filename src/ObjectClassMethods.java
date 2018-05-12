import java.util.GregorianCalendar;

/**
 * Created by - on 20/3/2017.
 */
//1.clone
//2.equals
//3.finalize
//4.getClass
//5.hashCode
//6.notify
//7.notifyAll
//8.toString
//9.wait

public class ObjectClassMethods  extends Object {
    public static void main(String[] args) {
        // create a gregorian calendar, which is an object
        GregorianCalendar cal = new GregorianCalendar();

        // clone object cal into object y
//protected Object clone():creates a copy of the object where references may not be the same.
//A object is cloneable only if the class implements Cloneable Interface
        GregorianCalendar y = (GregorianCalendar) cal.clone();

        // print both cal and y
        System.out.println("" + cal.getTime());
        System.out.println("" + y.getTime());

        System.out.println(cal.getClass());
        System.out.println(y.getClass());
//boolean equals(Object): x.equals(y) method returns true only if both the references x and y
//refer to the same object i.e., x==y. This is true if x and y are both of objects of class Object
//If we override a equals() method then we must override the hashCode() method also which states that equal objects
// must have equal hash codes.
//Default implementation of equals() class provided by java.lang.Object
// compares memory location and only return true if two reference variable are pointing to
// same memory location i.e. essentially they are same object.
// Many classes in Java standard library does override it e.g. String overrides equals,
// whose implementation of equals() method return true if content of two String objects
// are exactly same.
        System.out.println(cal.equals(y)); //returns true since both have same time stored
        Integer int1 =  new Integer(50);
        Integer int2 =  new Integer(50);
        //returns true since both store same value 50.This is because equals() method of
        //Integer class is overriding the equals method of Object checks for value stored
        //in objects for equality rather than comparing merely object references.
        System.out.println(int1.equals(int2));
        //returns false since both references are different.
        System.out.println(int1 == int2);
//protected void finalize(): Method called by GC when there are no references to the
// object exists in the program.Programmer can use this method to dispose off system resources
//or to perform some clean up operations.

// java.lang.Object.getClass(): object that represents the runtime class of this object.
//This Class object is the object that is locked by static synchronized methods
//of the represented class.
        //prints class java.lang.Integer
        System.out.println(int1.getClass());
        //Class<? extends Integer> c=int1.getClass();

//public int hashCode():The java.lang.Object.hashCode() method returns a hash code value
// for the object. This method is supported for the benefit of hash tables such as those
// provided by java.util.Hashtable.
        System.out.println(cal.hashCode());
        System.out.println(int1.hashCode()); //prints 50
        System.out.println(int2.hashCode()); //prints 50

//public final void notify():The java.lang.Object.notify() wakes up a single thread that is
// waiting on this object's monitor.

//void notifyAll():The java.lang.Object.notifyAll() wakes up all threads that are waiting
// on this object's monitor.
// A thread waits on an object's monitor by calling one of the wait methods.

// String toString():The java.lang.Object.toString() method returns a string representation
// of the object. In general, the toString method returns a string that "textually
// represents" this object. The result should be a concise but informative representation
// that is easy for a person to read.

// void wait():This method causes the current thread to wait until another thread invokes
// the notify() method or the notifyAll() method for this object.

    }
}
