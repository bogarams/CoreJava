/**
 * Created by - on 19/3/2017.
 */
public class P6Account {
    private double account_number;
    private double balance;
    private String customer_name;
    private String email;
    private String mobile_number;

    //Constructor initialises the state of an object.Constructor has same name as class.
    // Has no return type. Can be overloaded. Below is the default constructor
    // (Java creates one if we dont explicitly create it).
    public P6Account(){
        System.out.println("Default/Empty Constructor is called.");
        //A constructor can call other constructor with this method.
       // this((999999999,0.0d,"default","default","default");
    }

    //This is the constructor with parameters. It is always a good practice to not call
    //any other methods (like setters for example) within a constructor (as the class
    // will still be in initialisation stage).
    public P6Account(double account_number, double balance, String customer_name, String email, String mobile_number) {
        System.out.println("Constructor with parameters is called.");
        this.account_number = account_number;
        this.balance = balance;
        this.customer_name = customer_name;
        this.email = email;
        this.mobile_number = mobile_number;
    }

    public void setAccount_number(double account_number) {
        this.account_number = account_number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public double getAccount_number() {
        return account_number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void deposit(double amount){
        System.out.println("Your current balance was:"+balance);
        this.balance += amount;
        System.out.println("Your new balance is:"+balance);
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("No sufficient balance in the account.");
            System.out.println("Your current balance is:" + balance);
        } else {
            System.out.println("Your current balance is:" + balance);
            this.balance -= amount;
            System.out.println("Your new balance is:" + balance);
        }
    }
}
