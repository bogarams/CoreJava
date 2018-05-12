/**
 * Created by - on 19/3/2017.
 */
public class P7VipCustomer extends Object {
    private String customerName;
    private double creditLimit;
    private String customerEmail;

    public P7VipCustomer(){
        this("default",10000,"default");
    }

    public P7VipCustomer(String customerName, double creditLimit){
        this(customerName,creditLimit,"default");
    }

    public P7VipCustomer(String customerName, double creditLimit, String customerEmail ){
        this.customerName=customerName;
        this.creditLimit=creditLimit;
        this.customerEmail=customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
