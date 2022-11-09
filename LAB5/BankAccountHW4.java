public class BankAccountHW4 {
    private double balance;
    public BankAccountHW4()
    {balance=0;}
    public BankAccountHW4(double initBalance)
    {balance=initBalance;}
    public void deposit(double amount){balance=balance+amount;}
    public void withdraw(double amount){balance=balance-amount;}
    public double getBalance(){return balance;}
    public void addInterest(double rate){balance=balance+(balance*(rate/100));}


    }


