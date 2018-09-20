import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    public Account(){
        this.id=0;
        this.balance=0;
        annualInterestRate=0;
        dateCreated=new Date();
    }

    public Account(int id, double balance){
        this.id=id;
        this.balance=balance;
        dateCreated=new Date();
    }

    public Date getDateCreated() {
        return dateCreated;
    }


    public static double getAnnualInterestRate() {

        return annualInterestRate;
    }

    public  void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public double getMonthyInterestRate(){

        annualInterestRate/=100;
        return annualInterestRate/12;
    }
    public double getMonthyInterest(){

        return this.balance*getMonthyInterestRate();
    }
    public void withdraw(double amount){
        this.setBalance(this.balance-amount);
    }
    public void deposit(double amount){
        this.setBalance(this.balance+amount);
    }

}
