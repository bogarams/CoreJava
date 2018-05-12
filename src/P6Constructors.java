/**
 * Created by - on 19/3/2017.
 */
public class P6Constructors {
    public static void main(String[] args) {
        //This statement calls a default constructor with no arguments.Java automatically creates
        //such constructor if we do not  create one ourselves.
        P6Account acc = new P6Account();
        acc.deposit(1000);
        acc.withdraw(1001);
        acc.withdraw(900);
        P6Account bobs_acc = new P6Account(999999999,0.0d,"default","default","default");
        System.out.println(bobs_acc.getCustomer_name());
    }
}
