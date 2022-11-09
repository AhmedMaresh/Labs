public class timeDepositAccountHW7 {
    private double rate;

    private double balance;

    public timeDepositAccountHW7( double balance,double rate) {
        this.rate = rate;
        this.balance = balance;
    }

    public double getBalance(){return balance;}

    public void addInterest(){
        balance=balance+(balance*(rate/100));
    }

    public void withdraw(){balance=0;}
}
